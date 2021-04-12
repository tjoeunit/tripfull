<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@ include file="../../import/top.jsp" %>

<style type="text/css">	
	.MainTitle {
		align-content: left;
		margin-left: 360px;
	}
	
	.Lan_Filter {
		border: 1px solid #58CCFF;
		width: 1000px;
		margin-left: 360px;
		margin-right: auto;
		margin-bottom: 20px;
	}
	
	.Lan_Filter_Name {
		color: #58CCFF;
	}
	
	.Lan_Filter ul li {
		color: #000000;
		padding-left: 30px;
		display: inline;
	}
	
	.Lan_Products_Area {
		width: 1000px;
		margin-left: 360px;
		margin-right: auto;
		margin-bottom: 30px;
	}
	
	.Lan_Product {
		width: 300px;
		height: 400px;
		border: 1px solid gray;
		margin: 13px;
		display: inline-block;
	}
	
	.Lan_Product_Thumb {
		width: 300px;
		height: 300px;
		border: 1px solid gray;
	}
	
</style>

<main>
	
	<h1 class="MainTitle">	랜선여행</h1>
	
	<div class="Lan_Filter">
		<ul class="Lan_Filter_Name">카테고리
			<li>전체</li>
			<li><a href="#">사진 여행</a></li>
			<li><a href="#">영상 여행</a></li>
		</ul>
		<ul class="Lan_Filter_Name">가격대
			<li><input type="number">원 이하</li>
		</ul>
		<ul class="Lan_Filter_Name">평점
			<li><input type="radio" checked="checked">전체</li>
			<li><input type="radio">4점 이상</li>
			<li><input type="radio">5점만</li>
		</ul>
		<ul class="Lan_Filter_Name">여행지
			<li><input type="checkbox">아시아</li>
			<li><input type="checkbox">유럽</li>
			<li><input type="checkbox">북아메리카</li>
			<li><input type="checkbox">남아메리카</li>
			<li><input type="checkbox">아프리카</li>
			<li><input type="checkbox">오세아니아</li>
		</ul>
	</div>
	
	<c:forEach items="${ lanTripList }" var="lanTrip">
 	<div class="Lan_Products_Area">
		<div class="Lan_Product"><a href="getLanTrip?lantrip_no=${lanTrip.lantrip_no}"></a>
			<div class="Lan_Product_Thumb">${ lanTrip.lantrip_thumb }</div>
			<div>${ lanTrip.lantrip_title }</div>
			<div>평점</div>
			<div>${ lanTrip.lantrip_price }</div>
		</div>
	</div>
	</c:forEach>
	
</main>
<%@ include file="../../import/top.jsp" %>