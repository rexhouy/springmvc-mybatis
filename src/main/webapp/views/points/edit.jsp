<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<title>Point Edit</title>
</head>
<body>
	<form:form method="PUT" action="../edit">
		<table>
			<tr>
				<td><form:label path="x">X:</form:label></td>
				<td><form:input path="x" /></td>
			</tr>
			<tr>
				<td><form:label path="y">Y:</form:label></td>
				<td><form:input path="y" /></td>
			</tr>
		</table>
		<input type="submit" value="submit" name="submit">
	</form:form>
</body>
</html>