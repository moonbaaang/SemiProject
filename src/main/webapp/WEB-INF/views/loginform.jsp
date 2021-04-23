<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login form</title>
<script type="text/javascript">
function btn(){
	const id = document.getElementById("id").value;
	if(id!=null){
		alert(id+"회원님 로그인되었습니다.");
	}
}
</script>
<script src="<%=request.getContextPath() %>/resources/jquery-3.2.1.min.js"></script>
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
		
		document.loginform.action="<%=request.getContextPath()%>/login";
		document.loginform.submit();
	}) 
	
	if (${msg}=="failure") {
		alert("로그인에 실패하셨습니다.");
	} else {
		alert("로그인에 성공하셨습니다.")
	}
	
});
</script>
<style type="text/css">
* {
  box-sizing: border-box;
  font-family: 'Noto Sans KR', sans-serif;
  border-radius: 5px;
}

h1{
	text-align: center;
}
.home{
	margin-top: 20px;
	font-size:30px;
	color: #1BBC9B;
}
.mungnyang{
	font-size: 50px;
	color: #1BBC9B;
	margin-top: 10px;
}

body {
  margin: 0;
  background-repeat:no-repeat;
  background-position:50% 0%;
  background-image: url("<%=request.getContextPath()%>/resources/images/login.jpg");
}
 
.login {
    width: 300px;
    background-color: #EEEFF1;
    margin-right: auto;
    margin-left: auto;
    margin-top: 30px;
    padding: 20px;
    text-align: center;
    border: none;
    
}
 
.text {
      font-size: 14px;
      padding: 10px;
      border: none;
      width: 260px;
      margin-bottom: 10px;
 
}
 
.btn {
  font-size: 14px;
  border: none;
  padding: 10px;
  width: 260px;
  background-color: #1BBC9B;
  margin-bottom: 10px;
  color: white;
}
.signup {
	font-size: 14px;
	color: #1BBC9B;
	text-align: center;
	 margin-top: 10px;
}
</style>
</head>
<body>
<header>	
	<div>
		<h1 class=home>집사들을 위한 새로운 플랫폼</h1>
		<h1 class=mungnyang>멍냥멍냥</h1>
	</div>
</header>
<div class=login>
	<form name=loginform method=post>
		<input type="text" name=id class=text placeholder=아이디>
		<input type="password" name=pw class=text placeholder=비밀번호>
		<input type="submit" value=로그인 class=btn>
	</form>
</div>
	<div class=signup>
		아이디가 없으신가요? <a href="<%request.getContextPath(); %>/semi/signup">회원가입</a>
	</div>
</body>
</html>




<!-- 
	<table border=1 >
		<tr>
			<td align=center width=100px>아이디</td>
			<td><input type="text" name=id width=300px></td>
		</tr>
		<tr>
			<td align=center width=100px>비밀번호</td>
			<td><input type="password" name=pw width=200px></td>
		</tr>
		<tr>
			<td colspan=2 align=center>
				<button type=submit id=btn>로그인</button>
			</td>
		</tr>
	</table>
		
</form>
 -->