<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 페이지</title>
</head>
<body>
	${login }
	<br> ${requestScope.login }
	
	<br> (사용하지 않습니다) attr :
	<%=request.getAttribute("login")%>
	<br> (사용하지 않습니다) param :
	<%=request.getParameter("login")%><br>
</body>
</html>