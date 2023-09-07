<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	
    <meta charset="ISO-8859-1">
    <title>Admin Register</title>
    <%@ include file="./components/common_cs_js.jsp"%>

    <script>
        function showWarningAndSubmit() {
            return confirm("Do you wish to continue?");
        }
    </script>
    
    <script>
    $(document).ready(function(){
        $("form").submit(function(event){
            event.preventDefault();

            var formData = $(this).serialize();
            $.post("adminregister", formData, function(response) {
                if(response.errorField && response.errorMessage) {
                    $("#" + response.errorField).next(".text-danger").remove(); 
                    $("#" + response.errorField).after("<span class='text-danger'>" + response.errorMessage + "</span>");
                } else if (response.success === "true") {
                    window.location.href = "adminlogin?registered=" + response.username; // Redirect to the login page with a query parameter
                } else {
                    alert(response.message || "An error occurred."); // Show an alert with the error message or a generic error
                }
            });
        });
    });


    </script>
    
</head>
<body>
<%@ include file="./components/navbar.jsp"%>


<div class="container-fluid md-5">
    <div class="row mt-2 md-5">
        <div class="col-md-4 offset-md-4">
            <div class="card border-color">
                <%@ include file="./components/message.jsp"%>
                <div class="card-body px-5 text-color">
                
                	<%
                        String registeredUser = request.getParameter("registered");
                        if(registeredUser != null && !registeredUser.isEmpty()) {
                    %>
                        <div class="alert alert-success">
                            Successfully registered as <%= registeredUser %>. Please log in.
                        </div>
                    <%
                        }
                    %>
                	
                	
                    <img src="resources/images/adminregister.jpeg" class="rounded mx-auto d-block" alt="img" height="90px" width="90px">
                    <h3 class="text-center my-3">Register Admin</h3>

                    <form action="adminregister" method="post" onsubmit="return showWarningAndSubmit();">
                        <!-- First Name -->
                        <div class="form-group">
                            <label for="firstname">First Name</label>
                            <input type="text" class="form-control" id="firstname" name="firstname" placeholder="Enter first name.." required>
                        </div>

                        <!-- Last Name -->
                        <div class="form-group">
                            <label for="lastname">Last Name</label>
                            <input type="text" class="form-control" id="lastname" name="lastname" placeholder="Enter last name.." required>
                        </div>

                        <!-- Username -->
                        <div class="form-group">
                            <label for="username">User name</label>
                            <input type="text" class="form-control" id="username" name="username" placeholder="Enter Username" required>
                            <c:if test="${not empty usernameError}">
                                <span class="text-danger">${usernameError}</span>
                            </c:if>
                        </div>

                        <!-- Email -->
                        <div class="form-group">
                            <label for="emailid">Email</label>
                            <input type="email" pattern="^[a-zA-Z0-9._-]+@cts\.edu$" class="form-control" id="emailid" name="emailid" placeholder="Enter email id.." required>
                            <small class="form-text text-muted">Enter a valid email with '@cts.edu' domain.</small>
                            <c:if test="${not empty emailError}">
                                <span class="text-danger">${emailError}</span>
                            </c:if>
                        </div>

                        <!-- Mobile Number -->
                        <div class="form-group">
                            <label for="mobileno">Mobile</label>
                            <input type="text" pattern="^[0-9]{10}$" class="form-control" id="mobileno" name="mobileno" placeholder="Enter mobile no.." required>
                            <small class="form-text text-muted">Mobile number should be exactly 10 digits.</small>
                            <c:if test="${not empty phoneError}">
                                <span class="text-danger">${phoneError}</span>
                            </c:if>
                        </div>
                 
                        <!-- Street -->
                        <div class="form-group">
                            <label for="street">Street</label>
                            <input type="text" class="form-control" id="street" name="street" placeholder="Enter Street" required>
                        </div>
                 
                        <!-- City -->
                        <div class="form-group">
                            <label for="city">City</label>
                            <input type="text" class="form-control" id="city" name="city" placeholder="Enter city.." required>
                        </div>
                 
                        <!-- Pin code -->
                        <div class="form-group">
                            <label for="pincode">Pin code</label>
                            <input type="text" pattern="^[0-9]{6}$" class="form-control" id="pincode" name="pincode" placeholder="Enter pincode.." required>
                            <small class="form-text text-muted">Pin code should be exactly 6 digits.</small>
                        </div>
              
                        <!-- Password -->
                        <div class="form-group">
                            <label for="password">Password</label>
                            <input type="password" pattern=".{8,20}" class="form-control" id="password" name="password" placeholder="Enter password.." required>
                            <small class="form-text text-muted">Password should be between 8 to 20 characters.</small>
                        </div>
                        
                        
                         <!-- Register Button -->
                        <div class="container text-center">
                            <button type="submit" class="btn custom-bg-2 text-white"><b>Register</b></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
