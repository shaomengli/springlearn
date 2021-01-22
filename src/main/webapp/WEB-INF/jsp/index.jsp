<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>Insert title here</title>
</head>
<body>
    ${stringuser}
<table>
    <thead>
    <tr>序号</tr>
    <tr>姓名</tr>
    <tr>年龄</tr>
    </thead>
    <tr>
        <td>${objuser.id}</td>
        <td>${objuser.name}</td>
        <td>${objuser.age}</td>
    </tr>
</table>
</body>
</html>