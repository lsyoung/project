<%@page import="com.bread.vo.BreadBorderVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>borderUpdateOutput.jsp</title>
</head>
<body>
    <%
	BreadBorderVO vo = (BreadBorderVO) request.getAttribute("border");
	%>
	<table border='1'>
		<tr>
			<th>NAME</th>
			<td><%=vo.getBorderWriter()%></td>
		</tr>
		<tr>
			<th>TITLE</th>
			<td><%=request.getAttribute("newTitle") %></td>
		</tr>
		<tr>
			<th>CONTENT</th>
			<td><textarea rows='10' cols='60' readonly="readonly"><%=request.getAttribute("newContent")%></textarea></td>
		</tr>
		<tr>
			<td colspan="2">
				<button onclick="location.href='borderList.jsp'">목록</button>
			</td>
		</tr>
	</table>

</body>
</html>