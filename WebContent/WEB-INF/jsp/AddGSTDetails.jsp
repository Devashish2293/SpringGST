<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.3/jquery.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	div{
		padding:8px;
	}
</style>
</head>
<body>
<script type="text/javascript">
/*$(document).ready(function(){
	alert("HERE!!");
	
});
$(document).ready(function(){
	alert("hii!!");
	    var counter = 2;

	    $("#addButton").click(function () {

		if(counter>10){
	            alert("Only 10 textboxes allow");
	            return false;
		}

		var newTextBoxDiv = $(document.createElement('div'))
		     .attr("id", 'TextBoxDiv' + counter);

	//	newTextBoxDiv.after().html('<label>Textbox #'+ counter + ' : </label>' +
		newTextBoxDiv.after().html(
		      '<input type="text" name="textbox' + counter +
		      '" id="textbox' + counter + '" value="" >');

		newTextBoxDiv.appendTo("#TextBoxesGroup");


		counter++;
	     });

	     $("#removeButton").click(function () {
		if(counter==1){
	          alert("No more textbox to remove");
	          return false;
	       }

		counter--;

	        $("#TextBoxDiv" + counter).remove();

	     });*/

	    // $("#getButtonValue").click(function () {

	//	var msg = '';
	//	for(i=1; i<counter; i++){
	  // 	  msg += "\n Textbox #" + i + " : " + $('#textbox' + i).val();
	//	}
	  //  	  alert(msg);
	   //  });
//});

</script>
  <form name="addBusiness" method="get" action="#">
 	<table border="0" width="100%" cellpadding="2">
 		<tr><th>Add New Business</th></tr>
   		<tr> 
   			<td><label>Organisation Name</label></td> 
   			<td><input type="text" id="businessName" value=""></td>
   		</tr>
   		<tr> 
   			<td><label>Trade Name</label></td> 
   			<td><input type="text" id="tradeName" value=""></td>
   		</tr> 
   		<tr> 
   			<td><label>Provisional GST ID number</label></td> 
   			<td><input type="text" id="tradeName" value=""></td>
   		</tr> 
   		<tr> 
   			<td><label>PAN</label></td> 
    		<td><input type="text" id="ownerPan" value=""></td>
    		</tr> <tr>
    		<td><label>Business Owner's Name</label></td> 
     		<td><input type="text" id="ownerName" value=""></td> </tr> 
     		<tr><td><label>Business Owner's Email</label></td> 
     		<td><input type="text" id="ownerEmail" value=""></td></tr> 
     		<tr><td><label>GST Portal Username</label></td> 
     		<td><input type="text" id="GSTPortalUserName" value=""></td></tr> 
     		<tr><td><label>GST Portal Password</label></td> 
     		<td><input type="text" id="GSTPortalPassword" value=""></td></tr>     	     		 
			<tr>
     		<!--<td><label>GSTIN Registered under the company</label></td> 
     		<td><input type="text" id="GSTIN" value="">
     		<div id='TextBoxesGroup'>				
				   <input type='text' id='GSTIN' >			
			</div>
     		</td></tr>     	     		
     		 <input type='button' value='Add another GSTIN' id='addButton'>
     		<input type='button' value='Remove Button' id='removeButton'>
			<input type='button' value='Get TextBox Value' id='getButtonValue'> -->
     		<!--<tr><td id="addButton"> <a href="addButton">Add another GSTIN</a> </td></tr>
     		<tr><td></td><td><button type="submit">Submit</button></td></tr>-->  	
</table></form>    
</body>
</html>