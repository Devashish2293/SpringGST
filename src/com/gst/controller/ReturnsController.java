package com.gst.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gst.Dao.GSTRSummaryDAO;
import com.gst.Dao.HSNSACDAO;
import com.gst.Dao.InvoicesDAO;
import com.gst.models.B2BInvoicesDetails;
import com.gst.models.B2BInvoicesResponse;
import com.gst.models.GSTRSummaryResponse;
import com.gst.models.HSNSummaryResponse;
import com.gst.models.ItemDetails;

@Controller
public class ReturnsController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private HSNSACDAO hsnsacDAO;

	@Autowired
	private GSTRSummaryDAO gstrSummaryDAO;
	
	@Autowired
	private InvoicesDAO invoicesDAO;

	@RequestMapping(value = "/gstr/period/062017/outwardsupplies/summary", method = RequestMethod.GET)
	public String getGSTR1Summary(HttpServletRequest request, HttpServletResponse response, final Model model)
			throws ServletException, IOException {
		logger.info("Summary View");

		String gstrSummaryId = gstrSummaryDAO.findIdByGstinRetPeriod("37ABCDE9552F3Z4", "062017");
		System.out.println("****gstrSummaryId**** : " + gstrSummaryId);
		List<GSTRSummaryResponse> gstrSummaryResponses = gstrSummaryDAO.findGSTR1SummaryById(gstrSummaryId);
		System.out.println("****gstrSummaryResponses**** : " + gstrSummaryResponses.size());
		model.addAttribute("gstr1SummaryData", gstrSummaryResponses);

		return "/GSTR1Summary";
	}

	@RequestMapping(value = "/gstr/period/062017/outwardsupplies/all", method = RequestMethod.GET)
	public String getGSTR1ViewSummary(HttpServletRequest request, HttpServletResponse response, final Model model)
			throws ServletException, IOException {
		logger.info("View Summary View");

		String b2bInvoicesId = invoicesDAO.findIdByInvoicesRequest("37ABCDE9552F3Z4", "062017", "Y", "20GRRHF2562D3A3", "04-02-2017");
		System.out.println("****b2bInvoicesId**** : " + b2bInvoicesId);
		model.addAttribute("b2bInvoicesId", b2bInvoicesId);
		
		List<B2BInvoicesResponse> b2bInvoicesResponses = invoicesDAO.findAllB2BInvoicesResponseById(b2bInvoicesId);
		System.out.println("****b2bInvoicesResponses**size** : " + b2bInvoicesResponses.size());
		model.addAttribute("b2bInvoicesResponses", b2bInvoicesResponses);
		
		String b2bListId;
		for (B2BInvoicesResponse b2bInvoicesResponse : b2bInvoicesResponses) {
			b2bListId = b2bInvoicesResponse.getB2B_list_id();
			System.out.println("****b2bListId**** : " + b2bListId);
			List<B2BInvoicesDetails> b2bInvoicesDetails = invoicesDAO.findAllB2BInvoicesDetailsByB2BInvoiceId(b2bListId);
			System.out.println("****b2bInvoicesDetails**size** : " + b2bInvoicesDetails.size());
			model.addAttribute("b2bInvoicesDetails", b2bInvoicesDetails);
			
			String b2bInvoiceDetailsId;
//			model.addAttribute("b2bInvoicesDetails", b2bInvoicesDetails);
			for (B2BInvoicesDetails b2bInvoiceDetail : b2bInvoicesDetails) {
				b2bInvoiceDetailsId = b2bInvoiceDetail.getB2B_invoice_details_id();
				System.out.println("****b2bInvoiceDetailsId**** : " + b2bInvoiceDetailsId);
				List<ItemDetails> itemDetails = invoicesDAO.findAllItemDetailsByB2BInvoiceDetailsId(b2bInvoiceDetailsId);
				System.out.println("****itemDetails**size** : " + itemDetails.size());
				model.addAttribute("itemDetails", itemDetails);
				
				for (ItemDetails itemDetail : itemDetails) {
					System.out.println("****itemDetail**Item_details_id** : " + itemDetail.getItem_details_id());
					System.out.println("****itemDetail**Rate** : " + itemDetail.getRate());
				}
			}
		}
		
//		model.addAttribute("b2bInvoiceDatas", invoiceData);

		return "/GSTR1ViewSummary";
	}

	@RequestMapping(value = "/gstr/period/062017/outwardsupplies/upload_summary", method = RequestMethod.GET)
	public String getGSTR1UploadSummary(HttpServletRequest request, HttpServletResponse response, final Model model)
			throws ServletException, IOException {
		logger.info("Upload Summary View");

		String gstrSummaryId = gstrSummaryDAO.findIdByGstinRetPeriod("37ABCDE9552F3Z4", "062017");
		System.out.println("****gstrSummaryId**** : " + gstrSummaryId);
		List<GSTRSummaryResponse> gstrSummaryResponses = gstrSummaryDAO.findGSTR1SummaryById(gstrSummaryId);
		System.out.println("****gstrSummaryResponses**** : " + gstrSummaryResponses.size());
		model.addAttribute("gstr1SummaryData", gstrSummaryResponses);

		return "/GSTR1UploadSummary";
	}

	@RequestMapping(value = "/gstr/period/062017/outwardsupplies/filing", method = RequestMethod.GET)
	public String getGSTR1FillingSummary(HttpServletRequest request, HttpServletResponse response, final Model model)
			throws ServletException, IOException, ClassNotFoundException, SQLException {
		logger.info("Summary Filling View");

		String gstrSummaryId = gstrSummaryDAO.findIdByGstinRetPeriod("37ABCDE9552F3Z4", "062017");
		System.out.println("****gstrSummaryId**** : " + gstrSummaryId);
		List<GSTRSummaryResponse> gstrSummaryResponses = gstrSummaryDAO.findGSTR1SummaryById(gstrSummaryId);
		System.out.println("****gstrSummaryResponses**** : " + gstrSummaryResponses.size());
		model.addAttribute("gstr1SummaryData", gstrSummaryResponses);

		String hsnSummaryId = hsnsacDAO.findIdByGstinRetPeriod("37ABCDE9552F3Z4", "062017");
		System.out.println("****hsnSummaryId**** : " + hsnSummaryId);
		List<HSNSummaryResponse> hsnSummaryResponses = hsnsacDAO.findGSTR1HSCSACSummaryById(hsnSummaryId);
		System.out.println("****hsnSummaryResponses**** : " + hsnSummaryResponses.size());
		model.addAttribute("gstr1FillingData", hsnSummaryResponses);

		return "/GSTR1FillingSummary";
	}
}
