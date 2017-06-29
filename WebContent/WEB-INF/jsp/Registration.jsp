<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="post" action="submit" commandName="portaluser">
	
<div class="container-wrapper">
	<div class="container"  style="margin-left:12px">
		<h3>Signup New User</h3>
		
		<h5 align="right">Existing User <input type="button" name="click_here" value="click here" onclick="window.location.href='http://localhost:8007/SpringGST/login/'"> to Login. </h5>
			
		<div class="row"  style="margin-left:12px">
		
		<fieldset>
		
          <label for="firstname">User First Name:</label> <br>
          <form:input type="text" pattern="[a-z]{1,20}" style="padding:10px; width:80%;" id="firstname" path="firstname" value="${portaluser.firstname }"></form:input> <br> <br>
          
          <label for="lastname">User Last Name:</label> <br>
          <form:input type="text" pattern="[a-z]{1,30}" style="padding:10px; width:80%;" id="lastname" path="lastname" value="${portaluser.lastname }"></form:input> <br> <br>
 
          <label for="email">User Email ID:</label> <br>
          <form:input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" style="padding:10px; width:80%;" id="email" path="email" value="${portaluser.email }"></form:input> <br> <br>
          
          <label for="mobileNum">Mobile Number:</label> <br>
          <form:input type="number" pattern="[789][0-9]{9}" style="padding:10px; width:80%;" id="mobileNum" path="mobileNum" value="${portaluser.mobileNum }"></form:input> <br> <br>
        
          <label for="password">Password:</label> <br>
          <form:input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" style="padding:10px; width:80%;" id="password" path="password" value="${portaluser.password }"></form:input> <br> <br>
        
          </fieldset>
        
        <input type="submit" name="submit" value="submit"> 
		<input type="button" name="cancel" value="cancel" onclick="window.location.href='http://localhost:8007/SpringGST/'"> <br> <br>
		
		</div>
		</div>
		</div>
</form:form>

<%@include file="/WEB-INF/jsp/footer.jsp"%>
    