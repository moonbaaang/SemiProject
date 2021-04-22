<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>전국구 집사</title>
</head>
<body>
<h1>
	전국구 집사 메인페이지입니다.
</h1>

<div>
	<a href="<%=request.getContextPath() %>/boardlist">애견 talk</a>
	<a href="<%=request.getContextPath() %>/catboardlist">애묘 talk</a>
</div>
</body>
</html>
