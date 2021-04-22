<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

h1 {

	text-align : center;
	margin-left:auto; 
    margin-right:auto;
	background-color: #FA5858;
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
<script src="/resources/jquery-3.2.1.min.js"></script>
<script>
$(document).ready(function(){

	
});
</script>
</head>
<body>
<div>
	<h1>Arsenal FanPage</h1>
</div>
	<div>
		<input type=button id=write value=글쓰기
		onclick="location.href='<%=request.getContextPath() %>/board/boardwrite'">
		<input type=button id=return value="메인페이지로 이동"
		onclick="location.href='${pageContext.request.contextPath}/'">
	</div>

<div>
	<table>
		<tr bgcolor=#F6CECE><th>글번호</th><th>아이디</th><th>제목</th><th>조회수</th></tr>
		<c:forEach items="${boardlist}" var="vo">
			<tr><td bgcolor=#F6CECE>${vo.seq }</td>
			<td>${vo.writer }</td>
			<td><a href="boardcontent">${vo.title }</a></td>
			<td>${vo.viewcount }</td></tr>
		</c:forEach>
	</table>
</div>

</body>
</html>