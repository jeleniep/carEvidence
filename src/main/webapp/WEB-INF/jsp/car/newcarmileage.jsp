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

	<sf:form id="carsForm" action="addmileage" modelAttribute="mileage"
		enctype="multipart/form-data" method="POST">
		<sf:hidden path="carId" />
		<table width="500" border="0" cellpadding="4" cellspacing="1"
			align="center">

			<tr>
				<td width="130" align="right"><s:message
						code="carMileage.startPlace" /></td>
				<td width="270" align="left"><sf:input path="startPlace"
						size="28" id="name" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="startPlace" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message
						code="carMileage.endPlace" /></td>
				<td width="270" align="left"><sf:input path="endPlace"
						size="28" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="endPlace" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message
						code="carMileage.startMileage" /></td>
				<td width="270" align="left"><sf:input path="startMileage"
						size="28" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="startMileage" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message
						code="carMileage.endMileage" /></td>
				<td width="270" align="left"><sf:input path="endMileage"
						size="28" /></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><font color="red"><sf:errors
							path="endMileage" /></font></td>
			</tr>

			<tr>
				<td width="130" align="right"><s:message code="car.attentions" /></td>
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
					value="<s:message code="button.back"/>" class="formbutton"
					onclick="window.location.href= '/carmileages?car=${carId}'" />
				</td>
			</tr>

		</table>

	</sf:form>

</body>
</html>