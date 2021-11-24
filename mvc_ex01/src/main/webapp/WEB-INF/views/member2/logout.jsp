<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath() }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그아웃 페이지</title>
</head>
<body>
	<h1>
		request :
		<%=request.getAttribute("logout")%></h1>
	<h1>requestScope : ${requestScope.logout}</h1>
	<h1>request(el) : ${logout }</h1>
	<br>
	<a href="${contextPath }/login">로그인 페이지로 이동</a>
	<a href="${contextPath }/index">기본 페이지로 이동</a>

</body>
</html>