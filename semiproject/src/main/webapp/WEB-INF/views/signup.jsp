<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>멍냥멍냥</title>
<script src="<%=request.getContextPath() %>/resources/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

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
<form method="post" id=memberinfo>	
	<div class=login>
		<input type="text" name=id class=text placeholder=아이디>
		<input type="password" name=pw class=text placeholder=비밀번호>
		<input type="text" name=name class=text placeholder=이름>
		<input type="submit" value=회원가입 class=btn>
	</div>	
</form>
		<div class=signup>
			이미 아이디가 있으신가요? <a href="<%request.getContextPath(); %>/semi/login">로그인창으로 이동</a>
		</div>

</body>
</html>