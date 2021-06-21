<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
    background-color: #FFFFFF;
    margin-right: auto;
    margin-left: auto;
    margin-top: 10px;
    padding: 0px;
    text-align: center;
    border: none; 
}

.btn {
  width: 200px;
  font-size: 14px;
  border: none;
  padding: 10px;
  width: 200px;
  background-color: #1BBC9B;
  margin:auto;
  text-align: center;
  color: white;
}

table {
    margin-left:auto; 
    margin-right:auto;
    width : 800px;
}

table, td, th {
    border-collapse : separate;
    border : 1px solid black;
    text-align : center;
};

button{
	margin-left:auto;
	margin-right:auto;
	margin-top:auto;
	margin-bottom:auto;		
}

</style>
<script type="text/javascript">

</script>
<script src="<%=request.getContextPath() %>/resources/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>

<header>	
	<div>
		<h1 class=home>우리 강아지는요</h1>
		<h1 class=mungnyang>각자의 반려견 이야기를 들려주세요</h1>
	</div>
</header>

<div>
	<table>
		<tr bgcolor=#F6CECE><th>글번호</th><th>아이디</th><th>제목</th><th>조회수</th></tr>
		<c:forEach items="${dogboardlist}" var="vo">
			<tr><td bgcolor=#F6CECE>${vo.seq }</td>
			<td>${vo.writer }</td>
			<td><a href="<%=request.getContextPath()%>/boardlist/${vo.seq}">${vo.title }</a></td>
			<td>${vo.viewcount }</td></tr>
		</c:forEach>
	</table>

	<div class=contents_framework>
		<input class=btn type=button id=write value=글쓰기
		onclick="location.href='<%=request.getContextPath() %>/dogboardwrite'">
		<input class=btn type=button id=return value="메인페이지로 이동"
		onclick="location.href='<%=request.getContextPath() %>/home'">
	</div>

</body>
</html>