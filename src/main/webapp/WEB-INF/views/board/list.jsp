<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트 | 구디</title>
</head>
<body>
	<div>
		<h1>List Page</h1>
		<table border="1">
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>조회수</th>
			</tr>
			</div>
			<div style="">
				<c:forEach items="${requestScope.list}" var="dto">
					<tr>
						<td>${dto.boardNo}</td>
						<td><a href="./detail.gm?boardNo=${dto.boardNo}">${dto.title}</a></td>
						<td>${dto.userName}</td>
						<td>${dto.boardDate}</td>
						<td>${dto.views}</td>
					</tr>
				</c:forEach>
			</div>
		</table>
		<br>
		<button>글쓰기</button>
		&emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &emsp; &ensp; &ensp;
		<button type="button" onclick="location.href='../'">메뉴</button>
</body>
</html>

<%--
&nbsp; - 작은 스페이스
&ensp; - 보통 스페이스
&emsp; - 큰 스페이스
 --%>