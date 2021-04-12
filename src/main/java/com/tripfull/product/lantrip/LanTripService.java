package com.tripfull.product.lantrip;

import java.util.List;

public interface LanTripService {

	// 온라인투어 목록 보기
	List<LanTripVO>getLanTripList(LanTripVO lanvo);
	
	// 온라인투어 상세 보기
	LanTripVO getLanTripDetail(LanTripVO lanvo);
	
	// 온라인투어 구매 하기
	
}
