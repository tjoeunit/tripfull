<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ include file="../../import/top.jsp" %>

<style type="text/css">	
	.Lan_Product_Area{
		margin-left: 360px;
		width: 1200px;
		display: inline-block;
	}
	
	.MainTitle {
		text-align: left;
		width: 600px;
		height: 50px;
		display: inline-block;
	}
	
	.LanPrice {
		width: 200px;
		height: 50px;
		text-align: right;
		font-size: 20px;
		display: inline-block;
	}
	
	.BuyBox {
		color: white;
		font-style: b;
		background-color: #58CCFF;
		width: 100px;
		height: 50px;
		display: inline-block;
	}
	
	
</style>

<main>
	
	<div class="Lan_Product_Area">
		<br>
		<h1 class="MainTitle">상품이름<%-- 	${ lanTrip.lantrip_title } --%></h1>
			<div class="LanPrice">가격 12,900원</div>
			<div class="BuyBox">구입하기</div>
		</div>
	</div>
	
	
	
</main>
<%@ include file="../../import/top.jsp" %>