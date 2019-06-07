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

	<sf:form id="carsForm" action="addcar" modelAttribute="car"
		enctype="multipart/form-data" method="POST">

		<table width="500" border="0" cellpadding="4" cellspacing="1"
			align="center">

			<tr>
				<td width="130" align="right"><s:message code="car.make" /></td>
				<td width="270" align="left"><sf:input path="make" size="28"
						id="name" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="make" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message code="car.model" /></td>
				<td width="270" align="left"><sf:input path="model" size="28" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="model" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message code="car.numberPlate" /></td>
				<td width="270" align="left"><sf:input path="numberPlate"
						size="28" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="numberPlate" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message
						code="car.currentMileage" /></td>
				<td width="270" align="left"><sf:input path="currentMileage"
						size="28" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="currentMileage" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message
						code="car.attentions" /></td>
				<td width="270" align="left"><sf:input path="attentions"
						size="28" /></td>
			</tr>


			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="attentions" /></font></td>
			</tr>
			<tr>
				<td colspan="2" align="center" bgcolor="#fff"><input
					type="submit" value="<s:message code="button.register"/>"
					class="formbutton" /> <input type="button"
					value="<s:message code="button.cancel"/>" class="formbutton"
					onclick="window.location.href='${pageContext.request.contextPath}/car'" />
				</td>
			</tr>

		</table>

	</sf:form>

</body>
</html>