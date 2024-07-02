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
	<h1>会員登録（登録内容確認）</h1>
	<hr color="blue" size="0">
	<form:form action="/reg_sample_1_completion" modelAttribute="userInfo">
		<table cellspacing="0">
			<tr>
				<th valign="top" align="right" class="border_right">ユーザID：</th>
				<td colspan="2"><c:out value="${userInfo.userId}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">名前：</th>
				<td colspan="2"><c:out value="${userInfo.userName}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">性別：</th>
				<td colspan="2"><c:out value="${userInfo.sexView}" /><form:hidden path="sex" value="${userInfo.sex}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">生年月日：</th>
				<td colspan="2"><c:out value="${userInfo.birthday}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">住所：</th>
				<td colspan="2"><c:out value="${userInfo.address}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">電話番号：</th>
				<td colspan="2"><c:out value="${userInfo.telephone}" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">メールアドレス：</th>
				<td colspan="2"><c:out value="${userInfo.mail}" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="確認" /></td>
				<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'"></td>
			</tr>
		</table>
	</form:form>
	<p></p>
</body>
</html>
