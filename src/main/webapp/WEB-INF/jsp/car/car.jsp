<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title><s:message code="car.title" /></title>
</head>
<body>
	<%@include file="/WEB-INF/incl/menu.app"%>

	<h2>
		<s:message code="car.title" />
	</h2>

	<p align="center">
		<c:out value="${message}" />
	</p>

	<a href="/newcar">Dodaj samochód</a>

	<table width="500" border="1" cellpadding="2" cellspacing="1"
		align="center">
		<TR>
			<TD><s:message code="car.nr" /></TD>
			<TD><s:message code="car.make" /></TD>
			<TD><s:message code="car.model" /></TD>
			<TD><s:message code="car.numberPlate" /></TD>
			<TD><s:message code="car.attentions" /></TD>
			<TD><s:message code="car.mileage" /></TD>
		</TR>
		<c:forEach var="i" begin="0" end="${cars.size()-1}">

			<TR>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${i+1}" /></a></TD>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${cars[i].make}" /></a></TD>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${cars[i].model}" /></a></TD>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${cars[i].numberPlate}" /></a></TD>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${cars[i].attentions}" /></a></TD>
				<TD><a href="/carmileages?car=${cars[i].id}"><c:out
							value="${cars[i].currentMileage}" /></a></TD>
			</TR>
		</c:forEach>
	</table>

	<%-- 

	<form action="carmileages" method="POST">
		<input name="number" type="text" /> <input type="submit"
			value="Wyszukaj" /> <font color="red"><sf:errors
				path="number" /></font>
	</form>
 --%>


</body>
</html>