<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>

<html>
<head>
    <title><sitemesh:title/></title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>

    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui/1.3.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/jquery-easyui/1.3.3/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${ctx}/ztree/css/zTreeStyle.css">

    <script type="text/javascript" src="${ctx}/jquery/jquery-1.9.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui/1.3.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${ctx}/jquery-easyui/1.3.3/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${ctx}/ztree/js/jquery.ztree.core-3.5.min.js"></script>
    <script type="text/javascript" src="${ctx}/ueditor/editor_config.js"></script>
    <script type="text/javascript" src="${ctx}/ueditor/editor_all.js"></script>
    <sitemesh:head/>
</head>

<body <sitemesh:getProperty property="body.class" writeEntireProperty="true" />>
<sitemesh:body/>
</body>
</html>