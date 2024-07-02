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
<title>車両情報画面</title>
</head>
<body>
	<h1>車両情報</h1>
	<table cellpadding="3">
		<tr>
			<th valign="top" align="right">車両管理番号：</th>
			<td><c:out value="${rentCarInfo.carManagementNo}" /></td>
		</tr>
		<c:if test="${not empty rentCarInfo.carModelName}">
			<tr>
				<th valign="top" align="right">車種名：</th>
				<td><c:out value="${rentCarInfo.carModelName}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">店舗名：</th>
				<td><c:out value="${rentCarInfo.shopName}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">ETC設置有無：</th>
				<td><c:out value="${rentCarInfo.etc}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">カーナビ設置有無：</th>
				<td><c:out value="${rentCarInfo.carNavigation}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right">喫煙・禁煙区分：</th>
				<td><c:out value="${rentCarInfo.smokingKbn}" /></td>
			</tr>
		</c:if>
		<c:if test="${empty rentCarInfo.carModelName}">
			<tr>
				<th></th>
				<td>対象データがありません</td>
			</tr>
		</c:if>
		<tr >
			<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'"></td>
			<td align="center"><input type="button" value="検索画面（車両管理番号）へ" onClick="location.href='http://localhost:8080/rent_car_search_input'"></td>
		</tr>
	</table>
	<p></p>
</body>
</html>
