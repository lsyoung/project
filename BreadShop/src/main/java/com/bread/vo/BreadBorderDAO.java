package com.bread.vo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bread.dao.DAO;

public class BreadBorderDAO extends DAO {

	// 전체리스트
	public List<BreadBorderVO> borderList() {
		List<BreadBorderVO> list = new ArrayList();
		String sql = "select * from bread_border";
		connect();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				BreadBorderVO vo = new BreadBorderVO();
				vo.setBorderId(rs.getInt("border_id"));
				vo.setBorderTitle(rs.getString("border_title"));
				vo.setBorderContent(rs.getString("border_content"));
				vo.setBorderWriter(rs.getString("border_writer"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 한건조회
	public BreadBorderVO borderSearch(int borderId) {

		String sql = "select * from bread_border where border_id=? ";
		connect();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, borderId);
			rs = psmt.executeQuery();
			if (rs.next()) {
				BreadBorderVO vo = new BreadBorderVO();
				vo.setBorderId(rs.getInt("border_id"));
				vo.setBorderTitle(rs.getString("border_title"));
				vo.setBorderContent(rs.getString(" border_content"));
				vo.setBorderWriter(rs.getString("border_writer"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	// 등록
	public BreadBorderVO borderInsert(BreadBorderVO vo) throws Exception {
		String getsql = "select value from repository where name='bread_border'";
		String sql = "insert into bread_border values (?,?,?,?)";
		String changesql = "update repository set value=? where name='bread_border'";

		int seq = -1;
		connect();

		stmt = conn.createStatement();
		rs = stmt.executeQuery(getsql);
		if (rs.next()) {
			seq = rs.getInt(1);
		}
		seq++;
		System.out.println(vo);
		psmt = conn.prepareStatement(sql);
		psmt.setInt(1, seq);
		psmt.setString(2, vo.getBorderTitle());
		psmt.setString(3, vo.getBorderContent());
		psmt.setString(4, vo.getBorderWriter());

		int r = psmt.executeUpdate();
		System.out.println(r + "건 등록");
		
		psmt = conn.prepareStatement(changesql);
		psmt.setInt(1, seq);
		r = psmt.executeUpdate();
		System.out.println(r + "건 변경");

		vo.setBorderId(seq);

		disconnect();
		return vo;
	}

	// 수정
	public BreadBorderVO borderUpdate(BreadBorderVO vo) {
		String sql = "update bread_border " + "set  border_title=?, " 
											+ "     border_content=?" 
											+ "where border_id=?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getBorderTitle());
			psmt.setString(2, vo.getBorderContent());
			psmt.setInt(3, vo.getBorderId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

	// 삭제
	public BreadBorderVO borderDelete(int borderId) {
		BreadBorderVO vo = borderSearch(borderId);
		String sql = "delete from bread_border where border_id=?";
		connect();
	
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, borderId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
}
