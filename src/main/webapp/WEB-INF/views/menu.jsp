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
<title>メニュー画面</title>
</head>
<body>
	<h1>メニュー</h1>
	<table cellpadding="3">
		<tr>
			<td><input type="button" value="検索画面（車両管理番号）" onClick="location.href='http://localhost:8080/rent_car_search_input'"></td>
		</tr>
		<tr >
			<td><input type="button" value="検索画面（リスト検索）" onClick="location.href='http://localhost:8080/rent_car_search_list_input'"></td>
		</tr>
		<tr >
			<td><input type="button" value="会員登録画面１" onClick="location.href='http://localhost:8080/reg_sample_1'"></td>
		</tr>
		<tr >
			<td><input type="button" value="社員登録画面（サンプル）" onClick="location.href='http://localhost:8080/reg_employee'"></td>
		</tr>
	</table>
	<p></p>
</body>
</html>
