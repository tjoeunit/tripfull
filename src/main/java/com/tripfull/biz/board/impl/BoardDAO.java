package com.tripfull.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tripfull.biz.board.flightBoardVO;
import com.tripfull.biz.common.JDBCUtil;

@Repository
public class BoardDAO { // Data Access Object
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	private final String BOARD_LIST ="select * from springboard order by seq desc";
	
	//글 목록 조회
	public List <flightBoardVO> getBoardList(flightBoardVO vo){
		System.out.println("===>JDBC로 getBoardList() 기능 처리");
		List<flightBoardVO> list = new ArrayList<flightBoardVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_LIST);
			rs = pstmt.executeQuery(); 
			while(rs.next()) { 
				flightBoardVO board = new flightBoardVO();
				board.setNo(rs.getInt("no"));//
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setImg(rs.getString("img"));
				board.setThumb(rs.getString("thumb"));
				board.setPrice(rs.getInt("price"));
				board.setDeparture(rs.getString("departure"));
				board.setArrival(rs.getString("arrival"));
				list.add(board); 
			}
			
		} catch (SQLException e) {			
			e.printStackTrace();
		}finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}

}
