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
			<div>
			<tr>
				<th>제목</th>
				<td><input type="text" value="${dto.title}"></td>
			</tr>
			</div>
			<tr>
				<th>내용</th>
				<td><textarea rows="10" cols="50"><c:out
							value="${dto.contant}" /></textarea></td>
				<%-- rows: 세로 cols: 가로 --%>
			</tr>
		</table>
		<br>
		<button type="submit">수정완료</button>
		<button type="button"
			onclick="location.href='./detail.gm?boardNo=${dto.boardNo}'">뒤로가기</button>
	</form>
</body>
</html>