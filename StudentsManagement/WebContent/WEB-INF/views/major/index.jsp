<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<script type="text/javascript">
	function submitDelete(id) {
		if (confirm("Are you sure to delete it？")) {
			var form = document.getElementById("form");
			form.action ="major/" + id;
			form.submit();
		}

	}
</script>
<form:form method="DELETE" action="major/" id="form">
	<table>
		<tr>
			<th>Name</th>
			<th>detail</th>
			<th>edit</th>
			<th>delete</th>
		</tr>
		<c:forEach items="${majorList}" var="major">
			<tr>
				<td>${major.name}</td>
				<td><a href="major/${major.id}">detail</a></td>
				<td><a href="major/${major.id}/edit">edit</a></td>
				<td><a href="javascript:void(0)"
					onclick="submitDelete(${major.id})">delete</a></td>
			</tr>
		</c:forEach>
	</table>
</form:form>
<a href="major/editNew">createNew</a>