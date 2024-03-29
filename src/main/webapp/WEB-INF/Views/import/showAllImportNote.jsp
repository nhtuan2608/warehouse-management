
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page import="java.util.logging.Logger"%>
<%
	Logger logger = Logger.getLogger(this.getClass().getName());
%>
<c:url value="/addUser" var="urlAdd" />
<c:url value="/pdfreport" var="urlPrint" />
<c:url value="/deleteNote" var="urlDelete" />
<c:url value="/editUser" var="urlUpdate" />
<spring:url value="/report/?type=xls" var="xlsURL" />
<spring:url value="/report/?type=pdf" var="pdfURL" />

<!-- Begin Page Content -->
<div class="container-fluid">

	<!-- DataTales Example -->
	<div class="card shadow mb-4">
		<div class="card-header py-3">
			<div class="row">
				<div class="col-sm">
					<h3 class="m-0 font-weight-bold text-primary">List Import Note</h3>
				</div>
				<div class="col-sm"></div>
				<div class="col-sm" style="text-align: center;">
					<div style="text-align: right;">
						<a href="${urlAdd}"
							style="border: 2px solid blue; border-radius: 5px; background-color: #3333ff; color: #ffffff;">Add
							new Note</a> 
						<!-- <a href="#"> -->
							<button class="btn btn-primary" id="btn-export">
								<i class="fas fa-download"></i> show modal
							</button>
						<!-- </a> -->
					</div>
					<div class="bg-modal">
						<div class="container">
							<div class="row">
								<div class="col-md-12">
									<div class="popup">
										<div class="popup-header">
											<div class="close">
												<a href="#" id="close"> <i class="fa fa-close"></i>
												</a>
											</div>
										</div>
										<div class="popup-body">
											<p>Choose your file</p>
										</div>
										<div class="popup-footer">
											<div class="row">
												<div class="col">
													<button type="button" class="btn btn-primary" onclick="location.href='${xlsURL}'" title="Download Excel">Download Excel</button>
												</div>
												<div class="col">
													<button type="button" class="btn btn-primary" onclick="location.href='${pdfURL}'" title="Download PDF">Download PDF</button>
												</div>
											</div>
											<!-- <ul>
												<li></li>
												<li></li>
											</ul> -->
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>

				</div>
			</div>
		</div>
		<div class="card-body">
			<div class="table-responsive">
				<table class="table table-bordered" id="table_id" style="width:100%; cellspacing:0; ">
					<thead>
						<tr class="titleTable">
							<th class="td_Id">No.</th>
							<th class="td_Id">ID</th>
							<th>Creator</th>
							<th>Status</th>
							<th>Create Date</th>
							<td style="border-right: none; border-left: none; width: 42px">View</td>
							<td style="border-right: none; border-left: none; width: 42px">Edit</td>
							<td style="border-left: none; width: 42px">Delete</td>
						</tr>
					</thead>
					<tfoot class="titleTable">
						<tr>
							<td class="td_Id">No.</td>
							<td class="td_Id">ID</td>
							<th>Creator</th>
							<th>Status</th>
							<th>Create Date</th>
							<td style="border-right: none; border-left: none; width: 42px">View</td>
							<td style="border-right: none; border-left: none; width: 42px">Edit</td>
							<td style="border-left: none; width: 42px">Delete</td>
						</tr>
					</tfoot>
					<tbody>
						<c:if test="${not empty listNote}">
							<c:forEach var="note" items="${listNote}">
								<tr style="border: 1px black solid">
									<td class="td_id">${note.numberOfObject}</td>
									<td class="td_Id">${note.id}</td>
									<td>${note.user_id}</td>
									<td>${note.status}</td>
									<td>${note.date}</td>
									<%-- <td class="actionCol"><a href="${urlView}/${note.id}"><img
											src="${path}/img/icon/Search.png" height="20" width="20" />View</a></td> --%>
									<td class="actionCol"><a href="${urlView}/${note.id}"><span
											class="fas fa-eye"></span></a></td>
									<td class="actionCol"><a href="${urlUpdate}/${note.id}"><span
											class="fas fa-pencil-alt"></span></a></td>
									<td class="actionCol"><a href="${urlDelete}/${note.id}"><span
											class="fas fa-trash-alt"></span></a></td>
								</tr>
							</c:forEach>
						</c:if>
					</tbody>
				</table>
			</div>
		</div>
	</div>

</div>

<!-- /.container-fluid -->
<%
	String message = "Notes = " + pageContext.findAttribute("listNote");
	logger.info(message);
%>
