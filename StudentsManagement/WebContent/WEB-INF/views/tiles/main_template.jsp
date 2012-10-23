<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="t" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>StudentsManagement</title>
<script type="text/javascript"
	src="<s:url value="/resources/script/jquery-1.8.2.min.js"/>"></script>
<link
	href="<s:url value="/resources/css/jquery-ui-1.8.23.custom.css" />"
	rel="stylesheet" type="text/css" />
</head>

<body>
	<div id="container">
		<div id="head">
		
		</div>
		<div id="content">
			<t:insertAttribute name="content" />
			<!--<co id="co_tile_content" />-->
		</div>
	</div>
</body>
</html>