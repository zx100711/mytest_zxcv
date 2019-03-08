<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- JSTL 核心标签库 -->


<title>用户数据</title>
</head>
<body>
 	<div>
 	<table>
 	<c:forEach items="${requestScope.li}" var="nnm" >
 		<tr><td>注册人数:</td><td>${nnm.registerNum}</td></tr>
 		<tr><td>注册时间:</td><td>${nnm.day}</td></tr>
 	</c:forEach>
 	</table>
 		
 	</div>
</body>
</html>
