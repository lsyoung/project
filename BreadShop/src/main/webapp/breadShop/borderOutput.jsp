
<%@page import="com.bread.vo.BreadBorderDAO"%>
<%@page import="com.bread.service.BreadBorderService"%>
<%@page import="com.bread.vo.CommentVO"%>
<%@page import="com.bread.vo.BreadBorderVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>borderOutput.jsp</title>
</head>
<body>
	<%
	BreadBorderVO vo = (BreadBorderVO) request.getAttribute("border");
	BreadBorderVO vo1 = (BreadBorderVO) request.getAttribute("borderId");	
	%>
		<table border='1'>
			<tr>
				<th>NAME</th>
				<td><%=vo.getBorderWriter() %></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><%=vo.getBorderTitle() %></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows='10' cols='60' readonly="readonly"><%=vo.getBorderContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="2">
					<button onclick="location.href='breadShop/borderUpdate.jsp'">수정</button>&nbsp;&nbsp;
					<button onclick="location.href='borderDelete.do?borderId=<%=vo1.getBorderId() %>'">삭제</button>&nbsp;&nbsp;
					<button onclick="location.href='breadShop/borderList.jsp'">목록</button>&nbsp;&nbsp;
				</td>
			</tr>
		</table>

</body>
</html>