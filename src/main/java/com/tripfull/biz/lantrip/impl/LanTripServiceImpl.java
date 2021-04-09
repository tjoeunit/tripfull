package com.tripfull.biz.lantrip.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tripfull.biz.lantrip.LanTripService;
import com.tripfull.biz.lantrip.LanTripVO;


@Service
public class LanTripServiceImpl implements LanTripService {
	
	@Autowired
	private LanTripDAO lanTripDAO;

	@Override
	public void insertLTBoard(LanTripVO vo) {
		lanTripDAO.insertLTBoard(vo);
	}

	@Override
	public List<LanTripVO> getLTBoardList(LanTripVO vo) {
		List<LanTripVO> list = lanTripDAO.getLTBoardList(vo);
		return list;
	}

	@Override
	public LanTripVO getLTBoard(LanTripVO vo) {
		LanTripVO board = lanTripDAO.getLTBoard(vo);
		return board;
	}

	@Override
	public void updateLTBoard(LanTripVO vo) {
		lanTripDAO.updateLTBoard(vo);

	}

	@Override
	public void deleteLTBoard(LanTripVO vo) {
		lanTripDAO.deleteLTBoard(vo);
		
	}

}
