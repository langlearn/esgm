<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            p=p||'id';
            var ids=[];
            for(var i=0;i<res.length;i++){
                ids.push(res[i][p]);
            }
            return ids.join(',');
        }
        function formatUse(val,row){
            if (val == 1){
                return '是';
            } else {
                return '否';
            }
        }
        $(function(){
            //查询
            $('#btn-query').click(function(){
                var name=$('#q-name').val();
                $('#grid').datagrid('load',{
                    username:name
                });
            });

            //添加
            $('#btn-add').bind('click', function(){
                $('#add-form').form('reset');
                $('#add-win').window('open');
            });

            $('#btn-add-win-cancel').click(function(){
                $('#add-win').window('close');
            });
            $('#btn-add-win-ok').click(function(){
                $('#add-form').submit();
            });

            $('#add-form').form({
                success:function(data){
                    $('#add-win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //修改
            $('#btn-modify').bind('click', function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length==1){
                    $('#modify-form').form('load',res[0]);
                    $('#modify-win').window('open');
                }else{
                    $.messager.alert('系统提示','请选中一条!');
                }
            });

            $('#btn-modify-win-cancel').click(function(){
                $('#modify-win').window('close');
            });
            $('#btn-modify-win-ok').click(function(){
                $('#modify-form').submit();
            });
            $('#modify-form').form({
                success:function(data){
                    $('#modify-win').window('close');
                    $('#grid').datagrid('reload');
                }
            });

            //删除
            $('#btn-delete').click(function(){
                var res=$('#grid').datagrid('getSelections');
                if(res.length>0){
                    $.messager.confirm('删除','你确定要删除这些记录吗?',function(r){
                        if (r){

                            var rids=getRids(res,'urId');
                            $.getJSON('user!delete.do',{rids:rids},function(){
                                $.messager.alert('系统提示','删除成功','',function(){
                                    $('#grid').datagrid('reload');
                                });
                            });

                        }
                    });

                }else{
                    $.messager.alert('系统提示','请选中一些记录!');
                }
            });


        });
    </script>
</head>
<body class="easyui-layout">
<div data-options="region:'center'" style="padding:5px;background:#eee;">
    <table class="easyui-datagrid" id="grid"
           data-options="
           fit:true,url:'user!query.do',
           fitColumns:true,
           pagination:true,
           toolbar:'#tb',
           title:'用户列表'">
        <thead>
        <tr>
            <th data-options="field:'userId',checkbox:true"></th>
            <th data-options="field:'username',width:100">用户姓名</th>
            <th data-options="field:'isAbleWorkOrderReport',width:100,formatter:formatUse">是否具备工单填报权限</th>
            <th data-options="field:'isAbleWorkOrderSponsor',width:100,formatter:formatUse">是否具备工单发起权限</th>
            <th data-options="field:'isAbleWorkOrderAccept',width:100,formatter:formatUse">是否具备工单受理权限</th>
            <th data-options="field:'isPublicWorkDiary',width:100,formatter:formatUse">是否公开个人工作日志</th>
        </tr>
        </thead>
    </table>
    <div id="tb">
        <%--查询--%>
        <div>
            名称:<input id="q-name" type="text"/>
            <a class="easyui-linkbutton" id="btn-query" iconCls="icon-search" plain="true"></a>
        </div>
        <%--操作--%>
        <div>
            <a class="easyui-linkbutton" id="btn-add"  plain="true">添加</a>
            <a class="easyui-linkbutton" id="btn-modify"  plain="true">修改</a>
            <a class="easyui-linkbutton" id="btn-delete" plain="true">删除</a>
        </div>
    </div>
</div>
<div id="add-win" class="easyui-window" data-options="closed:true" title="添加" style="padding:5px;">
    <form id="add-form" action="user!add.do" method="post">
        <table>
            <tr>
                <td>是否具备工单填报权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderReport" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderReport" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否具备工单发起权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderSponsor" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderSponsor" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否具备工单受理权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderAccept" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderAccept" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否公开个人工作日志:</td>
                <td>是<input type="radio" name="isPublicWorkDiary" value="1"/></td>
                <td>否<input type="radio" name="isPublicWorkDiary" value="0" checked="true"/></td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn-add-win-ok" data-options="iconCls:'icon-ok'" href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn-add-win-cancel" data-options="iconCls:'icon-cancel'" href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>
<div id="modify-win" class="easyui-window" data-options="closed:true" title="修改" style="padding:5px;">
    <form id="modify-form" action="user!modify.do" method="post">
        <input type="hidden" name="urId"/>
        <input type="hidden" name="userId"/>
        <table>
            <tr>
                <td>是否具备工单填报权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderReport" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderReport" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否具备工单发起权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderSponsor" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderSponsor" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否具备工单受理权限:</td>
                <td>是<input type="radio" name="isAbleWorkOrderAccept" value="1"/></td>
                <td>否<input type="radio" name="isAbleWorkOrderAccept" value="0" checked="true"/></td>
            </tr>
            <tr>
                <td>是否公开个人工作日志:</td>
                <td>是<input type="radio" name="isPublicWorkDiary" value="1"/></td>
                <td>否<input type="radio" name="isPublicWorkDiary" value="0" checked="true"/></td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn-modify-win-ok" data-options="iconCls:'icon-ok'" href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn-modify-win-cancel" data-options="iconCls:'icon-cancel'" href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>

</body>
</html>