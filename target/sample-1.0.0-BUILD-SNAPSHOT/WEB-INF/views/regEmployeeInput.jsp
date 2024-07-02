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
}
table {
	position: relative ;
	top: -8px;
}
</style>
<title>社員登録画面</title>
</head>
<body>
	<h1>社員登録</h1>
	<hr color="black" size="0">
	<form:form action="/reg_employee" modelAttribute="mEmployee">
		<table cellspacing="0">
			<tr>
				<th valign="top" align="right" class="border_right">社員番号：</th>
				<td><form:input path="employeeNo" /></td>
				<td><form:errors path="employeeNo" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">社員名：</th>
				<td><form:input path="employeeName" /></td>
				<td><form:errors path="employeeName" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">生年月日：</th>
				<td><form:input path="birthday" /></td>
				<td><form:errors path="birthday" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">性別：</th>
				<td>
					<form:form modelAttribute="radiobuttonsModel">
						<form:radiobuttons path="selectedIsbn" items="${sexList}" itemLabel="label" itemValue="sex" delimiter="&nbsp;&nbsp;&nbsp;"/>
					</form:form>
				</td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">電話番号：</th>
				<td><form:input path="tel" /></td>
				<td><form:errors path="tel" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">メールアドレス：</th>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">住所：</th>
				<td><form:input path="address" /></td>
				<td><form:errors path="address" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">入社日：</th>
				<td><form:input path="employementDate" /></td>
				<td><form:errors path="employementDate" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">階級：</th>
				<td><form:input path="positionId" /></td>
				<td><form:errors path="positionId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">役職：</th>
				<td><form:input path="rankId" /></td>
				<td><form:errors path="rankId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">勤務パターン：</th>
				<td><form:input path="workPatternId" /></td>
				<td><form:errors path="workPatternId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="登録" /></td>
				<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'"></td>
			</tr>
		</table>
	</form:form>
	<p></p>
</body>
</html>
