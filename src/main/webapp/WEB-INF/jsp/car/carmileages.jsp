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

	<a href="/newcarmileage?car=${carId}">Dodaj przejazd</a>

	<c:choose>
		<c:when test="${numbers.size() <1 }">
			<p align="center">
				<s:message code="car.emptyMilleageList" />
		</c:when>

		<c:otherwise>


			<table width="500" border="1" cellpadding="4" cellspacing="1"
				align="center">
				<TR>
					<TD><s:message code="carMileage.startPlace" /></TD>
					<TD><s:message code="carMileage.endPlace" /></TD>
					<TD><s:message code="carMileage.startMileage" /></TD>
					<TD><s:message code="carMileage.endMileage" /></TD>
					<TD><s:message code="button.delete" /></TD>
					<TD><s:message code="button.delete" /></TD>
				</TR>
				<c:forEach var="i" begin="0" end="${numbers.size()-1}">
					<TR>
						<TD><c:out value="${numbers[i].startPlace}" /></TD>
						<TD><c:out value="${numbers[i].endPlace}" /></TD>
						<TD><c:out value="${numbers[i].startMileage}" /></TD>
						<TD><c:out value="${numbers[i].endMileage}" /></TD>
						<TD><sf:form modelAttribute="transferObject"
								id="removemileageForm" action="removemileage"
								enctype="multipart/form-data" method="POST">
								<sf:hidden path="val" value="${numbers[i].id}" />
								<input type="submit" value="<s:message code="button.delete"/>"
									class="formbutton" />
							</sf:form></TD>
						<TD><sf:form modelAttribute="transferObject"
								id="editmileageForm" action="editcarmileage?car=${carId}"
								enctype="multipart/form-data" method="POST">
								<sf:hidden path="val" value="${numbers[i].id}" />
								<input type="submit" value="<s:message code="button.edit"/>"
									class="formbutton" />
							</sf:form></TD>
					</TR>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	<%-- 	<a href ="carmileage?car=${numbers[i].carId}&rmMil=${numbers[i].id}"><c:out value="${numbers[i].endMileage}" /></a> --%>
	<center>
		<input type="button" value="<s:message code="button.back"/>"
			class="formbutton"
			onclick="window.location.href='${pageContext.request.contextPath}/car'" />
	</center>
</body>
</html>