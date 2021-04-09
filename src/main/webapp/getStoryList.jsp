<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
</head>
<body>
	<center>
		<h1>글 목록</h1>
		<h3>Tripfull Story</h3>
		
<%-- 		<!-- 검색 시작 -->
		<form action="getStoryList.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0" width="700">
				<tr>
					<td align="right">
					<select name="searchCondition">
						<c:forEach items="${conditionMap}" var="option">
							<option value="${option.value}">${option.key }
						</c:forEach>							
					</select> 
					<input name="searchKeyword" type="text" /> 
					<input type="submit" value="검색" /></td>
				</tr>
			</table>
		</form>
		<!-- 검색 종료 --> --%>
		
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th style="color:white" bgcolor="#58CCFF" width="100">번호</th>
				<th style="color:white" bgcolor="#58CCFF" width="200">제목</th>
				<th style="color:white" bgcolor="#58CCFF" width="150">작성자</th>
				<th style="color:white" bgcolor="#58CCFF" width="150">등록일</th>
				<th style="color:white" bgcolor="#58CCFF" width="100">조회수</th>
			</tr>
			<c:forEach items="${storyList}" var="story">
				<tr>
					<td>${story.story_no}</td>
					<td align="left"><a href="getStory?story_no=${story.story_no}">
							${story.story_title}</a></td>
					<td>${story.members_no}</td>
					<td>${story.story_date}</td>
					<td>${story.story_cnt}</td>
				</tr>
			</c:forEach>
		</table>
		<br> <a href="insertStory.jsp">새글 등록</a>
	</center>
</body>
</html>