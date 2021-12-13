package com.bread.service;

import java.util.List;

import com.bread.vo.CommentDAO;
import com.bread.vo.CommentVO;

public class CommentService {
	
	CommentDAO dao = new CommentDAO();
	
	public List<CommentVO> commentAll(){
		return dao.commentList();
	}
	
	//등록  
	public CommentVO insert(CommentVO vo) {
		try {
			return dao.commentInsert(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//수정 
	public CommentVO update(CommentVO vo) {
		return dao.commentUpdate(vo);
	}
	//삭제
	public int delete(int commentNo) {
		return dao.commentDelete(commentNo);
	}
}
