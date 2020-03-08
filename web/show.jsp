<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <base href="<%=basePath %>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>数据展示页面</title>
</head>
<body>
<ul>
    <li>${yongHu.uName}</li>
    <li>${yongHu.age}</li>
    <li>${yongHu.height}</li>
</ul>
</body>
</html>
