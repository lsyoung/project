package com.bread.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bread.service.BreadBorderService;
import com.bread.vo.BreadBorderVO;

public class BorderListController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		BreadBorderService service = new BreadBorderService();
		List<BreadBorderVO> list = service.borderAll();
		
		req.setAttribute("borderList", list);
		req.getRequestDispatcher("breadShop/borderList.jsp").forward(req, res);

	}

}
