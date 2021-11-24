<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath() }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>기본 페이지(Quiz01)</title>
</head>
<body>
	<h1>${index }(Quiz01)</h1>
	<h1>request : ${index }</h1>
	<a href="${contextPath }/login">로그인 페이지로 이동</a>
	<a href="${contextPath }/logout">로그아웃 페이지로 이동</a>

</body>
</html>