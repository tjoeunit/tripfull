<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>랜선여행::여행가득</title>

<style type="text/css">

	.MainTitle {
		align-content: left;
	}
	
	.Lan_Filter {
		border: 1px solid #58CCFF;
		width: 1500px;
		margin: auto;
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
		width: 1400px;
		margin: auto;
	}
	
	.Lan_Products {
		width: 300px;
		height: 400px;
		border: 1px solid gray;
		margin: 20px;
		float: left;
		display: inline-block;
	}
	
	.Lan_Product_Thum {
		width: 300px;
		height: 300px;
		border: 1px solid gray;
	}
	
</style>

</head>
<body>
	
	<div>상단바 로고/검색/로그인/회원가입</div>
	<div>홈/항공권/숙소/액티비티/랜선투어/여행스토리</div>
	<hr>
	
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
	
 	<div class="Lan_Products_Area">
		<div class="Lan_Products">
			<div class="Lan_Product_Thum">이미지삽입 / 테투리는 없앨예정</div>
			<div>상품이름</div>
			<div>평점</div>
			<div>가격</div>
			
		</div>
		<div class="Lan_Products">
			상품2
		</div>
		<div class="Lan_Products">
			상품3
		</div>
		<div class="Lan_Products">
			상품4
		</div>
		<div class="Lan_Products">
			상품5
		</div>
		<div class="Lan_Products">
			상품6
		</div>
		<div class="Lan_Products">
			상품7
		</div>
		<div class="Lan_Products">
			상품8
		</div>
		<div class="Lan_Products">
			상품9
		</div>
		<div class="Lan_Products">
			상품10
		</div>
		<div class="Lan_Products">
			상품11
		</div>
		<div class="Lan_Products">
			상품12
		</div>
	</div> 
	
</body>
</html>