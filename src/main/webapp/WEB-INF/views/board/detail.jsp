<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세보기 | 구디</title>
</head>
<body>
	<h1>Detail Page</h1>
	<table border="1">
		<tr>
			<th>제목</th>
			<th>내용</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
		<tr>
			<td>${dto.title}</td>
			<td>${dto.contant}</td>
			<td>${dto.userName}</td>
			<td>${dto.boardDate}</td>
			<td>${dto.views}</td>
		</tr>
	</table>
	<br>

	<button>글 쓰기</button>
	<button><a href="./update.gm?boardNo=${dto.boardNo}">수정</a></button>
	<button>삭제</button>
	&emsp; &emsp; &emsp; &ensp;
	<button><a href="./list.gm">목록</a></button>

</body>
</html>

<%--
&nbsp; -작은 스페이스
&ensp; -보통 스페이스
&emsp;  -큰 스페이스
 --%>