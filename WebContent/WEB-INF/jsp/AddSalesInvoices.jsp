
<%@include file="/WEB-INF/jsp/header.jsp" %>

<div class="container-wrapper">
    <div class="container">
    <div class="row">
    <div class="col-md-6">
    	<h3>Create Sales Invoice</h3>
    </div>
    <div class="col-md-6">
    	<a href="#" class="btn btn-default pull-right" style="margin:3">Back</a>
    	<a href="#" class="btn btn-success pull-right" style="margin:3">Save Invoice</a>
    </div>
    </div>
    	
    	<br>
    		<div class="row">
    		<div class="col-md-5">
    		  <div class="row">
    		  <div class="col-md-6">
    		  <table>
    		    <tr><th>Invoice Id</th></tr>
    		    <td><input type="text" id="myText2" value="${msg.invoiceId }"></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Invoice Date</th></tr>
    		    <td><input type="text" id="Text1" value="12-12-12"></td>
    		  </table>
    		  </div>
    		  </div>
    		  </div>
    		<div class="col-md-5 col-md-offset-2">
    		  <div class="row">
    		  <div class="col-md-6">
    		  <table>
    		    <tr><th>Reference</th></tr>
    		    <td><input type="text" id="myText2" value="${msg.reference}"></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Due Date</th></tr>
    		    <td><input type="text" id="Text1" value="12-01-13"></td>
    		  </table>
    		  </div>
    		  </div>
    		  </div>
    		  </div>
    		  <br>
    		  <br>
    		  <div class="row">
    		  <div class="col-md-5">
    		  <table>
    		    <tr><th>Customer Name</th></tr>
    		    <td><input type="text" id="myText4" style="width:392px;"></td>
    		  </table>
    		  </div>
    		  <div class="col-md-5 col-md-offset-2">
    		  <div class="row">
    		  <div class="col-md-6">
    		  <table>
    		    <tr><th>Billing Address <a href="/editAddress">edit</a></th></tr>
    		    <td><input type="hidden" id="myText2"></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Shipping Address</th></tr>
    		    <td><input type="hidden" id="Text1"></td>
    		  </table>
    		  </div>
    		  </div>
    		  </div>
    		  </div>
    		  <div class="row">
    		  <div class="col-md-12">
    		  	  <div class="checkbox pull-right">
      				<label><input type="checkbox" > Same as Billing Address</label>
    			  </div>
    		  </div>
    		  </div>
    		  <br>
    		  <br>
    		  <br>
    		  <br>
    		  <div class="row">
    		  <div class="col-ms-12">
    		  <div class="table-responsive">
    		  	<table class="table">
    		  	<tr><th rowspan="2">Item Dscptn</th><th rowspan="2">Item type</th><th rowspan="2">HSN</th><th rowspan="2">Qty</th><th rowspan="2" style="text-align:left;">Rate/Item</th><th rowspan="2" style="text-align:right;">Discount</th><th rowspan="2">Taxable Value</th><th colspan="2" rowspan="1">CGST</th><th colspan="2" rowspan="1">SGST</th><th colspan="2" rowspan="1">IGST</th><th rowspan="2">Total</th></tr>
    		  	<tr><td>%</td><td>Amt</td><td>%</td><td>Amt</td><td>%</td><td>Amt</td></tr>
    		  	<tr><td><div class="dropdown"><button class="btn btn-Default dropdown-toggle" type="button" data-toggle="dropdown">Select <span class="caret"></span><span class="sr-only"></span>
    						</button><ul class="dropdown-menu">
      						<li class="dropdown-header">Add New Invoice</li><li><a href="#">HTML</a></li></ul></div></td>
      			<td><input type="text" id="text9" ></td>
      			<td><input type="text" id="text6"></td>
    		  	</table>
    		  </div>
    		  </div>
    		  </div>
    </div>
</div>
  			<%-- <form name="frm" method="get" action="#">
 	<table border="0" width="100%" cellpadding="2">
 		<tr><th>Invoice Id</th><th>Invoice Date</th><th>Reference</th><th>Due Date</th></tr>
   		<tr>  
   			<td><input type="text" id="myText2" value="${msg.invoiceId }"></td> 
    		<td><input type="text" id="Text1" value="12-12-12"></td>
     		<td><input type="text" id="myText3" value="${msg.reference}"></td> 
     		<td><input type="text" id="myText4" value="12-01-13"></td>
   		</tr>   
  	</table>
   </form> --%>
   <!-- <div class="container">
   		<div class="row">
   			<div class="col-md-6"> 
   				<table border="0" width="100%" cellpadding="2">
   					<tr><th colspan="2">Customer Name</th></tr>
  					<tr><td colspan="2"><input type="text" id="myText4" style="width:455px;"></td></tr>
   				</table>
   			</div>
   			<div class="col-md-6">
   				<table border="0" width="100%" cellpadding="2">
   					<tr><th colspan="2">BillingAddress</th><th>ShippingAddress</th></tr>
   				</table>
   			</div>
   		</div>
   </div>
    -->
 

 <%@include file="/WEB-INF/jsp/footer.jsp" %>
 