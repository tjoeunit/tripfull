package com.tripfull.biz.lantrip;

import org.springframework.web.multipart.MultipartFile;

public class LanTripVO {
	private int		lantrip_no;
	private String	lantrip_title;
	private String	lantrip_content;
	private MultipartFile	lantrip_img;
	private MultipartFile	lantrip_thumb;
	private int		lantrip_price;
	private String	lantrip_area;
	private String	lantrip_searchCondition;
	private String	lantrip_searchKeyword;
	
	public int getLantrip_no() {
		return lantrip_no;
	}

	public void setLantrip_no(int lantrip_no) {
		this.lantrip_no = lantrip_no;
	}

	public String getLantrip_title() {
		return lantrip_title;
	}

	public void setLantrip_title(String lantrip_title) {
		this.lantrip_title = lantrip_title;
	}

	public String getLantrip_content() {
		return lantrip_content;
	}

	public void setLantrip_content(String lantrip_content) {
		this.lantrip_content = lantrip_content;
	}

	public MultipartFile getLantrip_img() {
		return lantrip_img;
	}

	public void setLantrip_img(MultipartFile lantrip_img) {
		this.lantrip_img = lantrip_img;
	}

	public MultipartFile getLantrip_thumb() {
		return lantrip_thumb;
	}

	public void setLantrip_thumb(MultipartFile lantrip_thumb) {
		this.lantrip_thumb = lantrip_thumb;
	}

	public int getLantrip_price() {
		return lantrip_price;
	}

	public void setLantrip_price(int lantrip_price) {
		this.lantrip_price = lantrip_price;
	}

	public String getLantrip_area() {
		return lantrip_area;
	}

	public void setLantrip_area(String lantrip_area) {
		this.lantrip_area = lantrip_area;
	}

	public String getLantrip_searchCondition() {
		return lantrip_searchCondition;
	}

	public void setLantrip_searchCondition(String lantrip_searchCondition) {
		this.lantrip_searchCondition = lantrip_searchCondition;
	}

	public String getLantrip_searchKeyword() {
		return lantrip_searchKeyword;
	}

	public void setLantrip_searchKeyword(String lantrip_searchKeyword) {
		this.lantrip_searchKeyword = lantrip_searchKeyword;
	}

	// 콜솔에서 확인 가능
	@Override 
	public String toString() {
		return "LanTripVO [lantrip_no="+lantrip_no+", lantrip_title="+lantrip_title+", lantrip_content="+lantrip_content+", lantrip_img"+lantrip_img
				+", lantrip_thumb="+lantrip_thumb+", lantrip_price="+lantrip_price+", lantrip_area"+lantrip_area+"]";
		
	}
	
	
}
