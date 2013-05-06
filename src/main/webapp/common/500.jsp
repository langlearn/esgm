<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<title>500 服务器的内部错误</title>
</head>

<body>
	<div>
		<h1>
			<span> Web 服务器不能执行此请求。请稍后重试此请求。 如果问题依然存在，请与 Web服务器的管理员联系。</span>
		</h1>

		<div>
			<a href="<%=request.getContextPath() %>/main.do">返回</a>
		</div>
	</div>
</body>
</html>