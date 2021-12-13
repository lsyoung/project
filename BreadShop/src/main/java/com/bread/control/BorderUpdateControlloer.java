package com.bread.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bread.service.BreadBorderService;
import com.bread.vo.BreadBorderVO;

public class BorderUpdateControlloer implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		int borderId = Integer.parseInt(req.getParameter("borderId"));
		String borderTitle = req.getParameter("borderTitle");
		String borderContent = req.getParameter("borderContent");
		String borderWriter = req.getParameter("borderWriter");

		BreadBorderVO vo = new BreadBorderVO();
		
		vo.setBorderId(borderId);
		vo.setBorderTitle(borderTitle);
		vo.setBorderContent(borderContent);
		vo.setBorderWriter(borderWriter);
		
		BreadBorderService service = new BreadBorderService();
		service.update(vo);
		
		req.setAttribute("newTitle", borderTitle);
		req.setAttribute("newContent", borderContent);
		
		req.getRequestDispatcher("breadShop/borderUpdateOutput.jsp").forward(req, res);
		
		
		
	}

}
