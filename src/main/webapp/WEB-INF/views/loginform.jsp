<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="<%=request.getContextPath() %>>jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){
	$("#btn").click(function(){
		var userid = $("#id").val();
		var userpw = $("#pw").val();
		
		if(userid==""){
			alert("아이디를 입력하세요.");
			return;
		}
		if(userpw==""){
			alert("비밀번호를 입력하세요.");
			return;
		}
		document.loginform.action="<%=request.getContextPath()%>/logincheck";
		document.loginform.submit();
	}) 
});
</script>

</head>
<body>
<h1>전국구 집사 로그인창입니다.</h1>
<form name=loginform method=post>
	<div>
		아이디 : <input type="text" id=id>
	</div>
	<div>
		비밀번호 : <input type="password" id=pw>
	</div>
	<div>
		<button type=submit id=btn>로그인</button>
	</div>
</form>
<!-- 	<div>
		<table border=1>
			<tr><td>아이디 : <input type="text" id=id></td>
			<tr><td>비밀번호 : <input type=password id=pw></td>
		</table>
	</div>
 -->	
	<div>
		아이디가 없으신가요? <a href="<%request.getContextPath(); %>/semi/signup">회원가입</a>
	</div>
</body>
</html>