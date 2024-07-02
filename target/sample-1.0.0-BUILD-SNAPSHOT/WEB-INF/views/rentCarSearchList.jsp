<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
td, th {
	padding: 5px;
}
</style>
<title>車両検索画面</title>
</head>
<body>
	<h1>車両検索</h1>
	<form:form action="/rent_car_search_list" modelAttribute="rentCarInfo">
		<table cellpadding="1">
			<tr>
				<th valign="top" align="right">車両管理番号：</th>
				<td><form:input path="carManagementNo" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">車種名：</th>
				<td><form:input path="carModelName" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">店舗名：</th>
				<td><form:input path="shopName" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">ETC設置有無：</th>
				<td><form:select path="etcValue"><form:options items="${etc}" itemLabel="label" itemValue="etc" /></form:select></td>
			</tr>
			<tr>
				<th valign="top" align="right">カーナビ設置有無：</th>
				<td><form:select path="carNavigationValue"><form:options items="${carNavigation}" itemLabel="label" itemValue="carNavigation" /></form:select></td>
			</tr>
			<tr>
				<th valign="top" align="right">喫煙・禁煙区分：</th>
				<td><form:select path="smokingKbnValue"><form:options items="${smokingKbn}" itemLabel="label" itemValue="smokingKbn" /></form:select></td>
			</tr>
			<tr >
				<td colspan="2" align="center"><input type="submit" value="検索" /></td>
			</tr>
		</table>
	</form:form>
	<p><hr></p>
	<table cellpadding="1" border="1">
		<tr>
			<th valign="top" align="center">車両管理番号</th>
			<th valign="top" align="center">車種名</th>
			<th valign="top" align="center">店舗名</th>
			<th valign="top" align="center">ETC設置有無</th>
			<th valign="top" align="center">カーナビ設置有無</th>
			<th valign="top" align="center">喫煙・禁煙区分</th>
		</tr>
		<c:forEach items="${rentCarInfoList}" var="car">
			<tr>
				<td><c:out value="${car.carManagementNo}" /></td>
				<td><c:out value="${car.carModelName}" /></td>
				<td><c:out value="${car.shopName}" /></td>
				<td><c:out value="${car.etc}" /></td>
				<td><c:out value="${car.carNavigation}" /></td>
				<td><c:out value="${car.smokingKbn}" /></td>
			</tr>
		</c:forEach>
	</table>
	<p></p>
	<table cellpadding="3">
		<tr >
			<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'"></td>
		</tr>
	</table>
	<p></p>
</body>
</html>
