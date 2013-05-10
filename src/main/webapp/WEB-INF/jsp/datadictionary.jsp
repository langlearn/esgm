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
                    dictionaryName:name
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

                            var rids=getRids(res,'ddId');
                            $.getJSON('datadictionary!delete.do',{rids:rids},function(){
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
           fit:true,url:'datadictionary!query.do',
           fitColumns:true,
           pagination:true,
           toolbar:'#tb'
           ">
        <thead>
        <tr>
            <th data-options="field:'dId',checkbox:true"></th>
            <th data-options="field:'dictionaryName',width:100">名称</th>
            <th data-options="field:'dictionaryCode',width:100">代码</th>
            <th data-options="field:'parentCode',width:100">父类代码</th>
            <th data-options="field:'isUse',width:100,formatter:formatUse">是否启用</th>
            <th data-options="field:'descriptions',width:100">描述</th>
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
    <form id="add-form" action="datadictionary!add.do" method="post">
        <table>
            <tr>
                <td>代码:</td>
                <td><input name="dictionaryCode" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>父类代码:</td>
                <td><input name="parentCode" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>名称:</td>
                <td><input name="dictionaryName" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>是否启用:</td>
                <td>
                    <select name="isUse" class="easyui-combobox" style="width:200px;">
                        <option value="0" >否</option>
                        <option value="1" selected="selected">是</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>描述:</td>
                <td>
                    <textarea name="descriptions" style="overflow:auto;"></textarea>
                </td>
            </tr>
        </table>
        <div data-options="border:false" style="text-align:right;">
            <a class="easyui-linkbutton" id="btn-add-win-ok" data-options="iconCls:'icon-ok'" href="javascript:void(0)">确定</a>
            <a class="easyui-linkbutton" id="btn-add-win-cancel" data-options="iconCls:'icon-cancel'" href="javascript:void(0)">取消</a>
        </div>
    </form>
</div>
<div id="modify-win" class="easyui-window" data-options="closed:true" title="修改" style="padding:5px;">
    <form id="modify-form" action="datadictionary!modify.do" method="post">
        <table>
            <input type="hidden" name="ddId"/>
            <tr>
                <td>代码:</td>
                <td><input name="dictionaryCode" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>父类代码:</td>
                <td><input name="parentCode" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>名称:</td>
                <td><input name="dictionaryName" class="easyui-validatebox" type="text" required="true"/></td>
            </tr>
            <tr>
                <td>是否启用:</td>
                <td>
                    <select name="isUse" class="easyui-combobox" style="width:200px;">
                        <option value="0" >否</option>
                        <option value="1" selected="selected">是</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>描述:</td>
                <td>
                    <textarea name="descriptions" style="overflow:auto;"></textarea>
                </td>
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