<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>borderInsert.jsp</title>
</head>
<body>
	<form action='../borderInsert.do' method='post'>
		<table border='1'>
			<tr>
				<th>NAME</th>
				<td><input type='text' name='borderWriter'></td>
			</tr>
			<tr>
				<th>TITLE</th>
				<td><input type='text' name='borderTitle'></td>
			</tr>
			<tr>
				<th>CONTENT</th>
				<td><textarea rows='10' cols='60' name='borderContent'></textarea></td>
			</tr>
			<tr>
				<td colspan="2" align="right">
					<input type='submit' value='입력'>
					<input type='button' value='취소' onclick="location.href='borderList.jsp'">
				</td>
			</tr>
		</table>
	</form>

</body>
</html>