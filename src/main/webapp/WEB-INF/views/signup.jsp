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
<h1>회원가입 창입니다.</h1>
<form action="" method="post" id=memberinfo>	
	<div>
		아이디 : <input type="text" id=id>
	</div>
	<div>	
		비밀번호 : <input type=password id=pw>
	</div>
	<div>
		이름 : <input type=text id=name><br>
	</div>
	<div>
		<input type="submit" value="회원가입">
	</div>
	<div>
</form>	
		<div>
			이미 아이디가 있으신가요? <a href="<%request.getContextPath(); %>/semi/login">로그인창으로 이동</a>
		</div>
	</div>
</body>
</html>