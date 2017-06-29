
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/styles.css"/> " />

<script type="text/javascript">
	function doAction(val) {
		//Forward browser to new url
		window.location = '/SpringGST/GSTR1Summary/gstr/sale/summary?monthOfReturn='
				+ val;
	}
</script>
<!DOCTYPE html>
<div id="root"></div>
<div class="header-container">
	<div class="HeaderNavigation_header-nav_2z3ADF">
		<div class="container HeaderNavigation_header-cont_21QR1r">
			<div
				class="large-2 medium-3 small-4 pull-right HeaderNavigation_account-cont_2NxO6k">
				<div class="Iconizer_icon_2fOLcu"
					style="background: rgb(63, 81, 181);">
					<span>S</span>
				</div>
				<span class="large-1 HeaderNavigation_user-name_3Pq1Yl">sakshi.gupta@reflexsolution.com</span>
				<ul class="HeaderNavigation_overlay-menu_b8DWdp">
					<li class="HeaderNavigation_overlay-item_1DZn4i"><a>Logout</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="large-2 ReturnPeriodPicker_return-period-cont_1KrMDf">
		<div>
			<span>Month of Return</span><span> <select
				name="monthOfReturn" onchange="doAction(this.value);">
					<option value="062017">Jun 2017</option>
					<option value="052017">May 2017</option>
					<option value="042017">Apr 2017</option>
					<option value="032017">Mar 2017</option>
					<option value="022017">Feb 2017</option>
					<option value="012017">Jan 2017</option>
			</select></span>
		</div>
	</div>

	<div class="breadcrumbs-container">
		<div class="BreadCrumbs_breadcrumbs-cont_ntcnv5">
			<div class="large-12 medium-16 small-24">
				<ul class="BreadCrumbs_breadcrumbs_3O3xpN">
					<li><a href="#">GST Filling</a></li>
					<li><a href="#">GSTIN For Demo Business</a></li>
					<li><a href="#">Purchase Returns(GSTR2)
							</a></li>
				</ul>
			</div>
		</div>
	</div> 
	<div id="gst-home_gstr-dashboard_gstr-gstin_gstr-sales"
		class="container App_body-section_2c1oaa">
		<div>
			<div class="tabs">
				<a class="tab active"
					href="<c:url value="/GSTR2Summary" /> ">View
					GSTR2 Summary</a> <a class="tab"
					href="<c:url value="/viewMyData" /> ">View
					My Data</a> <a class="tab"
					href="<c:url value="/vendorInvoicesData" /> ">Vendor
					Invoices</a> <a class="tab"
					href="<c:url value="/matchData" /> ">
					Match & Reconcile</a><a class="tab"
					href="<c:url value="#" /> ">
					Claim ITC</a><a class="tab"
					href="<c:url value="#" /> ">
					GSTR-2 Filing</a>
			</div>
			<div class="margin-top-20">
				<div class="row">
					<div class="heading">
						<h5>GSTR-2 Summary</h5>
						<p>(Transaction summary based on transactions that are created
							using Reflex Solution Invoicing product or imported from external
							sources)</p>
						<div class="table-wrapper">
							<table>
								<thead>
									<tr>
										<th class="">TYPE OF INVOICE</th>
										<th class="text-right">NO. INVOICES</th>
										<th class="text-right">TAXABLE AMT(Rs)</th>
										<th class="text-right">TAX AMT(Rs)</th>
										<th class="text-right">TOTAL AMT INCL. TAX(Rs)</th>
										<th class=""></th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${summaryList}" var="gstr2Details">
					<tr>
						
						<td>${gstr2Details.typeOfInvoice}</td>
						<td>${gstr2Details.noOfInvoices}</td>
						<td>${gstr2Details.taxableAmount}</td>
						<td>${gstr2Details.taxAmount}</td>
						<td>${gstr2Details.totalAmountInclTax}</td>
						<td><a href="<spring:url value="/invoice/viewInvoice/${invoice.invoiceId}"/>"><span class="glyphicon glyphicon-info-sign"></span></a></td>
					</tr>
				</c:forEach>
								</tbody>							
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>