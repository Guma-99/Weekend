package com.gm.start.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import com.gm.start.util.DBConnector;

public class BoardDAO {
	public ArrayList<BoardDTO> getList() throws Exception {
		ArrayList<BoardDTO> ar = new ArrayList<BoardDTO>();

		Connection con = DBConnector.getConnection();

		String sql = "SELECT * FROM BOARD ORDER BY BOARDNO DESC";

		PreparedStatement st = con.prepareStatement(sql);

		ResultSet rs = st.executeQuery();

		while (rs.next()) {
			BoardDTO boardDTO = new BoardDTO();

			boardDTO.setBoardNo(rs.getLong("boardNO"));
			boardDTO.setTitle(rs.getString("title"));
			boardDTO.setUserName(rs.getString("userName"));
			boardDTO.setBoardDate(rs.getDate("boardDate"));
			boardDTO.setViews(rs.getInt("views"));

			ar.add(boardDTO);
		}

		return ar;

	}

	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		BoardDTO boardDTO2 = null;

		Connection con = DBConnector.getConnection();

		String sql = "SELECT * FROM BOARD WHERE BOARDNO = ?";

		PreparedStatement st = con.prepareStatement(sql);

		st.setLong(1, boardDTO.getBoardNo());

		ResultSet rs = st.executeQuery();

		if (rs.next()) {
			boardDTO2 = new BoardDTO();
			
			boardDTO2.setBoardNo(rs.getLong("boardNo"));
			boardDTO2.setTitle(rs.getString("title"));
			boardDTO2.setContant(rs.getString("contant"));
			boardDTO2.setUserName(rs.getString("userName"));
			boardDTO2.setBoardDate(rs.getDate("boardDate"));
			boardDTO2.setViews(rs.getInt("views"));
		}

		return boardDTO2;

	}

	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// 1. DB 연결
		Connection con = DBConnector.getConnection();

		// 2. SQL문 생성
		String sql = "UPDATE BOARD SET TITLE = ?, CONTANT = ? BOARDDATE = SYSDATE WHERE BOARDNO = ?";

		// 3. 미리 보내기
		PreparedStatement st = con.prepareStatement(sql);

		// 4. ? 세팅
		st.setString(1, boardDTO.getTitle());
		st.setString(2, boardDTO.getContant());
		st.setLong(3, boardDTO.getBoardNo());

		// 5. 최종 전송 후 결과 처리
		int result = st.executeUpdate();
		DBConnector.disConnect(st, con);

		// 6. 연결 해제
		return result;
	}
}
