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
    <link rel="stylesheet" type="text/css" href="jquery-easyui/1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="jquery-easyui/1.3.3/themes/icon.css">
    <script type="text/javascript" src="jquery-easyui/1.3.3/jquery.min.js"></script>
    <script type="text/javascript" src="jquery-easyui/1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="jquery-easyui/1.3.3/easyui-lang-zh_CN.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'center'" style="padding:5px;background:#eee;">
    <table class="easyui-datagrid"
           data-options="
           fit:true,url:'baseinfo!query.do',
           fitColumns:true,
           singleSelect:true,
           pagination:true,
           toolbar:'#tb',
           title:'数据字典管理'">
        <thead>
        <tr>
            <th data-options="field:'ccode',width:100">Code</th>
            <th data-options="field:'cname',width:100">Name</th>
        </tr>
        </thead>
    </table>
    <div id="tb">
        <div>
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:alert('Add')">Add</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="javascript:alert('Cut')">Cut</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:alert('Save')">Save</a>
        </div>
        <div>
            <a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="javascript:alert('Add')">Add</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-cut" plain="true" onclick="javascript:alert('Cut')">Cut</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="javascript:alert('Save')">Save</a>
        </div>
    </div>
</div>
</body>
</html>