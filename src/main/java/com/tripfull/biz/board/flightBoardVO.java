package com.tripfull.biz.board;

public class flightBoardVO { //Value Object , DTO 와 같다 .
	private int no;
	private String title;
	private String content;
	private String img;
	private String thumb;
	private int price;
	private String departure;
	private String arrival;
		
	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getThumb() {
		return thumb;
	}


	public void setThumb(String thumb) {
		this.thumb = thumb;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getDeparture() {
		return departure;
	}


	public void setDeparture(String departure) {
		this.departure = departure;
	}


	public String getArrival() {
		return arrival;
	}


	public void setArrival(String arrival) {
		this.arrival = arrival;
	}


	@Override
	public String toString() { // 우리가 원하는 기능을 구현 가능 , 원래는 자료형의 특징이 뭔지 설명하는게 목적이였지만 	
		String value = "BoardVO [no = "+no+
											", title = "+title+
											", content = "+content+
											", departure = "+departure+
											", arrival = "+arrival+"]";		
		
		return value;
	}	
}


