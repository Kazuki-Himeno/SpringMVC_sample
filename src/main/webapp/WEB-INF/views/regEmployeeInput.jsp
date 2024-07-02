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
	<form:form action="/reg_employee" modelAttribute="regEmployee">
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
				<td>
					<form:select id="rankId" path="rankId"><form:options items="${rankList}" itemLabel="rankId" itemValue="rankId" /></form:select>
					<input type="text" id="rankName" readonly />
				</td>
				<td><form:errors path="rankId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">役職：</th>
				<td>
					<form:select path="positionId"><form:options items="${positionList}" itemLabel="positionId" itemValue="positionId" /></form:select>
					<input type="text" id="positionName" readonly />
				</td>
				<td><form:errors path="positionId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">勤務パターン：</th>
				<td><form:select path="workPatternId"><form:options items="${workPatternList}" itemLabel="workPatternName" itemValue="workPatternId" /></form:select></td>
				<td><form:errors path="workPatternId" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">部：</th>
				<td><form:select id="part1" path="part1"><form:options items="${part1List}" itemLabel="partName" itemValue="partId" /></form:select></td>
				<td><form:errors path="part1" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">課：</th>
				<td><form:select id="part2" path="part2"><form:options items="${part2List}" itemLabel="partName" itemValue="partId" /></form:select></td>
				<td><form:errors path="part2" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<th valign="top" align="right" class="border_right">係：</th>
				<td><form:select id="part3" path="part3"><form:options items="${part3List}" itemLabel="partName" itemValue="partId" /></form:select></td>
				<td><form:errors path="part3" element="div" style="color: red" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="登録" /></td>
				<td align="center"><input type="button" value="メニュー画面へ" onClick="location.href='http://localhost:8080/'"></td>
			</tr>
		</table>
	</form:form>
	<script src="//code.jquery.com/jquery-1.12.4.min.js" type="text/javascript"></script>
	<script  type="text/javascript">
		$(function () {
			$("#rankId").change(function() {
				if (!$("#rankId").val()) {
					$("#rankName").val("");
				} else {
					$.ajax({
						type: "GET",
						url: "rank/" + $("#rankId").val(),
						scriptCharset: 'utf-8',
						success: function(result) {
							$("#rankName").val(result);
						}
					});
				}
			});
			$("#positionId").change(function() {
				if (!$("#positionId").val()) {
					$("#positionName").val("");
				} else {
					$.ajax({
						type: "GET",
						url: "position/" + $("#positionId").val(),
						scriptCharset: 'utf-8',
						success: function(result) {
							$("#positionName").val(result);
						}
					});
				}
			});
			$("#part1").change(function() {
				$.ajax({
					type: "GET",
					url: "part/1to2/" + $("#part1").val(),
					scriptCharset: 'utf-8',
					success: function(result) {
						$("#part2").html(result);
					}
				});
				$.ajax({
					type: "GET",
					url: "part/1to3/" + $("#part1").val(),
					scriptCharset: 'utf-8',
					success: function(result) {
						$("#part3").html(result);
					}
				});
			});
			$("#part2").change(function() {
				if (!$("#part2").val()) {
					return;
				}
				$.ajax({
					type: "GET",
					url: "part/2to3/" + $("#part2").val(),
					scriptCharset: 'utf-8',
					success: function(result) {
						$("#part3").html(result);
					}
				});
			});
		});
	</script>
</body>
</html>
