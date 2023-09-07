<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>

<meta charset="ISO-8859-1">
<title>College Register</title>
<%@ include file="./components/common_cs_js.jsp"%>

<%
    String successParam = request.getParameter("success");
%>


<script>
function submitFormWithConfirmation() {
    var confirmation = confirm("Please take a moment to double-check your details. The page will refresh when you click continue, so make sure everything is correct.");

    if (confirmation) {
        $.ajax({
            type: 'POST',
            url: 'collegeregister',
            data: $('#collegeRegisterForm').serialize(),
            success: function(response) {
                if(response.status === 'error') {
                    $('#errorMessage').text(response.message);
                    $('#errorMessage').show();
                } else if(response.status === 'success'){
                    // Redirect to the same page with a success parameter
                    window.location.href = '/collegeregister?success=true';
                }
            }
        });
    }
}





</script>
</head>
<body>
<%@ include file="./components/navbar.jsp"%>
<div class="container-fluid">
  <div class="row mt-2">
       <div class="col-md-4 offset-md-4" >
            <div class="card border-color">
                <%@ include file="./components/message.jsp"%>
                <div class="card-body px-5 text-color">
                    <img src="resources/images/adminregister.jpeg" class="rounded mx-auto d-block" alt="img" height="90px" width="90px">
                    <h3 class="text-center my-3">Register College</h3>
                    
                    <% if ("true".equals(successParam)) { %>
					    <div class="alert alert-success">
					        College Successfully Registered
					    </div>
					<% } %>
                    
                    
                    <!-- Before the form, or wherever you want to show the error -->
					<div id="errorMessage" class="alert alert-danger" style="display:none;"></div>
					
					<!-- Before the form, or wherever you want to show the success -->
					<div id="successMessage" class="alert alert-success" style="display:none;"></div>
					
                    <form action="collegeregister" method="post" id="collegeRegisterForm">

            
            
                 <div class="form-group">
                     <label for="name">Name</label>
                     <input type="text" class="form-control" id="name" name="name" placeholder="Enter college name.." required>
                 </div>
                 <div class="form-group">
                     <label for="name">Email Id</label>
                     <input type="email" class="form-control" id="email" name="email" pattern="^[a-zA-Z0-9._%+-]+@ctscollege\.edu$" placeholder="Enter email id" required>
                     <small id="emailHelpInline" class="text-muted">
                        Please use an email address with the @ctscollege.edu domain to continue.
                     </small>
                     
                     
                 </div>
                 <div class="form-group">
                     <label for="email">Password</label>
                     <input type="password" class="form-control" id="password" name="password" placeholder="Enter password.." pattern=".{8,20}" required>
                     <small id="passwordHelpInline" class="text-muted">
                        Must be 8-20 characters long.
                     </small>
                 </div>
                 <div class="form-group">
                     <label for="email">Address</label>
                     <textarea class="form-control" id="address" name="address" placeholder="Enter college address.." required> </textarea>
                 </div>
                 <div class="form-group">
                     <label for="email">Location</label>
                     <textarea class="form-control" id="location" name="location" placeholder="Enter college location.." required> </textarea>
                 </div>
                 
                 <div class="form-group">
				     <label for="phoneNo">Phone No</label>
				     <input type="text" class="form-control" id="phoneNo" name="phoneNo" pattern="\d{10}" placeholder="Enter phone no.." required title="Please enter a 10-digit phone number">
				     <small class="form-text text-muted">Enter 10-digit phone number.</small>
				 </div>

                 
                 
                 <div class="form-group">
                     <label for="code">College Code</label>
                     <input type="text" class="form-control" id="code" aria-describedby="emailHelp" name="code" value="${nextCode}" readonly required>
                 </div>  
                                
                 <div class="form-group">
                     <label for="email">Total Seat</label>
                     <input type="number" class="form-control" id="totalSeat" name="totalSeat" placeholder="Enter total Seat.." required>
                 </div>
                 
                 
                 <div class="container text-center">
                            <button type="button" class="btn custom-bg-2 text-white" onclick="submitFormWithConfirmation()"><b>Register College</b></button>
                        </div>
                    </form>
                </div>
            </div>
       </div>
  </div>
</div>
</body>
</html>