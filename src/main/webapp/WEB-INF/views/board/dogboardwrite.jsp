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
</head>
<body>
<h1>게시글을 작성하세요</h1>
<form method="post">
	<div>
		제목 <input type=text name=title><br>
	</div>
	<div>
		작성자 <input type=text name=writer><br>
	</div>
	<div>
		내용<br><textarea rows="10px" cols="50px" name=content></textarea>
	</div>
	<div>
		<button type="submit">완료</button><br>
	</div>
	<div>
		<input type=button value="목록" onclick="location.href='<%=request.getContextPath() %>/dogboardlist'"/>
	</div>
</form>
</body>
</html>