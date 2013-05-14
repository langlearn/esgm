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
            p = p || 'id';
            var ids = [];
            for (var i = 0; i < res.length; i++) {
                ids.push(res[i][p]);
            }
            return ids.join(',');
        }

        $(function () {
            //查询
            $('#btn-query').click(function () {
                var userName = $('#q-userName').val();
                var department = $('#q-department').val();
                var workTime = $('#q-workTime').datebox('getValue');
                $('#grid-west').datagrid('load', {
                    userName: userName,
                    department: department,
                    workTime: workTime
                });
            });

            //添加
            $('#btn-add').bind('click', function () {
                var re = $('#grid-west').datagrid('getSelected');
                if (null == re) {
                    return false;
                }
                $('#add-form').form('clear');
                $('#add-win').window('open');
            });

            $('#btn-add-win-cancel').click(function () {
                $('#add-win').window('close');
            });
            $('#btn-add-win-ok').click(function () {
                $('#add-form').submit();
            });

            $('#add-form').form({
                success: function (data) {
                    console.log(data);
                    $.messager.alert('系统提示', '添加成功', '', function () {
                        $('#add-win').window('close');
                        $('#grid-center').datagrid('reload');
                    });

                }
            });

            //修改
            $('#btn-modify').bind('click', function () {
                var res = $('#grid-center').datagrid('getSelections');

                if (res.length == 1) {

                    if (res[0].userId != ${optid}) {
                        $.messager.alert('系统提示', '不允许修改其他人的数据!');
                        return false;
                    }

                    $('#modify-form').form('load', res[0]);
                    $('#modify-win').window('open');
                } else {
                    $.messager.alert('系统提示', '请选中一条!');
                }
            });

            $('#btn-modify-win-cancel').click(function () {
                $('#modify-win').window('close');
            });
            $('#btn-modify-win-ok').click(function () {
                $('#modify-form').submit();
            });
            $('#modify-form').form({
                success: function (data) {
                    console.log(data);
                    $('#modify-win').window('close');
                    $('#grid-center').datagrid('reload');
                }
            });

            //删除
            $('#btn-delete').click(function () {
                var res = $('#grid-center').datagrid('getSelections');
                if (res.length > 0) {
                    if (res[0].userId != ${optid}) {
                        $.messager.alert('系统提示', '不允许删除其他人的数据!');
                        return false;
                    }

                    $.messager.confirm('删除', '你确定要删除这些记录吗?', function (r) {
                        if (r) {

                            var rids = getRids(res, 'wdId');
                            $.getJSON('workdiary!delete.do', {rids: rids}, function () {
                                $.messager.alert('系统提示', '删除成功', '', function () {
                                    $('#grid-center').datagrid('reload');
                                });
                            });

                        }
                    });

                } else {
                    $.messager.alert('系统提示', '请选中一些记录!');
                }
            });

            //点击侧边栏
            $('#grid-west').datagrid({
                onClickRow: function (index, data) {
                    $('#grid-center').datagrid('load', {
                        userId: data.userId,
                        workTime: data.workTime
                    });
                }
            });

        });
    </script>
</head>
<body class="easyui-layout">

<div data-options="region:'west',split:false,collapsible:false" style="padding:5px;background:#eee;width:350px">
    <table class="easyui-datagrid" id="grid-west"
           data-options="
           fit:true,url:'workdiary!query.do',
           fitColumns:true,
           singleSelect:true,
           pagination:true,
           toolbar:'#tb-west',
           title:'日志总览'">
        <thead>
        <tr>
            <th data-options="field:'userName',width:100">姓名</th>
            <th data-options="field:'workTime',width:100">工作时间</th>
            <th data-options="field:'totalHour',width:100">总工时</th>
        </tr>
        </thead>
    </table>
    <%--查询--%>
    <div id="tb-west">
        <div>部门:<input id="q-department" type="text"/></div>
        <div>姓名:<input id="q-userName" type="text"/></div>
        <div>时间:<input id="q-workTime" class="easyui-datebox"/>
            <a class="easyui-linkbutton" id="btn-query" iconCls="icon-search" plain="true"></a>
        </div>
    </div>
</div>
<div data-options="region:'center'" style="padding:5px;background:#eee;">
    <table class="easyui-datagrid" id="grid-center"
           data-options="
           fit:true,url:'workdiary!queryDetail.do',
           fitColumns:true,
           pagination:true,
           singleSelect:true,
           toolbar:'#tb-center',
           title:'日志详情'">
        <thead>
        <tr>
            <th data-options="field:'wdId',checkbox:true"></th>
            <th data-options="field:'workOrderTitle',width:100">工单标题</th>
            <th data-options="field:'workHour',width:100">花费工时</th>
            <th data-options="field:'dictionaryName',width:100">工作类型</th>
            <th data-options="field:'jobContent',width:200">工作事项</th>
            <th data-options="field:'remark',width:200">备注</th>
            <th data-options="field:'reportTime',width:100">填写时间</th>
        </tr>
        </thead>
    </table>
    <div id="tb-center">
        <%--操作--%>
        <div>
            <a class="easyui-linkbutton" id="btn-add" plain="true">添加</a>
            <a class="easyui-linkbutton" id="btn-modify" plain="true">修改</a>
            <a class="easyui-linkbutton" id="btn-delete" plain="true">删除</a>
        </div>
    </div>
</div>


<div id="add-win" class="easyui-window" data-options="closed:true" title="添加" style="padding:5px;">
    <form id="add-form" action="workdiary!add.do" method="post">
        <table>
            <tr>
                <td>工单:</td>
                <td>
                    <input class="easyui-combobox" name="workOrderId" data-options='
                        valueField:"woId",
                        textField:"workOrderTitle",
                        data:${workOrders},
                        panelHeight:"auto"
                    '>
                </td>
                <td>工作类型:</td>
                <td>
                    <input name="workTypeCode" class="easyui-combobox" required="true" data-options='
                        valueField: "dictionaryCode",
                        textField: "dictionaryName",
                        data:${dataDictionaries}
                        '/>
                </td>

            </tr>
            <tr>
                <td>花费时间:</td>
                <td><input name="workHour" class="easyui-numberbox" data-options="precision:1,required:true"/></td>
                <td>工作时间:</td>
                <td><input name="workTime" class="easyui-datebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>工作事项:</td>
                <td>
                    <textarea name="jobContent" style="overflow:auto;"></textarea>
                </td>
            </tr>
            <tr>
                <td>备注:</td>
                <td>
                    <textarea name="remark" style="overflow:auto;"></textarea>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn-add-win-ok" data-options="iconCls:'icon-ok'" href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn-add-win-cancel" data-options="iconCls:'icon-cancel'"
               href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>
<div id="modify-win" class="easyui-window" data-options="closed:true" title="修改" style="padding:5px;">
    <form id="modify-form" action="workdiary!modify.do" method="post">
        <input type="hidden" name="wdId"/>
        <table>
            <tr>
                <td>工单:</td>
                <td>
                    <input class="easyui-combobox" name="workOrderId" readonly="readonly" data-options='
                        valueField:"woId",
                        textField:"workOrderTitle",
                        data:${workOrders},
                        panelHeight:"auto"
                    '>
                </td>
                <td>工作类型:</td>
                <td>
                    <input name="workTypeCode" class="easyui-combobox" required="true" readonly="readonly"
                           data-options='
                        valueField: "dictionaryCode",
                        textField: "dictionaryName",
                        data:${dataDictionaries}
                        '/>
                </td>

            </tr>
            <tr>
                <td>花费时间:</td>
                <td><input name="workHour" class="easyui-numberbox" data-options="precision:1,required:true"/></td>
                <td>工作时间:</td>
                <td><input name="workTime" class="easyui-datebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>工作事项:</td>
                <td>
                    <textarea name="jobContent" style="overflow:auto;"></textarea>
                </td>
            </tr>
            <tr>
                <td>备注:</td>
                <td>
                    <textarea name="remark" style="overflow:auto;"></textarea>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn-modify-win-ok" data-options="iconCls:'icon-ok'"
               href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn-modify-win-cancel" data-options="iconCls:'icon-cancel'"
               href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>

</body>
</html>