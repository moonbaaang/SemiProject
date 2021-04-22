<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

});
</script>
</head>
<body>
<h1>전국구 집사 페이지에 오신것을 환영합니다.</h1>
<div>
	<a href="<%=request.getContextPath() %>/login">로그인</a>
	<a href="<%=request.getContextPath() %>/signup">회원가입</a>
</div>
</body>
</html>