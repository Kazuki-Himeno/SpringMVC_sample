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
.border_right {
	border-right: solid 2px blue ;
}
table {
	position: relative ;
	top: -8px;
}
</style>
<title>会員登録画面</title>
</head>
<body>
	<h1>会員登録（登録完了）</h1>
	<hr color="blue" size="0">
	<table cellspacing="0">
		<tr>
			<td>ユーザID：<c:out value="${userInfo.userId}" />の登録が完了しました</td>
		</tr>
		<tr>
			<td align="center"><input type="button" value="追加登録" onClick="location.href='http://localhost:8080/reg_sample_1'" /></td>
			<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'" /></td>
		</tr>
	</table>
	<p></p>
</body>
</html>
