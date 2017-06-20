
<%@include file="/WEB-INF/jsp/header.jsp" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container-wrapper">
    <div class="container">
	<div class="page-header"  >
				<h1></h1>
				<div class="col-md-10">
				<p class="lead">Items</p>
				</div>
				<div class="col-md-2 pull-right">
				<a class="btn btn-success" data-toggle="modal" data-target="#myModal"  >+ New Item</a>
			</div>
			</div>
			
			<table class="table table-striped table-hover">
				<thead>
					<tr class="bg-primary">
						<th>Item Description</th>
						<th>SKU/ITEM</th>
						<th>HSN/SAC</th>
						<th>Selling Price(Rs.)</th>
						<th>Purchase Price(Rs.)</th>
						<th>Discount(%)</th>
					</tr>
				</thead>
				<c:forEach items="${itemList}" var="item">
					<tr>
						
						<td>${item.itemDescription}</td>
						<td>${item.SKU}</td>
						<td>${item.HSN}</td>
						<td>${item.sellingPrice}</td>
						<td>${item.purchasePrice}</td>
						<td>${item.discount}</td>
						<td><a href="<spring:url value="/invoice/viewInvoice/${invoice.invoiceId}"/>"><span class="glyphicon glyphicon-info-sign"></span></a></td>
					</tr>
				</c:forEach>

			</table>
</div>

</div>
<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">Add New Item</h4>
      </div>
      <div class="modal-body">
  		<form:form
			action="items/addItem"
			method="post" commandName="newItem" >
			<div class="form-group">
				<label for="description">Item Description</label>
				<form:errors path="itemDescription" cssStyle="color: #ff0000;" />
				<form:input path="itemDescription" id="description" class="form-control" />

			</div>
			<div class="form-group">
				<label for="Item Type">Item Type</label>
				<form:errors path="itemType" cssStyle="color: #ff0000;" />
				<form:input path="itemType" id="itemtype" class="form-control" />

			</div>
				<div class="form-group">
				<label for="HSN">HSN/SAC Code</label>
				<form:errors path="HSN" cssStyle="color: #ff0000;" />
				<form:input path="HSN" id="HSN	" class="form-control" />

			</div>
			
				<div class="form-group">
				<label for="SKU">Item/SKU Code</label>
				<form:errors path="SKU" cssStyle="color: #ff0000;" />
				<form:input path="SKU" id="SKU	" class="form-control" />

			</div>
			
				<div class="form-group">
				<label for="sellingprice">Selling Price</label>
				<form:errors path="sellingPrice" cssStyle="color: #ff0000;" />
				<form:input path="sellingPrice" id="sellingPrice" class="form-control" />

			</div>
			<div class="form-group">
				<label for="purchaseprice">Purchase Price</label>
				<form:errors path="purchasePrice" cssStyle="color: #ff0000;" />
				<form:input path="purchasePrice" id="purchasePrice" class="form-control" />

			</div>
			<div class="form-group">
				<label for="unitofmeasurement">Unit of Measurement</label>
				<form:errors path="unitOfMeasurement" cssStyle="color: #ff0000;" />
				<form:input path="unitOfMeasurement" id="unitOfMeasurement" class="form-control" />

			</div>
			<div class="form-group">
				<label for="discount">Discount</label>
				<form:errors path="discount" cssStyle="color: #ff0000;" />
				<form:input path="discount" id="discount" class="form-control" />

			</div>
			<div class="form-group">
				<label for="itemNotes">Item Notes</label>
				<form:errors path="itemNotes" cssStyle="color: #ff0000;" />
				<form:textarea path="itemNotes" rows="5" cols="30" class="form-control"/>

			</div>
		
			
			
			<br>
			<br>
			<input type="submit" value="Submit" class="btn btn-default">
		
		</form:form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
 <%@include file="/WEB-INF/jsp/footer.jsp" %>
 