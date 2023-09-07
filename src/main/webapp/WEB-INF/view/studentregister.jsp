<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Register</title>
    <%@ include file="./components/common_cs_js.jsp"%>
    <script type="text/javascript">
        function showConventionsAlert() {
            alert("Please ensure you follow all conventions provided. The page will refresh if conventions are not followed.");
        }
        
        
        
        function submitFormAjax(event) {
        	   event.preventDefault(); // Prevents the default form submission

        	   let formData = new FormData(event.target);
        	   fetch('studentregister', {
        	       method: 'POST',
        	       body: formData
        	   })
        	   .then(response => response.json())
        	   .then(data => {
        	       if(!data.success) {
        	           alert(data.message); // You can replace this with a better notification.
        	       } else {
        	           // For success, let's say we redirect them to the OTP verification page
        	           window.location.href = "verifymobileno";
        	       }
        	   })
        	   .catch((error) => {
        	       console.error('Error:', error);
        	   });
        	}

        

        
        
    </script>
</head>
<body>
<%@ include file="./components/navbar.jsp"%>

<div class="container-fluid mb-3">
    <div class="row mt-2">
        <div class="col-md-4 offset-md-4">
            <div class="card border-color">
                <%@ include file="./components/message.jsp"%>
                <div class="card-body px-5 text-color">
                    <img src="resources/images/studentregister.jpeg" class="rounded mx-auto d-block" alt="img" height="90px" width="90px">
                    <h3 class="text-center my-3">Register Student</h3>

                    <form action="studentregister" method="post" onsubmit="submitFormAjax(event);">
                    
           
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
                     <input type="text" class="form-control" id="username" name="username" placeholder="Enter username" required>
                 </div>
                 
                <!-- Email -->
                 <div class="form-group">
                     <label for="emailid">Email</label>
                     <input type="email" pattern="^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$" class="form-control" id="emailid" name="emailid" placeholder="Enter email id.." required>
                     <small class="form-text text-muted">Enter a valid email.</small>
                 </div>
           
                <!-- Mobile Number -->
                  <div class="form-group">
                     <label for="mobileno">Mobile</label>
                     <input type="text" pattern="^[0-9]{10}$" class="form-control" id="mobileno" name="mobileno" placeholder="Enter mobile no.." required>
                     <small class="form-text text-muted">Mobile number should be exactly 10 digits.</small>
                 </div>
                 
                <!-- Street -->
                  <div class="form-group">
                     <label for="street">Street</label>
                     <input type="text" class="form-control" id="street" name="street" placeholder="Enter street" required>
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
                            <button class="btn custom-bg-2 text-white"><b>Register</b></button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>

