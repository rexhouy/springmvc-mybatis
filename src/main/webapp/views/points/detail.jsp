<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Point Detail</title>
</head>
<body>
	<table>
		<tr>
			<td>X:</td>
			<td>${point.x}</td>
		</tr>
		<tr>
			<td>Y:</td>
			<td>${point.y }</td>
		</tr>
	</table>
	<a href="<c:url value="/points" />">back</a>
</body>
</html>