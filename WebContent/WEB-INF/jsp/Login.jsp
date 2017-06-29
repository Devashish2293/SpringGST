<%@include file="/WEB-INF/jsp/header.jsp"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<form:form method="post" action="submit" commandName="login">
	
<div class="container-wrapper">
	<div class="container"  style="margin-left:12px">
		<h3>Signup New User</h3>
		
		<h5 align="right">Existing User <input type="button" name="click_here" value="click here" onclick="window.location.href='http://localhost:8007/Login/'"> to Login. </h5>
			
		<div class="row"  style="margin-left:12px">
		
		<fieldset>
		
          <label for="email">User Email ID:</label> <br>
          <form:input type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" style="padding:10px; width:80%;" id="email" path="email" value="${login.email }"></form:input> <br> <br>
          
          <label for="password">Password:</label> <br>
          <form:input type="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" style="padding:10px; width:80%;" id="password" path="password" value="${login.password }"></form:input> <br> <br>
        
          </fieldset>
        
        <input type="submit" name="submit" value="submit"> 
		<input type="button" name="cancel" value="cancel" onclick="window.location.href='http://localhost:8007/SpringGST/registration'"> <br> <br>
		
		</div>
		</div>
		</div>
</form:form>

<%@include file="/WEB-INF/jsp/footer.jsp"%>
    