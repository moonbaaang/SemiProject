<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
 
.boardlist {
    width: 680px;
    height: 320px;
    background-color: #EEEFF1;
    margin-right: auto;
    margin-left: auto;
    margin-top: 30px;
    padding: 20px;
    text-align: center;
    border: none;
    
}

.dog{
	float:left;
	width: 280px;
	height: 280px;
	margin-right: 20px;
    margin-left: 20px;
	background-repeat: no-repeat;
	background-size: cover;
	background-image: url("<%=request.getContextPath()%>/resources/images/dog.png");

}
.cat{
	float:right;
	width: 280px;
	height: 280px;
	margin-right: 20px;
    margin-left: 20px;
	background-repeat: no-repeat;
	background-size: cover;
	background-image: url("<%=request.getContextPath()%>/resources/images/cat.png");
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

a{
	text-decoration:none;
}
.atag{
	font-size: 30px;
	text-align: center;
	color : white;
	font-weight: bold;
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
<form>
	<div class=boardlist>
		<div class=dog>
			<br><br><a class=atag href="<%=request.getContextPath() %>/dogboardlist">우리 강아지는요</a>
		</div>
		<div class=cat>
			<br><br><a class=atag href="<%=request.getContextPath() %>/catboardlist">우리 고양이는요</a>
		</div>
		<div>
		</div>
	</div>
</form>
</body>
</html>
