<%@page import="java.util.List"%>
<%@page import="com.bread.vo.BreadBorderVO"%>
<%@page import="com.bread.vo.BreadBorderDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>borderList.jsp</title>
</head>
<%
BreadBorderDAO dao = new BreadBorderDAO();
List<BreadBorderVO> list = dao.borderList();
//List<BreadBorderVO> list = (List<BreadBorderVO>) request.getAttribute("borderList");
%>
<body>
	<button onclick="location.href='borderInsert.jsp'">글쓰기</button>
	<table border="1">
		<thead>
			<tr>
				<th>No</th>
				<th>Title</th>
				<th>Name</th>
			</tr>
		<thead>
			<%
			for (int i = 0; i < list.size(); i++) {
			%>
		
		<tbody>
			<tr>
				<td><a href="borderOutput.jsp?borderId=<%=list.get(i).getBorderId()%>"><%=list.get(i).getBorderId()%></a></td>
				<td><%=list.get(i).getBorderTitle()%></td>
				<td><%=list.get(i).getBorderWriter()%></td>
			</tr>
			<%
			}
			%>
		</tbody>
	</table>
	<form id='breadshop' action='../borderOne.do' method='post'>
		<input type='hidden' name='borderId'>
	</form>
</body>
</html>