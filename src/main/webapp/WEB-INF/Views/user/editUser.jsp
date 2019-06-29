<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="java.util.logging.Logger"%>
<c:url value="/showUser" var="urlShowUser" />
<div style="margin-left: 20px">
	<%
		Logger logger = Logger.getLogger(this.getClass().getName());
	%>
	<a href="${urlShowUser}"> <span class="fas fa-angle-double-left">
			<u> List User </u>
	</span>
	</a> <br />

	<c:url value="/saveUser" var="updateUser" />
	<form name="editForm" action="${updateUser}" method="POST"
		modelAttribute="user">
		<div class="container">
			
			<div class="row">
				<div class="col-sm">
					<div>
						<h3>Supplier</h3>
						<hr style="border: 1px solid red;">
					</div>
					<div class="row">
						<div class="col-sm">
							<label>ID:</label>
						</div>
						<div class="col-sm">
							<input type="text" name="id" style="font-size: 15px; width: 100%;" value="${user.id}" readonly="readonly">
						</div>
					</div>
					<div class="row">
						<div class="col-sm">
							<label>Username:</label>
						</div>
						<div class="col-sm">
							<input type="text" name="userName"  style="font-size: 15px; width: 100%;"value="${user.userName}" />
						</div>
					</div>
					<div class="row">
						<div class="col-sm">
							<label>Password:</label>
						</div>
						<div class="col-sm">
							<input type="text" name="password"  style="font-size: 15px; width: 100%;" value="${user.password}" />
						</div>

					</div>
					<div class="row">
						<div class="col-sm">
							<label>Role: </label>
						</div>
						<div class="col-sm">
							<input type="text" name="role" style="font-size: 15px; width: 100%;" value="${user.role}" />
						</div>
					</div>
					<div class="row">
						<div class="col-sm"></div>
						<div class="col-sm">
							<input type="submit" value="Update" name="btnSubmit" />
						</div>
					</div>
				</div>
				<div class="col-sm"></div>
			</div>
		</div>
	</form>
	<%-- <% String message = "Queuing to Update Users = "
        + pageContext.findAttribute("user");
        logger.info(message); 
%> --%>
</div>