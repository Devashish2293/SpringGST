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
					href="<c:url value="/gstr/period/062017/outwardsupplies/filing" /> ">File
					GSTR-1</a>
			</div>
			<div class="heading">
				<div class="items--left">GSTR1 Filling Summary</div>
			</div>
			<div class="items--right">
				<button class="button" id="file-GSTR-1-btn"
					style="background-color: rgb(0, 166, 84);">File GSTR-1</button>
				<div class="filingStatus">
					<img
						src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAAXNSR0IArs4c6QAAA3hJREFUWAnFV01oE0EUnje7aUFFUBFF7CFYMLVWTx4EBauHotGICqJWrVJ/Tm2q4sWDFA8iaP09KdiDIlYUpQmteKoXUfDYVnuo9BCoimhB8NA2u+P7Np2wTSdJN03pwmYm8977vjczb968JTHLp3awvcIZGatXroqRUBuEEmvYFC+eUUFiVAn6QpISVnhZ32Bt+0RGVPiXCouFqO25vDrtTlwVSjXyu7SYvicn+iuIntmy4tpg9OaPQjZ5Hdjd21I5kpZXhFCXlFKLC4HkkxHRPyGoI2y719/ueTBu0jM6sLE7vipN7hulxFaTUdAxIvHRVvLAwP57P3NtZzgQ6blQp9JOL898ba7yHP+nyLajQ9E7/X6caQ5g5pPC/cwKVX6lMvZTISG3+FdCanDsOZZ9HslBVQUOcGnerAMIuHLtuQY3teDIBHdG6m0BjprjjA+XGu0mokJjOB2WVVmNI+qtAM55Wck5UxVyAFxebmElQoZLf/vza9ZJphAyAAW9ClmLzqnQxJLJ8ckku7LZaMLJyl63fKVEei0jeVddbNuR/r03xgYabqcsJW8ZyTHIWRXcErk9r1IAAc8c5Mdf0mFHm7mkzLOfUgC39C4WbWFopaBOKWUTr+0Hg9gbMpHXJOMnOeIv5rPBOLjtqVvNqMfR+ulr7H4zhBwrXc7w79ccXVG/sok80t3a5Lqqk9c5e8z9Ntk+36hQ0Fdqdlx3mIwvk8yD6zUcEof43PboMSN5ou0U2xUnz4B4Dmi8ma1SuyLJ+DEtwI1mVa846DlB4kXunq9Ptp5Wyn1cdOYaUJC3RKPZ/4aOct0nkUTbUS3CSsCJTfu2N/oDriYRb+bIDkAORPWdIomWPg6WHZogT+sQWSeGYnefm+Q1ydYzrlKPOJ6mXW4mXf8YX9PvJcoo/2CevqWU89S/ElqPt+hsKeSwB7dEDafBirQznIgk4ud5zx8GnbnmIVLdJaViXud3ikSIiXdqsMCtTsVe9coFZBAAPmYNcyIHGXOC20sUqF4zBWQQN0rXBRc4geA5kCmdqaN0yKCW1KHLdc8BmKN0RvUaFCqoPjjApe2mndsFLUrhEapVlM7cTWkPy9h6Zbm/IgZ2dgs0Eep2lM7l3A5gATP3m8DoAAbhZdgW9URyTqcD0Q4MYOXOXE94WgzoQX+7YB+nfifQn6/P8/9i9oq1chXDKAAAAABJRU5ErkJggg=="
						alt="Successfully Filed"> &nbsp;&nbsp;&nbsp;&nbsp; GSTR-1
					filing status: <span style="color: rgb(0, 166, 84);">FILED</span>
				</div>
			</div>
			<div class="table-wrapper">
				<table>
					<thead>
						<tr>
							<th class="">TYPE OF INVOICE</th>
							<th class="text-right">NO. INVOICES</th>
							<th class="text-right">TAXABLE AMT(Rs)</th>
							<th class="text-right">TAX AMT(Rs)</th>
							<th class="text-right">IGST(Rs)</th>
							<th class="text-right">CGST(Rs)</th>
							<th class="text-right">SGST(Rs)</th>
							<th class="text-right">Cess(Rs)</th>
							<th class=""></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${gstr1SummaryData}" var="gstr1SummaryData">
							<tr>
								<td>${gstr1SummaryData.return_section}</td>
								<td class="text-right">${gstr1SummaryData.total_record}</td>
								<td class="text-right">${gstr1SummaryData.total_tax}</td>
								<td class="text-right">${gstr1SummaryData.total_record_val}</td>
								<td class="text-right">${gstr1SummaryData.total_igst}</td>
								<td class="text-right">${gstr1SummaryData.total_cgst}</td>
								<td class="text-right">${gstr1SummaryData.total_sgst}</td>
								<td class="text-right">${gstr1SummaryData.total_cess}</td>
								<%-- <td class="text-right"><a class="view-filter" href=${gstr1SummaryData.url}>View</a></td>
								 <td><a class="view-filter"
									href="<c:url value="/gstr/period/062017/outwardsupplies/all" /> ">View</a></td> --%>

							</tr>
						</c:forEach>
						<!-- react-empty: 769 -->
						<!-- react-empty: 770 -->
						<!-- react-empty: 771 -->
						<!-- react-empty: 772 -->
						<!-- react-empty: 773 -->
						<!-- react-empty: 774 -->
						<!-- react-empty: 775 -->
					</tbody>
				</table>
			</div>
			<div class="row expanded">
				<div
					class="columns small-12 large-11 medium-11 medium-centered large-centered">
					<h5>HSN/SAC summary</h5>
					<div class="table-wrapper">
						<table>
							<thead>
								<tr>
									<th class="">S.No</th>
									<th class="">GOODS/SERVICES</th>
									<th class="">DESCRIPTION</th>
									<th class="">HSN/SAC</th>
									<th class="">UoM</th>
									<th class="">QUANTITY</th>
									<th class="">NATURE OF SUPPLY</th>
									<th class="text-right">TAXABLE(Rs)</th>
									<th class="text-right">IGST(Rs)</th>
									<th class="text-right">CGST(Rs)</th>
									<th class="text-right">SGST(Rs)</th>
									<th class="text-right">Cess(Rs)</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${gstr1FillingData}" var="gstr1FillingData">
									<tr>
										<td>${gstr1FillingData.num}</td>
										<td></td>
										<td>${gstr1FillingData.description}</td>
										<td>${gstr1FillingData.hsnsc}</td>
										<td>${gstr1FillingData.UOM}</td>
										<td>${gstr1FillingData.quantity}</td>
										<td></td>
										<td class="text-right">${gstr1FillingData.taxableAmount}</td>
										<td class="text-right">${gstr1FillingData.IGSTAmount}</td>
										<td class="text-right">${gstr1FillingData.CGSTAmount}</td>
										<td class="text-right">${gstr1FillingData.SGSTAmount}</td>
										<td class="text-right">${gstr1FillingData.cessAmount}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>