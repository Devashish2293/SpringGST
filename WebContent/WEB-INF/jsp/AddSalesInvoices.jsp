
<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container-wrapper">
	<div class="container">
		<h3>Create Sales Invoice</h3>
		<form:form action="/SpringGST/save" method="post"
			commandName="invoice">
			<div class="row">
				<!-- <div class="col-md-6">
    	
    </div> -->
				<!--   <div class="col-md-6">
    	<a href="#" class="btn btn-default pull-right" style="margin:3">Back</a>
    	<a href="#" class="btn btn-success pull-right" style="margin:3">Save Invoice</a>
    </div> -->


				<br>

				<!-- <div class="row"> -->
				<div class="col-md-5">
					<div class="row">
						<div class="col-md-6">

							<table>
								<tr>
									<th>Invoice Id</th>
								</tr>
								<td><form:input type="text" id="invoiceId" path="invoiceId"
										value="${invoice.invoiceId }"></form:input></td>
							</table>
						</div>
						<div class="col-md-6">
							<table>
								<tr>
									<th>Invoice Date</th>
								</tr>
								<td><form:input type="date" id="invoiceDate" path=""
										value="${invoice.invoiceDate }"></form:input></td>
							</table>
						</div>
					</div>
				</div>
				<div class="col-md-5 col-md-offset-2">
					<div class="row">
						<div class="col-md-6">
							<table>
								<tr>
									<th>Reference</th>
								</tr>
								<td><form:input type="text" id="invoiceId" path="invoiceId"
										value="${invoice.invoiceId}"></form:input></td>
							</table>
						</div>
						<div class="col-md-6">
							<table>
								<tr>
									<th>Due Date</th>
								</tr>
								<td><form:input type="date" id="dueDate" path=""
										value="${invoice.dueDate }"></form:input></td>
							</table>
						</div>
					</div>
				</div>
				<!-- </div> -->

				<br> <br> <br> <br>
				<div class="row">
					<div class="col-md-5">
						<table>
							<tr>
								<th>Customer Name</th>
							</tr>
							<td><form:select path="clientId">
									<option value="NONE">Select</option>
									<form:options items="${clientList}" itemValue="clientId"
										itemLabel="businessName" />
								</form:select></td>
							<td><a class="btn btn-success" data-toggle="modal"
								data-target="#myModal">Add New Client</a></td>
						</table>
					</div>
					<div class="col-md-5 col-md-offset-2">
						<div class="row">
							<div class="col-md-6">
								<table>
									<tr>
										<th>Billing Address <a href="/editAddress">edit</a></th>
									</tr>
									<td><form:input type="hidden" path="" id="billAddrs"></form:input></td>
								</table>
							</div>
							<div class="col-md-6">
								<table>
									<tr>
										<th>Shipping Address</th>
									</tr>
									<td><form:input type="hidden" path="" id="Text1"></form:input></td>
								</table>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<div class="checkbox pull-right">
							<label><input type="checkbox"> Same as Billing
								Address</label>
						</div>
					</div>
				</div>
				<br> <br> <br> <br>
				<div class="row">
					<div class="col-ms-12">
						<div class="table-responsive overflow: visible">
							<table class="table-condensed table-bordered">
								<tr>
									<th rowspan="2">Item Desc.</th>
									<th rowspan="2">Item type</th>
									<th rowspan="2">HSN</th>
									<th rowspan="2">Qty</th>
									<th rowspan="2" style="text-align: left;">Rate/Item</th>
									<th rowspan="2" style="text-align: right;">Discount</th>
									<th rowspan="2">Taxable Value</th>
									<th colspan="2" rowspan="1">CGST</th>
									<th colspan="2" rowspan="1">SGST</th>
									<th colspan="2" rowspan="1">IGST</th>
									<th rowspan="2">Total</th>
								</tr>
								<tr>
									<td>%</td>
									<td>Amt</td>
									<td>%</td>
									<td>Amt</td>
									<td>%</td>
									<td>Amt</td>
								</tr>
								<tr>
									<td><div class="dropdown">
											<button class="btn btn-Default dropdown-toggle" type="button"
												data-toggle="dropdown" aria-haspopup="true"
												aria-expanded="true">
												Select Item<span class="caret"></span><span class="sr-only"></span>
											</button>
											<ul class="dropdown-menu">
												<li><a class="btn btn-default" data-toggle="modal"
													data-target="#itemModal">Add New Item</a></li>
											</ul>
										</div></td>
									<!-- 	<a class="btn btn-success" data-toggle="modal" data-target="#itemModal">Add New Item</a> -->
									<%-- <a href="<c:url value="#itemModal" />">ADD NEWITEM</a> --%>




									<td><form:input type="hidden" id="itemtype" path=""></form:input></td>
									<td><form:input type="hidden" id="HSN" path=""></form:input></td>
									<td><form:input type="text" id="Qty" style=" width: 50px;"
											path=""></form:input></td>
									<td><form:input type="text" id="Rate/Item"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="Discount"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="TaxableValue"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="CGST%"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="CGSTAmt"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="SGST%"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="SGSTAmt"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="IGST%"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="text" id="IGSTAmt"
											style="width: 50px;" path=""></form:input></td>
									<td><form:input type="hidden" id="Total" path=""></form:input></td>
								</tr>
							</table>
						</div>
					</div>
				</div>
			</div>
			<br>
			<br>

			<div class="row">
				<div class="col-md-6">
					<input type="submit" id="Save Invoice" value="Save Invoice"
						class="btn btn-success pull-right">
				</div>
				<div class="col-md-6">
					<input type="reset" id="Back" value="Reset"
						class="btn btn-default pull-left">
				</div>
			</div>
			<!--   data-toggle="modal" data-target="#myModal" -->
			<!--   <a type="submit" class="btn btn-success" style="margin:3">Save Invoice</a> -->
		</form:form>


	</div>

</div>


<div id="itemModal" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Add New Item</h4>
			</div>
			<div class="modal-body">
				<form:form action="addinvoice/addItem" method="post"
					commandName="newItem">
					<div class="form-group">
						<label for="description">Item Description</label>
						<form:errors path="itemDescription" cssStyle="color: #ff0000;" />
						<form:input path="itemDescription" id="description"
							class="form-control" />

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
						<form:input path="sellingPrice" id="sellingPrice"
							class="form-control" />

					</div>
					<div class="form-group">
						<label for="purchaseprice">Purchase Price</label>
						<form:errors path="purchasePrice" cssStyle="color: #ff0000;" />
						<form:input path="purchasePrice" id="purchasePrice"
							class="form-control" />

					</div>
					<div class="form-group">
						<label for="unitofmeasurement">Unit of Measurement</label>
						<form:errors path="unitOfMeasurement" cssStyle="color: #ff0000;" />
						<form:input path="unitOfMeasurement" id="unitOfMeasurement"
							class="form-control" />

					</div>
					<div class="form-group">
						<label for="discount">Discount</label>
						<form:errors path="discount" cssStyle="color: #ff0000;" />
						<form:input path="discount" id="discount" class="form-control" />

					</div>
					<div class="form-group">
						<label for="itemNotes">Item Notes</label>
						<form:errors path="itemNotes" cssStyle="color: #ff0000;" />
						<form:textarea path="itemNotes" rows="5" cols="30"
							class="form-control" />

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

<div id="myModal" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Add New Client</h4>
			</div>
			<div class="modal-body">
				<form:form action="/SpringGST/addinvoice/addClient" method="post"
					commandName="newClient">

					<div class="form-group">
						<label for="category">Category</label> <label
							class="checkbox-inline"><form:radiobutton
								path="client.isBusiness" id="category" value="true" />Business</label>

						<label class="checkbox-inline"><form:radiobutton
								path="client.isBusiness" id="category" value="false" />Individual</label>
			
					</div>
					<div class="form-group">
						<label for="businessName">Name</label>
						<form:errors path="client.businessName" cssStyle="color: #ff0000;" />
						<form:input path="client.businessName" id="businessName"
							class="form-control" />

					</div>
					<div class="form-group">
						<label for="businessContactPerson">Contact Person</label>
						<form:errors path="client.businessContactPerson"
							cssStyle="color: #ff0000;" />
						<form:input path="client.businessContactPerson"
							id="businessContactPerson" class="form-control" />

					</div>
					<div class="form-group">
						<label for="clientGSTIN">GSTIN</label>
						<form:errors path="client.clientGSTIN" cssStyle="color: #ff0000;" />
						<form:input path="client.clientGSTIN" id="clientGSTIN"
							class="form-control" />

					</div>

					<div class="form-group">
						<label for="mobileNum">Mobile Num.</label>
						<form:errors path="client.mobileNum" cssStyle="color: #ff0000;" />
						<form:input path="client.mobileNum" id="mobileNum"
							class="form-control" />

					</div>
					<div class="form-group">
						<label for="address.state">State</label>
						<form:errors path="address.state" cssStyle="color: #ff0000;" />
						<form:input path="address.state" id="address.state"
							class="form-control" />


					</div>
					<div class="form-group">
						<label for="address.address_line1">Address - Line 1 </label>
						<form:errors path="address.address_line1"
							cssStyle="color: #ff0000;" />
						<form:input path="address.address_line1"
							id="address.address_line1" class="form-control" />

					</div>
					<div class="form-group">
						<label for="address.address_line1">Address - Line 2</label>
						<form:errors path="address.address_line2"
							cssStyle="color: #ff0000;" />
						<form:input path="address.address_line2"
							id="address.address_line2" class="form-control" />

					</div>

					<div class="form-group">
						<label for="address.pincode">Pincode</label>
						<form:errors path="address.pincode" cssStyle="color: #ff0000;" />
						<form:input path="address.pincode" id="address.pincode"
							class="form-control" />

					</div>

					<div class="form-group">
						<label for="address.city">City</label>
						<form:errors path="address.city" cssStyle="color: #ff0000;" />
						<form:input path="address.city" id="address.city"
							class="form-control" />

					</div>

					<div class="form-group">
						<label for="address.landlineNum">LandLine Num.</label>
						<form:errors path="address.landlineNum" cssStyle="color: #ff0000;" />
						<form:input path="address.landlineNum" id="address.landlineNum"
							class="form-control" />

					</div>

					<br>
					<br>
					<input type="submit" value="Submit" class="btn btn-default">

				</form:form>
			</div>
		</div>
	</div>
</div>


<%@include file="/WEB-INF/jsp/footer.jsp"%>
