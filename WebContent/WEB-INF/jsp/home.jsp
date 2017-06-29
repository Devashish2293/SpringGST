
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<div class="container-wrapper">
	<div class="container">
		<div class="page-header">
			<h1>Users Dashboard</h1>
			<div class="col-md-10">
				<p class="lead">List of Users</p>
			</div>

			<%-- <div class="col-md-2">
			<a class="btn btn-success" href="<c:url value="/newGroup" />">Add New Groups</a>

			</div> --%>
			<div class="col-md-2 pull-right">
			<a class="btn btn-success" href="<c:url value="/newUser" />">Add New User</a>
			</div>
		</div>
		<table class="table table-striped table-hover">
			<thead>
				<tr class="bg-primary">
					<th>No</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>Password</th>
					<th>GSTIN</th>
					<th>GroupID</th>
					<th>State</th>
					<th></th>
				</tr>
			</thead>
			<c:forEach items="${listUser}" var="user">
				<tr>
					<td>${user.portal_user_id}</td>
					<td>${user.portal_email}</td>
					<td>${user.portal_mobile}</td>
					<td>${user.portal_password}</td>
					<td>${user.portal_gstin}</td>
					<td>${user.portal_group_id}</td>
					<td>${user.portal_state}</td>

					 <td>
						<a href="editUser?id=${user.portal_user_id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp;
						<a href="deleteUser?id=${user.portal_user_id}">Delete</a>
					</td> 

				</tr>
			</c:forEach>
		</table>
	</div>
</div>

<%@include file="/WEB-INF/jsp/footer.jsp"%>

