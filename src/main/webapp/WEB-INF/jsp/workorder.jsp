<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 13-5-6
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        $.extend($.fn.window.defaults, {
            collapsible: false,
            minimizable: false,
            maximizable: false,
            resizable: false,
            modal: true
        });
        $.extend($.fn.datagrid.defaults, {
            striped: true,
            rownumbers: true
        });
        function getRids(res, p) {
            p = p || 'rid';
            var ids = [];
            for (var i = 0; i < res.length; i++) {
                ids.push(res[i][p]);
            }
            return ids.join(',');
        }
        function getDictionaryName(dictionaryCode) {
            var data =${dataDictionaries};
            for (var i = 0; i < data.length; i++) {
                var re = data[i];
                if (re.dictionaryCode == dictionaryCode) {
                    return re.dictionaryName;
                }
            }
            return "";
        }
        $(function () {
            //查询
            $('#btn-query').click(function () {
                var workOrderTitle = $('#q_workOrderTitle').val();
                var projectName = $('#q_projectName').val();
                $('#grid').datagrid('load', {
                    projectName: projectName,
                    workOrderTitle: workOrderTitle
                });
            });

            //添加
            $('#btn-add').bind('click', function () {
                $('#add_ff').form('reset');
                $('#add_win').window('open');
            });

            $('#btn_add_win_cancel').click(function () {
                $('#add_win').window('close');
            });
            $('#btn_add_win_ok').click(function () {
                $('#add_ff').submit();
            });

            $('#add_ff').form({
                success: function (data) {
                    $('#add_win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //修改
            $('#btn-modify').bind('click', function () {
                var res = $('#grid').datagrid('getSelections');
                if (res.length == 1) {
                    $('#modify_ff').form('load', res[0]);
                    $('#modify_win').window('open');
                } else {
                    $.messager.alert('系统提示', '请选中一条!');
                }
            });

            $('#btn_modify_win_cancel').click(function () {
                $('#modify_win').window('close');
            });
            $('#btn_modify_win_ok').click(function () {
                $('#modify_ff').submit();
            });
            $('#modify_ff').form({
                success: function (data) {
                    $('#modify_win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //删除
            $('#btn-delete').click(function () {
                var res = $('#grid').datagrid('getSelections');
                if (res.length > 0) {
                    var rids = getRids(res, 'pId');
                    $.getJSON('workorder!delete.do', {rids: rids}, function () {
                        $.messager.alert('系统提示', '删除成功', '', function () {
                            $('#grid').datagrid('reload');
                        });
                    });
                } else {
                    $.messager.alert('系统提示', '请选中一些记录!');
                }
            });

            var editor = new UE.ui.Editor({
                initialFrameWidth: 700,
                initialFrameHeight: 160,
                minFrameHeight: 160,
                zIndex: 9000
            });
            editor.render("editor");
        });
    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'center'" style="padding:5px;background:#eee;">
    <table class="easyui-datagrid" id="grid"
           data-options="
           fit:true,
           url:'workorder!query.do',
           fitColumns:true,
           pagination:true,
           toolbar:'#tb',
           title:'工单管理'">
        <thead>
        <tr>
            <th data-options="field:'ck',checkbox:true"></th>
            <th data-options="field:'workOrderTitle'">工单标题</th>
            <th data-options="field:'reportUser'">填报人</th>
            <th data-options="field:'reportTime'">填报时间</th>
            <th data-options="field:'sponsorUser'">发起人</th>
            <th data-options="field:'acceptUser'">受理人</th>
            <th data-options="field:'confirmTime'">确认时间</th>
            <th data-options="field:'acceptTime'">受理时间</th>
            <th data-options="field:'checkReceiveTime'">验收时间</th>
        </tr>
        </thead>
    </table>
    <div id="tb">
        <%--查询--%>
        <div>
            标题:<input id="q_workOrderTitle" type="text"/>

            项目:<input id="q_projectName" type="text"/>
            <a class="easyui-linkbutton" id="btn-query" iconCls="icon-search" plain="true"></a>
        </div>
        <%--操作--%>
        <div>
            <a class="easyui-linkbutton" id="btn-add" plain="true">新增</a>
            <a class="easyui-linkbutton" id="btn-modify" plain="true">修改</a>
            <a class="easyui-linkbutton" id="btn-delete" plain="true">删除</a>
            <a class="easyui-linkbutton" plain="true">确认</a>
            <a class="easyui-linkbutton" plain="true">受理</a>
            <a class="easyui-linkbutton" plain="true">验收</a>
            <a class="easyui-linkbutton" plain="true">作废</a>
        </div>
    </div>
</div>
<div id="add_win" class="easyui-window" data-options="closed:true" title="添加"
     style="padding:5px;width: 800px;height: 500px;">
    <form id="add_ff" action="workorder!add.do" method="post">
        <table>
            <tr>
                <td>工单标题:</td>
                <td>
                    <input type="text">
                </td>
            </tr>
            <tr>
                <td>项目:</td>
                <td>
                    <input type="text">
                    <button>选择项目</button>
                </td>
            </tr>
            <tr>
                <td>发起人:</td>
                <td>
                    <input type="text"> 受理人: <input type="text"/>
                </td>
            </tr>
            <tr>
                <td>工单内容:</td>
                <td>
                    <script type="text/plain" id="editor" name="myContent">
                    </script>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <button type="submit">确定</button>
            <button type="submit">取消</button>
        </div>
    </form>
</div>
<div id="modify_win" class="easyui-window" data-options="closed:true" title="添加" style="padding:5px;">
    <form id="modify_ff" action="workorder!modify.do" method="post">
        <table>
            <input type="hidden" name="pId"/>
            <tr>
                <td>业务类型名:</td>
                <td>
                    <input type="hidden" name="businessTypeId">
                    <input name="businessTypeCode" class="easyui-combobox" required="true" data-options='
		valueField: "dictionaryCode",
		textField: "dictionaryName",
		data:${dataDictionaries},
		onSelect: function(rec){
            $("#add_ff :input[name=\"businessTypeId\"]").val(rec.ddId);
        }'/></td>
            </tr>
            <tr>
                <td>项目名称:</td>
                <td><input name="workorderName" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>备注:</td>
                <td><textarea name="remark"></textarea>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn_modify_win_ok" data-options="iconCls:'icon-ok'"
               href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn_modify_win_cancel" data-options="iconCls:'icon-cancel'"
               href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>
</body>
</html>