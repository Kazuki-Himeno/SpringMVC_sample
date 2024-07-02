<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td, th {
	padding: 20px;
}
</style>
<title>車両検索画面</title>
</head>
<body>
	<h1>車両検索</h1>
	<form:form action="/rent_car_search" modelAttribute="rentCarInfo">
		<table cellpadding="3">
			<tr>
				<th valign="top" align="right">車両管理番号：</th>
				<td><form:input path="carManagementNo" /></td>
			</tr>
			<tr >
				<td colspan="2" align="center"><input type="submit" value="検索" /></td>
			</tr>
		</table>
		<p></p>
	</form:form>
</body>
</html>
