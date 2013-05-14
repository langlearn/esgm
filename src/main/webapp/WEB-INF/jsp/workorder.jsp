<%--
  Created by IntelliJ IDEA.
  User: yang
  Date: 13-5-6
  Time: 下午4:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script type="text/javascript">
        $.extend($.fn.window.defaults, {
            collapsible:false,
            minimizable:false,
            maximizable:false,
            resizable:false,
            modal:true
        });
        $.extend($.fn.datagrid.defaults,{
            striped:true,
            rownumbers:true
        });
        function getRids(res,p){
            p=p||'rid';
            var ids=[];
            for(var i=0;i<res.length;i++){
                ids.push(res[i][p]);
            }
            return ids.join(',');
        }
        $(function(){
            //查询
            $('#btn-query').click(function(){
                var workOrderTitle=$('#q_workOrderTitle').val();
                var projectName=$('#q_projectName').val();
                $('#grid').datagrid('load',{
                    projectName:projectName,
                    workOrderTitle:workOrderTitle
                });
            });

            $('.query_btn').click(function(){
                var param = eval('(' + $(this).attr("param") + ')');
                $('#grid').datagrid('load',param);
            });

            //添加
            $('#btn-add').bind('click', function(){
                $('#add_ff').form('reset');
                $('#add_win').window('open');
                add_editor.setContent("");
            });

            $('#add_win_cancle').click(function(){
                $('#add_win').window('close');
            });

            $('#add_ff').form({
                success:function(data){
                    $('#add_win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //修改
            $('#btn-modify').bind('click', function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    $('#modify_ff').form('load',res[0]);
                    modify_editor.setContent(res[0].workOrderContent);
                    $('#modify_win').window('open');
                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            $('#modify_win_cancle').click(function(){
                $('#modify_win').window('close');
            });

            $('#modify_ff').form({
                success:function(data){
                    $('#modify_win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //确认
            $('#confirm_ff').form({
                success:function(data){
                    $('#confirm_win').window('close');
                    $('#grid').datagrid('reload');
                }
            })
            $('#btn-confirm').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    $('#confirm_ff').form('load',res[0]);
                    $('#confirm_workOrderContent').html(res[0].workOrderContent);
                    $('#confirm_win').window('open');
                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            //验收
            $('#check_ff').form({
                success:function(data){
                    $('#check_win').window('close');
                    $('#grid').datagrid('reload');
                }
            })
            $('#btn-check').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    $('#check_ff').form('load',res[0]);
                    $('#check_workOrderContent').html(res[0].workOrderContent);
                    $('#check_win').window('open');
                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            //作废
            $('#invalid_ff').form({
                success:function(data){
                    $('#invalid_win').window('close');
                    $('#grid').datagrid('reload');
                }
            })
            $('#btn-invalid').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    $('#invalid_ff').form('load',res[0]);
                    $('#invalid_workOrderContent').html(res[0].workOrderContent);
                    $('#invalid_win').window('open');
                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            //受理
            $('#userTree_btn_ok').click(function(){
                var nodes = userTree.getCheckedNodes(true);
                var names=[];
                var ids=[];
                for(var i=0;i<nodes.length;i++){
                    var node=nodes[i];
                    names.push(node.username);
                    ids.push(node.userId);
                }
                $('#accept_ff :input[name="userids"]').val(ids.join(","));
                $('#accept_ff :input[name="usernames"]').val(names.join(","));
                $('#select_user_win').window('close');
            });

            $('#selectUser_btn').click(function(){
                $('#select_user_win').window('open');
            });

            $('#accept_ff').form({
                success:function(data){
                    $('#accept_win').window('close');
                    $('#grid').datagrid('reload');
                }
            })
            $('#btn-accept').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    userTree.checkAllNodes(false);
                    $('#accept_ff').form('load',res[0]);
                    $('#accept_workOrderContent').html(res[0].workOrderContent);
                    $.getJSON('workorder!queryCopy.do',{
                        woId:res[0].woId
                    },function(data){
                        var names=[];
                        var ids=[];
                        for(var i=0;i<data.length;i++){
                            var node=data[i];
                            names.push(node.username);
                            ids.push(node.userid);
                            var no=userTree.getNodeByParam("userId", node.userid, null);
                            userTree.checkNode(no);
                        }
                        $('#accept_ff :input[name="userids"]').val(ids.join(","));
                        $('#accept_ff :input[name="usernames"]').val(names.join(","));
                        $('#accept_win').window('open');
                    });

                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            //删除
            $('#btn-delete').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length>0){
                    var rids=getRids(res,'woId');
                    $.getJSON('workorder!delete.do',{rids:rids},function(){
                        $.messager.alert('系统提示','删除成功','',function(){
                            $('#grid').datagrid('reload');
                        });
                    });
                }else{
                    $.messager.alert('系统提示','请选中一些记录!');
                }
            });

            var add_editor = new UE.ui.Editor({
                initialFrameWidth:700,
                initialFrameHeight:160,
                minFrameHeight:160,
                zIndex:9000
            });
            add_editor.render("editor");

            var modify_editor = new UE.ui.Editor({
                initialFrameWidth:700,
                initialFrameHeight:160,
                minFrameHeight:160,
                zIndex:9000
            });
            modify_editor.render("modify_editor");

            var setting = {
                data: {
                    simpleData: {
                        enable: true
                    }
                },
                check: {
                    enable: true,
                    chkStyle: "radio",
                    radioType: "all"
                }
            };
            var zNodes =${projects};
            var ztree=$.fn.zTree.init($("#treeDemo"), setting, zNodes);

            var userTree=$.fn.zTree.init($("#userTree"), {
                data: {
                    simpleData: {
                        enable: true,
                        idKey: "userId"
                    },
                    key: {
                        name: "username"
                    }
                },
                check: {
                    enable: true
                }
            }, ${users});

            $('#select_project_btn').click(function(){
                $('#select_project_win').window('open');
            });
            $('#select_project_btn_cancle').click(function(){
                $('#select_project_win').window('close');
            });
            $('#select_project_btn_ok').click(function(){
                var nodes = ztree.getCheckedNodes(true);
                if(nodes.length>0){
                    var node=nodes[0];
                    $("#add_ff :input[name='projectName']").val(node.name);
                    $("#add_ff :input[name='projectId']").val(node.id);
                    $('#select_project_win').window('close');
                }else{
                    alert("请选择一个!");
                }
            });
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
           onDblClickRow:function(rowIndex, rowData){
               $('#view_win').window('open');
               $('#view_ff').form('load',rowData);
               $('#view_workOrderContent').html(rowData.workOrderContent);
           },
           toolbar:'#tb',
           title:'工单管理'">
        <thead>
        <tr>
            <th data-options="field:'ck',checkbox:true"></th>
            <th data-options="field:'workOrderTitle',width:200">工单标题</th>
            <th data-options="field:'reportUser',width:200">填报人</th>
            <th data-options="field:'reportTime',width:200">填报时间</th>
            <th data-options="field:'sponsorUser',width:200">发起人</th>
            <th data-options="field:'acceptUser',width:200">受理人</th>
            <th data-options="field:'confirmTime',width:200">确认时间</th>
            <th data-options="field:'acceptTime',width:200">受理时间</th>
            <th data-options="field:'checkReceiveTime',width:200">验收时间</th>
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
        <div>
            <a class="easyui-linkbutton query_btn"  param="{}"  plain="true">全部工单</a>
            <a class="easyui-linkbutton query_btn" param='{confirmStatus:0}'  plain="true">待确认的工单</a>
            <a class="easyui-linkbutton query_btn" param='{acceptStatus:0}'  plain="true">待受理的工单</a>
            <a class="easyui-linkbutton query_btn" param="{isSignFor:0,copy:true}"  plain="true">待签收的工单</a>
            <a class="easyui-linkbutton query_btn" param='{checkReceiveStatus:0}' plain="true">未验收的工单</a>
            <a class="easyui-linkbutton query_btn" param='{reportUserId:${sessionScope.optid}}'  plain="true">我填报的工单</a>
            <a class="easyui-linkbutton query_btn" param='{sponsorUserId:${sessionScope.optid}}'  plain="true">我发起的工单</a>
            <a class="easyui-linkbutton query_btn" param='{acceptUserId:${sessionScope.optid}}'  plain="true">我受理的工单</a>
            <a class="easyui-linkbutton query_btn" param="{isSignFor:1,copy:true}"  plain="true">我签收的工单</a>
        </div>
        <%--操作--%>
        <div>
            <c:if test="${sessionScope.loginUser.isAbleWorkOrderReport==1}">
            <a class="easyui-linkbutton" id="btn-add"  plain="true">新增</a>
            <a class="easyui-linkbutton" id="btn-modify"  plain="true">修改</a>
            <a class="easyui-linkbutton" id="btn-delete" plain="true">删除</a>
            </c:if>
            <c:if test="${sessionScope.loginUser.isAbleWorkOrderSponsor==1}">
            <a class="easyui-linkbutton" id="btn-confirm" plain="true">确认</a>
            <a class="easyui-linkbutton" id="btn-check" plain="true">验收</a>
            <a class="easyui-linkbutton" id="btn-invalid" plain="true">作废</a>
            </c:if>
            <c:if test="${sessionScope.loginUser.isAbleWorkOrderAccept==1}">
            <a class="easyui-linkbutton" id="btn-accept" plain="true">受理</a>
            </c:if>
        </div>
    </div>
</div>
<div id="add_win" class="easyui-window" data-options="closed:true" title="添加" style="padding:5px;width: 800px;height: 500px;">
    <form id="add_ff" action="workorder!add.do" method="post">
        <table>
            <tr>
                <td>工单标题:</td>
                <td>
                    <input name="workOrderTitle" class="easyui-validatebox" type="text" required="true">
                </td>
            </tr>
            <tr>
                <td>项目:</td>
                <td>
                    <input type="hidden" name="projectId"/>
                    <input class="easyui-validatebox" type="text" name="projectName" required="true" disabled="disabled"><button id="select_project_btn" type="button">选择项目</button>
                </td>
            </tr>
            <tr>
                <td>发起人:</td>
                <td>
                    <select name="sponsorUserId" style="width: 150px;">
                        <option>请选择</option>
                        <c:forEach var="item" items="${sponsors}">
                            <option value="${item.userId}">${item.truename}</option>
                        </c:forEach>
                    </select>
                    受理人:
                    <select name="acceptUserId" style="width: 150px;">
                        <option>请选择</option>
                        <c:forEach var="item" items="${accepts}">
                            <option value="${item.userId}">${item.truename}</option>
                        </c:forEach>
                    </select>
                </td>
            </tr>
            <tr>
                <td>工单内容:</td>
                <td>
                    <script type="text/plain" id="editor" name="workOrderContent" >
                    </script>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <button type="submit">确定</button>
            <button type="button" id="add_win_cancle">取消</button>
        </div>
    </form>
</div>
<div id="modify_win" class="easyui-window" data-options="closed:true" title="添加" style="padding:5px;">
    <form id="modify_ff" action="workorder!modify.do" method="post" style="padding:5px;width: 800px;height: 500px;">
        <table>
            <tr>
                <td>工单标题:</td>
                <td>
                    <input type="hidden" name="woId">
                    <input name="workOrderTitle" class="easyui-validatebox" type="text" required="true">
                </td>
            </tr>
            <tr>
                <td>项目:</td>
                <td>
                   <input type="text" name="projectName" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>发起人:</td>
                <td>
                    <input name="sponsorUser" type="text" style="border: 0px;"/>
                    受理人:
                    <input name="acceptUser" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>工单内容:</td>
                <td>
                    <script type="text/plain" id="modify_editor" name="workOrderContent" >
                    </script>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <button type="submit">确定</button>
            <button type="button" id="modify_win_cancle">取消</button>
        </div>
    </form>
</div>
<div id="view_win" class="easyui-window" data-options="closed:true" title="详情" style="padding:5px;">
    <form id="view_ff" action="workorder!modify.do" method="post" style="padding:5px;width: 500px;height: 500px;">
        <table>
            <tr>
                <td>工单标题:</td>
                <td>
                    <input type="hidden" name="woId">
                    <input name="workOrderTitle" type="text" style="border: 0px;">
                </td>
            </tr>
            <tr>
                <td>项目:</td>
                <td>
                    <input type="text" name="projectName" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>填报人:</td>
                <td>
                    <input name="reportUser" type="text" style="border: 0px;"/>
                    填报时间:
                    <input name="reportTime" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>发起人:</td>
                <td>
                    <input name="sponsorUser" type="text" style="border: 0px;"/>
                    受理人:
                    <input name="acceptUser" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>抄送人:</td>
                <td>
                    <input name="acceptUser" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>已签收的抄送人:</td>
                <td>
                    <input name="" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>是否确认:</td>
                <td>
                    <select name="confirmStatus" style="border: 0px;-webkit-appearance: none;">
                        <option value="1">为确认</option>
                        <option value="0">已确认</option>
                    </select>
                    确认时间:<input type="text" name="confirmTime" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>是否受理:</td>
                <td>
                    <select name="acceptStatus" style="border: 0px;-webkit-appearance: none;">
                        <option value="1">未受理</option>
                        <option value="0">已受理</option>
                    </select>
                    受理时间:<input type="text" name="acceptTime" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>是否验收:</td>
                <td>
                    <select name="checkReceiveStatus" style="border: 0px;-webkit-appearance: none;">
                        <option value="0">未验收</option>
                        <option value="1">已验收</option>
                        <option value="1">已作废</option>
                    </select>
                    验收时间:
                    <input name="checkReceiveTime" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>是否作废:</td>
                <td>
                    <select name="checkReceiveStatus" style="border: 0px;-webkit-appearance: none;">
                        <option value="0">未验收</option>
                        <option value="1">已验收</option>
                        <option value="1">已作废</option>
                    </select>
                    作废时间:
                    <input name="checkReceiveTime" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>作废理由:</td>
                <td>
                    <input name="invalidReason" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>工单内容:</td>
                <td>
                    <div id="view_workOrderContent"></div>
                </td>
            </tr>
        </table>
    </form>
</div>
<div id="select_project_win" class="easyui-window" data-options="closed:true" title="选择项目" style="width: 300px;height: 300px;">
    <ul id="treeDemo" class="ztree" style="height: 200px;overflow:auto"></ul>
    <button id="select_project_btn_ok">确定</button><button id="select_project_btn_cancle">取消</button>
</div>
<div id="confirm_win" class="easyui-window" data-options="closed:true" title="确认工单" style="width: 550px;height: 500px;">
    <form id="confirm_ff" action="workorder!confirm.do" method="post" style="padding:5px;width: 500px;height: 400px;">
        <div style="height: 400px;">
        <table>
            <tr>
                <td>工单标题:</td>
                <td>
                    <input type="hidden" name="woId">
                    <input name="workOrderTitle" type="text" style="border: 0px;">
                </td>
            </tr>
            <tr>
                <td>项目:</td>
                <td>
                    <input type="text" name="projectName" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>填报人:</td>
                <td>
                    <input name="reportUser" type="text" style="border: 0px;"/>
                    填报时间:
                    <input name="reportTime" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>发起人:</td>
                <td>
                    <input name="sponsorUser" type="text" style="border: 0px;"/>
                    受理人:
                    <input name="acceptUser" type="text" style="border: 0px;"/>
                </td>
            </tr>
            <tr>
                <td>工单内容:</td>
                <td>
                    <div id="confirm_workOrderContent"></div>
                </td>
            </tr>
        </table>
        </div>
        <div style="text-align: center;">
            <button type="submit">确人</button>
        </div>
    </form>
</div>
<div id="accept_win" class="easyui-window" data-options="closed:true" title="受理工单" style="width: 550px;height: 500px;">
    <form id="accept_ff" action="workorder!accept.do" method="post" style="padding:5px;width: 500px;height: 400px;">
        <div style="height: 400px;">
            <table>
                <tr>
                    <td>工单标题:</td>
                    <td>
                        <input type="hidden" name="woId">
                        <input name="workOrderTitle" type="text" style="border: 0px;">
                    </td>
                </tr>
                <tr>
                    <td>项目:</td>
                    <td>
                        <input type="text" name="projectName" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>填报人:</td>
                    <td>
                        <input name="reportUser" type="text" style="border: 0px;"/>
                        填报时间:
                        <input name="reportTime" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>发起人:</td>
                    <td>
                        <input name="sponsorUser" type="text" style="border: 0px;"/>
                        受理人:
                        <input name="acceptUser" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>工单内容:</td>
                    <td>
                        <div id="accept_workOrderContent"></div>
                    </td>
                </tr>
                <tr>
                    <td>抄送人:</td>
                    <td>
                        <input type="hidden" name="userids">
                        <textarea disabled="disabled" name="usernames"></textarea>
                        <button type="button" id="selectUser_btn">选择抄送人...</button>
                    </td>
                </tr>
            </table>
        </div>
        <div style="text-align: center;">
            <button type="submit">确人</button>
        </div>
    </form>
</div>
<div id="select_user_win" class="easyui-window" data-options="closed:true" title="选择用户" style="width: 300px;height: 300px;">
    <ul id="userTree" class="ztree" style="height: 200px;overflow:auto"></ul>
    <div style="text-align: center;">
        <button id="userTree_btn_ok">确定</button>
    </div>

</div>
<div id="check_win" class="easyui-window" data-options="closed:true" title="验收工单" style="width: 550px;height: 500px;">
    <form id="check_ff" action="workorder!check.do" method="post" style="padding:5px;width: 500px;height: 400px;">
        <div style="height: 400px;">
            <table>
                <tr>
                    <td>工单标题:</td>
                    <td>
                        <input type="hidden" name="woId">
                        <input name="workOrderTitle" type="text" style="border: 0px;">
                    </td>
                </tr>
                <tr>
                    <td>项目:</td>
                    <td>
                        <input type="text" name="projectName" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>填报人:</td>
                    <td>
                        <input name="reportUser" type="text" style="border: 0px;"/>
                        填报时间:
                        <input name="reportTime" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>发起人:</td>
                    <td>
                        <input name="sponsorUser" type="text" style="border: 0px;"/>
                        受理人:
                        <input name="acceptUser" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <%--<tr>
                    <td>确认时间:</td>
                    <td>
                    <input type="text" name="confirmTime" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>受理时间:</td>
                    <td>
                        <input type="text" name="acceptTime" style="border: 0px;"/>
                    </td>
                </tr>--%>
                <tr>
                    <td>工单内容:</td>
                    <td>
                        <div id="check_workOrderContent"></div>
                    </td>
                </tr>
            </table>
        </div>
        <div style="text-align: center;">
            <button type="submit">验收</button>
        </div>
    </form>
</div>
<div id="invalid_win" class="easyui-window" data-options="closed:true" title="验收工单" style="width: 550px;height: 500px;">
    <form id="invalid_ff" action="workorder!invalid.do" method="post" style="padding:5px;width: 500px;height: 400px;">
        <div style="height: 400px;">
            <table>
                <tr>
                    <td>工单标题:</td>
                    <td>
                        <input type="hidden" name="woId">
                        <input name="workOrderTitle" type="text" style="border: 0px;">
                    </td>
                </tr>
                <tr>
                    <td>项目:</td>
                    <td>
                        <input type="text" name="projectName" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>填报人:</td>
                    <td>
                        <input name="reportUser" type="text" style="border: 0px;"/>
                        填报时间:
                        <input name="reportTime" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>发起人:</td>
                    <td>
                        <input name="sponsorUser" type="text" style="border: 0px;"/>
                        受理人:
                        <input name="acceptUser" type="text" style="border: 0px;"/>
                    </td>
                </tr>
                <tr>
                    <td>工单内容:</td>
                    <td>
                        <div id="invalid_workOrderContent"></div>
                    </td>
                </tr>
                <tr>
                    <td>作废理由:</td>
                    <td>
                        <textarea name="invalidReason">

                        </textarea>
                    </td>
                </tr>
            </table>
        </div>
        <div style="text-align: center;">
            <button type="submit">作废</button>
        </div>
    </form>
</div>
</body>
</html>