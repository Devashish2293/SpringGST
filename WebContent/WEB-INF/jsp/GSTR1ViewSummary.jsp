<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/css/styles.css"/> " />

<script type="text/javascript">
	function doAction(val) {
		window.location = '/SpringGST/GSTR1Summary/gstr/sale/summary?monthOfReturn='
				+ val;
	}
</script>

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
					<li><a href="/">GST Filling</a></li>
					<li><a href="/gstr">Invoices/Bills</a></li>
					<li><a href="/gstr/period/062017/sale/summary">Outward
							Supplies</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div></div>
	<div></div>
	<div id="gst-home_gstr-dashboard_gstr-gstin_gstr-sales"
		class="container App_body-section_2c1oaa">
		<div class="upload-summary list_page">
			<div class="tabs">
				<a class="tab active"
					href="<c:url value="/gstr/period/062017/outwardsupplies/summary" /> ">View
					GSTR1 Summary</a> <a class="tab"
					href="<c:url value="/gstr/period/062017/outwardsupplies/all" /> ">View
					My Invoices</a> <a class="tab"
					href="<c:url value="/gstr/period/062017/outwardsupplies/upload_summary" /> ">Upload
					to GSTN</a> <a class="tab"
					href="<c:url value="/gstr/period/062017/outwardsupplies/filing?transaction_status=FILED&amp;transaction_status=SYNCED" /> ">File
					GSTR-1</a>
			</div>
			<div class="list_page">
				<div class="heading">
					<div class="items--left">My Invoices</div>
				</div>
				<div class="items--right">
					<div>
						<button class="button transcation-list-btn">Add New
							invoice</button>
					</div>
				</div>
				<div class="invoice-types">
					<div class="invoice-types__heading">Types</div>
					<div class="invoice-types__content">
						<label for="invoice-types__invoice" class="invoice-types__item">
							<input type="radio" id="invoice-types__invoice"
							name="invoice_type" value="INVOICE">Invoice
						</label> <label for="invoice-types__cdn" class="invoice-types__item">
							<input type="radio" id="invoice-types__cdn" name="invoice_type"
							value="CDN">Credit/Debit Note
						</label> <label for="invoice-types__advance_received"
							class="invoice-types__item"> <input type="radio"
							id="invoice-types__advance_received" name="invoice_type"
							value="ADVANCE_RECEIVED">Advance Receipt
						</label> <label for="invoice-types__aggregate" class="invoice-types__item">
							<input type="radio" id="invoice-types__aggregate"
							name="invoice_type" value="AGGREGATE">Agg. Nil/Exempt/Non
							GST
						</label> <label for="invoice-types__summary" class="invoice-types__item">
							<input type="radio" id="invoice-types__summary"
							name="invoice_type" value="SUMMARY">All Type Summary
						</label>
					</div>
					<div class="view-invoices">
						<div>
							<div class="table-wrapper">
								<table>
									<thead>
										<tr>
											<th class="">Date</th>
											<th class="text-right">ID</th>
											<th class="text-right">Customer</th>
											<th class="text-right">GSTIN</th>
											<th class="text-right">TAXABLE AMT(Rs)</th>
											<th class="text-right">TOTAL TAX(Rs)</th>
											<th class="text-right">TOTAL AMT(Rs)</th>
											<th class="text-right">Type</th>
											<th class="">STATUS</th>
										</tr>
									</thead>
									<tbody>
										<tr class="invoice_list">
											<td>05/05/2017</td>
											<td>CLR-101</td>
											<td>Prajwal Trading Pvt. Ltd.</td>
											<td>37ABCDE9552F3Z4</td>
											<td class="text-right">1000.00</td>
											<td class="text-right">0.00</td>
											<td class="text-right">1000.00</td>
											<td>B2B</td>
											<td>Not Uploaded</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>