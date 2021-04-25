<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
 
.contents_framework {
    width: 500px;
    background-color: #EEEFF1;
    margin-right: auto;
    margin-left: auto;
    margin-top: 30px;
    padding: 20px;
    text-align: center;
    border: none;
    
}

.title {
    width: 200px;
	border: 1px solid #1BBC9B;
    margin-right: auto;
    margin-left: auto;
    margin-top: 5px;
    padding: 5px;
    text-align: center;
}

.contents{
	border: 1px solid #1BBC9B;
	margin-bottom: 5px;
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
  width: 200px;
  background-color: #1BBC9B;
  margin-top: 5px;	
  margin-bottom: 5px;
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
	<div>
		<h1 class=home>우리 강아지는요</h1>
		<h1 class=mungnyang>내 반려견 이야기를 들려주세요</h1>
	</div>
<form method="post">
<div class=contents_framework>
		<div>
			<input class=title type=text name=title value=제목>
			<input  class=title type=text name=writer value=작성자>
		</div>
		<div>
			<br><textarea class=contents rows="7px" cols="60px" name=content value=내용></textarea>
		</div>
		<div>
			<button class=btn type="submit">완료</button>
			<input class=btn type=button value="목록" onclick="location.href='<%=request.getContextPath() %>/dogboardlist'"/>
		</div>
	</div>
</form>
</body>
</html>