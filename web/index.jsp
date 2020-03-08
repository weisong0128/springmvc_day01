<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>表单</title>
</head>
<body>
	<%--uName,age,height--%>
	<center>
		<form action="<%=basePath %>/index/regist" method="post">
			<table width="800px" border="1px">
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="uName"></td>
				</tr>
				<tr>
					<td>年龄</td>
					<td><input type="text" name="age"></td>
				</tr>
				<tr>
					<td>身高：</td>
					<td><input type="text" name="height"></td>
				</tr>
				<tr>
					<%--点击提交，会把数据带到上面action指定的接口方法中--%>
					<td><input type="submit" value="提交"></td>
					<td><input type="text" value="取消"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>
