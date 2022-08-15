<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>수정하기 | 구디</title>
</head>
<body>
	<h1>Update Page</h1>
	<form action="./update.gm" method="post">
		<table border="1">
			<tr>
				<th>제목</th>
				<th>내용</th>
			</tr>
			<tr>
				<td>${dto.title}</td>
				<td>${dto.contant}</td>
			</tr>
		</table>
	</form>
</body>
</html>