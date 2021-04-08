package com.tripfull.test.story.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class StoryDAO {		//Data Access Object (CRUD 관련 메서드 구현)
/*	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	BoardVO board = new BoardVO();
	
	//nvl(?, ?) : 첫번째 매개변수의 값이 null 일경우 두번째 매개변수 값을 반환. null이 아니면 첫번째 매개변수 값을 반환.
	private final String BOARD_INSERT = "insert into springboard(seq, title, writer, content) values((select nvl(max(seq), 0)+1 from springboard),?,?,?)";
	private final String BOARD_LIST = "select * from springboard order by seq desc";
	private final String BOARD_VIEW = "select * from springboard where seq = ?";
	private final String BOARD_UPDATE = "update springboard set title=?, content=? where seq = ?";
	private final String BOARD_DELETE = "delete from springboard where seq=?";
	private final String BOARD_LIST_T = "select * from springboard where title like '%'||?||'%' order by seq desc";		//?엔 사용자가 입력한 값이, 앞뒤로는 어떤 문자열이 오던 안오던 상관 없도록.
	private final String BOARD_LIST_C = "select * from springboard where content like '%'||?||'%' order by seq desc";
	
	//글 등록
	public void insertBoard(BoardVO vo) {
		System.out.println("===> JDBC로 insertBoard() 기능 처리");
		
		try {
			conn = JDBCUtil.getConnection();		// db와의 연결을 위해 우리가 정의한 메소드 호출
			pstmt = conn.prepareStatement(BOARD_INSERT);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getContent());
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
			
	}
	
	//글 목록 조회
	public List<BoardVO> getBoardList(BoardVO vo){
		System.out.println("===> JDBC로 getBoardList() 기능 처리");
		List<BoardVO> list = new ArrayList<BoardVO>();
		
		try {
			conn = JDBCUtil.getConnection();
			//pstmt = conn.prepareStatement(BOARD_LIST);
			if(vo.getSearchCondition().equals("TITLE")) {
				pstmt = conn.prepareStatement(BOARD_LIST_T);
			}else if(vo.getSearchCondition().equals("CONTENT")) {
				pstmt = conn.prepareStatement(BOARD_LIST_C);
			}
			pstmt.setString(1, vo.getSearchKeyword());
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BoardVO board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
				list.add(board);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		return list;
	}
	
	//글 상세 조회
	public BoardVO getBoard(BoardVO vo){
		System.out.println("===> JDBC로 getBoard() 기능 처리");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_VIEW);
			pstmt.setInt(1, vo.getSeq());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("seq"));
				board.setTitle(rs.getString("title"));
				board.setWriter(rs.getString("writer"));
				board.setContent(rs.getString("content"));
				board.setRegdate(rs.getDate("regdate"));
				board.setCnt(rs.getInt("cnt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);
		}
		
		return board;
	}
	
	//글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> JDBC로 updateBoard() 기능 처리");

		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_UPDATE);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getSeq());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
	}
	
	//글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> JDBC로 deleteBoard() 기능 처리");
		
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(BOARD_DELETE);
			pstmt.setInt(1, vo.getSeq());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}
		
	}
	*/
}
