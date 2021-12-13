package com.bread.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {

	HashMap<String, Controller> list = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<String, Controller>();
		list.put("/borderList.do", new BorderListController());
		list.put("/borderInsert.do", new BorderInsertControlloer());	
		list.put("/borderUpdate.do", new BorderUpdateControlloer());
		list.put("/borderDelete.do", new BorderDeleteControlloer());
		list.put("/borderOne.do", new BorderOneController());
		list.put("/commentInsert.do", new CommentInsertController());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String url = req.getRequestURI();
		String context = req.getContextPath();
		String path = url.substring(context.length());

		Controller subCont = list.get(path);
		subCont.execute(req, res);
	}
}
