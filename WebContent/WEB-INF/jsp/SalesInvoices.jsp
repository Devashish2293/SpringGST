
<%@include file="/WEB-INF/jsp/header.jsp" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="container-wrapper">
    <div class="container">
	<div class="page-header"  >
				<h1>Sales Invoices</h1>
				<div class="col-md-10">
				<p class="lead">Summary</p>
				</div>
				<div class="col-md-2 pull-right">
				<a class="btn btn-success" href="<c:url value="/addinvoice" />" >Add New Invoice</a>
			</div>
			</div>
			<table class="table table-striped table-hover">
				<thead>
					<tr class="bg-primary">
						<th>Invoice ID</th>
						<th>Customer</th>
						<th>Created</th>
						<th>Due Date</th>
						<th>Total Amount(In Rs.)</th>
						<th></th>
					</tr>
				</thead>
				<c:forEach items="${invoiceList}" var="invoice">
					<tr>
						
						<td>${invoice.invoiceId}</td>
						<td>${invoice.customer.businessName}</td>
						<td>${invoice.invoiceDate}</td>
						<td>${invoice.dueDate}USD</td>
						<td>${invoice.totalInvoiceValue}USD</td>
						<td><a href="<spring:url value="/invoice/viewInvoice/${invoice.invoiceId}"/>"><span class="glyphicon glyphicon-info-sign"></span></a></td>
					</tr>
				</c:forEach>

			</table>
			
</div>
</div>
 <%@include file="/WEB-INF/jsp/footer.jsp" %>
 asdas