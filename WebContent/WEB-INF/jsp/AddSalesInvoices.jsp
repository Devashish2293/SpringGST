
<%@include file="/WEB-INF/jsp/header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<div class="container-wrapper">
    <div class="container">
    <h3>Create Sales Invoice</h3>
     <form:form 
    		action="/SpringGST/save" method="post" commandName="invoice" >
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
    		    <tr><th>Invoice Id</th></tr>
    		    <td><form:input type="text" id="invoiceId" path="invoiceId" value="${invoice.invoiceId }"></form:input></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Invoice Date</th></tr>
    		    <td><form:input type="date" id="invoiceDate" path="" value="${invoice.invoiceDate }"></form:input></td>
    		  </table>
    		  </div>
    		  </div>
    		  </div>
    		<div class="col-md-5 col-md-offset-2">
    		  <div class="row">
    		  <div class="col-md-6">
    		  <table>
    		    <tr><th>Reference</th></tr>
    		    <td><form:input type="text" id="reference" path="reference" value="${invoice.reference}"></form:input></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Due Date</th></tr>
    		    <td><form:input type="date" id="dueDate" path="" value="${invoice.dueDate }"></form:input></td>
    		  </table>
    		  </div>
    		  </div>
    		  </div>
    		  <!-- </div> -->
    		 
    		  <br>
    		  <br>
    		  <br>
    		  <br>
    		  <div class="row">
    		  <div class="col-md-5">
    		  <table>
    		    <tr><th>Customer Name</th></tr>
    		    <td><form:input type="text" id="custName" path="" style="width:392px;"></form:input></td>
    		  </table>
    		  </div>
    		  <div class="col-md-5 col-md-offset-2">
    		  <div class="row">
    		  <div class="col-md-6">
    		  <table>
    		    <tr><th>Billing Address <a href="/editAddress">edit</a></th></tr>
    		    <td><form:input type="hidden" path="" id="billAddrs"></form:input></td>
    		  </table>
    		  </div>
    		  <div class="col-md-6">
    		     <table>
    		    <tr><th>Shipping Address</th></tr>
    		    <td><form:input type="hidden" path="" id="Text1"></form:input></td>
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
    		  <div class="table-responsive overflow: visible">
    		  	<table class="table-condensed table-bordered" >
    		  	<tr><th rowspan="2">Item Dscptn</th><th rowspan="2">Item type</th><th rowspan="2">HSN</th><th rowspan="2">Qty</th><th rowspan="2" style="text-align:left;">Rate/Item</th><th rowspan="2" style="text-align:right;">Discount</th><th rowspan="2">Taxable Value</th><th colspan="2" rowspan="1">CGST</th><th colspan="2" rowspan="1">SGST</th><th colspan="2" rowspan="1">IGST</th><th rowspan="2">Total</th></tr>
    		  	<tr><td>%</td><td>Amt</td><td>%</td><td>Amt</td><td>%</td><td>Amt</td></tr>
    		  	<tr><td><div class="dropdown"><button class="btn btn-Default dropdown-toggle" type="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">Select Item<span class="caret"></span><span class="sr-only"></span>
    						</button><ul class="dropdown-menu">
      						<li><a href="<c:url value="/items" />" >ADD NEW ITEM</a></li></ul></div></td>
      			<td><form:input type="hidden" id="itemtype" path=""></form:input></td>
      			<td><form:input type="hidden" id="HSN" path=""></form:input></td>
      			<td><form:input type="text" id="Qty" style=" width: 50px;" path="gstIN"></form:input></td>
      			<td><form:input type="text" id="Rate/Item" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="Discount" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="TaxableValue" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="CGST%" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="CGSTAmt" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="SGST%" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="SGSTAmt" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="IGST%" style="width: 50px;" path=""></form:input></td>
      			<td><form:input type="text" id="IGSTAmt" style="width: 50px;" path=""></form:input></td>
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
    		   <input type="submit" id="Save Invoice" value="Save Invoice" class="btn btn-success pull-right">
    		   </div>
    		   <div class="col-md-6">
    		   <input type="reset" id="Back" value="Reset" class="btn btn-default pull-left">
    		     </div>
    		     </div>
    		   <!--   data-toggle="modal" data-target="#myModal" -->
    		 <!--   <a type="submit" class="btn btn-success" style="margin:3">Save Invoice</a> -->
    		  </form:form>
    		 
    		 
    </div>
    
</div>
  			 

 <%@include file="/WEB-INF/jsp/footer.jsp" %>
 