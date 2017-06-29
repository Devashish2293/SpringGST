<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
   <div class="caption">
                                                    <div class="caption-subject uppercase">List of Organisations</div>
                                                    <div class="note note-info m-t-20">
                                                        <p>Add your Organisation details here and Continue. You can add and manage multiple Organisations here. Then, you need to add GST registrations for each Organisation (one Organisation may have more than one GST registration).</p>
                                                    </div>
                                                </div>
                                                <div class="actions">
                                                    <div class="btn-group btn-group-devided" data-toggle="buttons">
                                                        <button type="button" id="option1" class="btn purple btn-outline" onclick="goToPage('/add_taxpayer');"><i class="fa fa-plus"></i> Add Organisation</button>
                                                    </div>
                                                </div>
                                           
   		
   		 <div class="portlet-body">
                                                <div class="table-scrollable" id="box_content">
                                                    <table class="table table-striped table-hover">
    <thead>
        <tr>
            <th>#</th>
            <th>Organisation Name</th>
            <th>PAN</th>            
        </tr>
    </thead>
    <tbody id="t_payer">
                        <tr>
                    <td colspan="5" class="text-center">No records added.
                                            </td>
                </tr>
            </tbody>
</table>                                                </div>
                                            </div>
     	
    
</body>
</html>
</html>