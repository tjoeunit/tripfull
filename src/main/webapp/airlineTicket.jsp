<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>항공권 목록</title>
</head>
<body>
		<table border="1" cellpadding="0" cellspacing="0" width="700">
			<tr>
				<th width="100">항공업체</th>
				<th width="150">가격</th>	
			</tr>	
			<c:forEach items="${boardList }" var="board">
			   	<tr>
					<td>${board.title}</td>
					<td>${board.price}</td>					
				</tr>
			</c:forEach>
		</table>

		<!-- <form action="">
		<h3>제주</h3><a href="getBoard.do">선택</a> -->
		
</body>
</html>