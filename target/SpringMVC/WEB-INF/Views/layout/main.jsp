<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.logging.Logger"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<tiles:importAttribute name="title" />
<title><spring:message code="${title}"></spring:message></title>
<title>Spring MVC 5</title>

<%-- <link href="<spring:url value="css/sb-admin-2.min.css" />" rel="stylesheet"> --%>
<c:set value="/SpringMVC" var="path" scope="session"></c:set>
<link href="${path}/css/sb-admin-2.min.css" rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
<link href="${path}/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<style>
.titleTable {
	font-weight: bold;
	background-color: #c3d0e5;
	color: #181919;
	text-align: center;
}

.actionCol {
	max-width: 42px;
}

td .td_Id {
	max-width: 30px;
}
#btnAddUser {
	margin-left: 225px;
	position: relative;
	flex: auto;
}
</style>
<script type="text/javascript"
	src="<spring:url value="js/jquery-1.11.1.min.js" />"></script>
<script type="text/javascript"
	src="<spring:url value="js/bootstrap.js" />"></script>
</head>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>

<body id="page-top">
	<div id="wrapper">

		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
	</div>
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>
	
</body>
<%
	String message = "path = " + pageContext.findAttribute("path");
	logger.info(message);
%>
<script src="${path}/vendor/jquery/jquery.min.js"></script>
<script src="${path}/css/all.css"></script>
<script src="${path}/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="${path}/vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="${path}/js/sb-admin-2.min.js"></script>
<script src="${path}/js/demo/datatables-demo.js"></script>
<script src="${path}/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="${path}/vendor/datatables/dataTables.bootstrap4.min.js"></script>
</html>