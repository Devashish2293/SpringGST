<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <p>Add your GST Registration details here.</p>
          </div>
    </div>
     <div class="actions">
           <div class="btn-group btn-group-devided" data-toggle="buttons">
     
        <a href="<c:url value="/addNewGST" />" > Add GST Registration</a>
           </div>
     </div>
                                           
   		
   		 <div class="portlet-body">
                                                <div class="table-scrollable" id="box_content">
                                                    <table class="table table-striped table-hover">
    <thead>
        <tr>
            <th>#</th>
            <th>Trade Name</th>
            <th></th>
            <th>State</th>   
            <th></th>
               <th>Supplier Count</th> 
               <th></th>
                  <th>Customer Count</th>          
        </tr>
    </thead>
    <tbody id="t_payer">
                 <tr>
                    <td colspan="5" class="text-center">No records added.  </td>
                </tr>
            </tbody>
</table>  </div>
  </div>
     	
</body>
</html>