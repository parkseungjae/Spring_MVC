<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath }" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	<c:import url="../default/header.jsp" />
	<div>
		<h1>로그인 페이지 입니다</h1>
		<div>
			<form action="successLogin" method = "post">
			<input type="text" name = "id" placeholder="아이디"><br>
			<input type="password" name = "pwd" placeholder="비밀번호"><br>
			<input type= "submit" value = "회원가입">
			</form>
		</div>
	</div>
	<c:import url="../default/footer.jsp" />

</body>
</html>