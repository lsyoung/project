package com.bread.service;

import java.util.List;

import com.bread.vo.BreadBorderDAO;
import com.bread.vo.BreadBorderVO;

public class BreadBorderService {
	
	BreadBorderDAO dao = new BreadBorderDAO();
	
	//전체리스트
	public List<BreadBorderVO> borderAll(){
		return dao.borderList();
	}
	//한건조회
	public BreadBorderVO borderOne(int borderId) {
		return dao.borderSearch(borderId);
	}
	//등록
	public BreadBorderVO insert(BreadBorderVO vo) {
		try {
			return dao.borderInsert(vo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	//수정
	public BreadBorderVO update(BreadBorderVO vo) {
		return dao.borderUpdate(vo);
	}
	//삭제
	public BreadBorderVO delete(int borderId) {
		return dao.borderDelete(borderId);
	}
}
