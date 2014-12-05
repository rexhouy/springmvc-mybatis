<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Point</title>
</head>
<body>

	<a href="<c:url value="/points/create" />">Create</a>
	<table>
		<c:forEach var="point" items="${points}">
			<tr>
				<td>x</td>
				<td>${point.x }</td>
				<td>y</td>
				<td>${point.y }</td>
				<td><a href="<c:url value="/points/edit/${point.x}" />">Edit</a></td>
				<td><a href="<c:url value="/points/${point.x}" />">Detail</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>