<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert asd here</title>
</head>
<body>
	<%@include file="/WEB-INF/incl/menu.app"%>
	<iframe width="425" height="350" frameborder="0" scrolling="no"
		marginheight="0" marginwidth="0"
		src="https://master.apis.dev.openstreetmap.org/export/embed.html?bbox=20.56228637695313%2C52.80442185934104%2C22.855682373046875%2C53.49049675052435&amp;layer=mapnik&amp;marker=53.14882941891124%2C21.708984375"
		style="border: 1px solid black"></iframe>
	<br />
	<small><a
		href="https://master.apis.dev.openstreetmap.org/?mlat=53.1488&amp;mlon=21.7090#map=10/53.1488/21.7090">Wyświetl
			większą mapę</a></small> Strona startowa
</body>
</html>