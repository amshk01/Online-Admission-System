<%@page import="com.onlineadmission.utility.DBContants.ApprovalStatus"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home- Online Admission</title>
<%@ include file="./components/common_cs_js.jsp"%>
</head>
<body>
	<%@ include file="./components/navbar.jsp"%>
	<div id="carouselExampleIndicators" class="carousel slide"
		data-ride="carousel">
		<ol class="carousel-indicators">
			<li data-target="#carouselExampleIndicators" data-slide-to="0"
				class="active"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
			<li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
		</ol>
		<div class="carousel-inner" style="width: 100%">
			<div class="carousel-item active">
				<img class="d-block w-100" src="resources/images/slide1.jpg"
					alt="First slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="resources/images/slide2.jpg"
					alt="Second slide">
			</div>
			<div class="carousel-item">
				<img class="d-block w-100" src="resources/images/slide3.jpg"
					alt="Third slide">
			</div>
		</div>
		<a class="carousel-control-prev" href="#carouselExampleIndicators"
			role="button" data-slide="prev"> <span
			class="carousel-control-prev-icon" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="carousel-control-next" href="#carouselExampleIndicators"
			role="button" data-slide="next"> <span
			class="carousel-control-next-icon" aria-hidden="true"></span> <span
			class="sr-only">Next</span>
		</a>
	</div>
	<%@ include file="./components/message.jsp"%>
   
   <%
    
   System.out.println(userType);
   
     if(userType != null && userType.equals("student")) {
    	System.out.println("user is not null");
    	StudentApplication studentApplication = applicationDao.findByStudentId(student.getId()); 
    	
    	
		if(studentApplication != null && studentApplication.getIsApproved().equals(ApprovalStatus.APPROVED.value())) {
			%>
		    <div class="text-center text-color">Your Application is <span class="text-success">APPROVED</span>,<a href="applycollege"><span class="text-danger">click here to Apply Colleges</span></a></div>

<%
}
	 }
   %>
   

    <div class="container-fluid mt-4 mb-5">
    <div class="row">
      <div class="col-md-2">
             <div class="list-group ">
                <a href="#" class="list-group-item  btn-primary"><h5>All Courses</h5></a>
               <%
               List<Course> courses = courseDao.findAll();
                    for(Course course: courses)
                    {    	
               %>      
                     <p class="border-b courses">
						<a href="#" class="list-group-item list-group-item-action"><%=course.getName()%></a>
					 </p>    
               <%
                    }
               %>
               </div>
         </div>
      
      
      <div class="col-md-10"> 
          <div class="container-fluid">

		<div class="row">
		
		    <div class="col-md-9">

				<div class="row ">
					<div class="col-md-7">
						<div class="mt-3 text-color">
						<div class = "center-align"></div>
							<h3>
								About CTS University 
							</h3>
						</div>
					</div>
				</div>

				<div class="text-color">
					<p class="paragraphtext">
						


Welcome to CTS University, where learning knows no bounds and dreams are transformed into reality. Since our founding in 1978, we have been dedicated to providing a world-class education that empowers students to excel, innovate, and lead in their chosen fields.<br>
<h5>Our Mission</h5>At CTS University, our mission is to foster academic excellence and holistic growth. 
We strive to cultivate a diverse and inclusive community that encourages intellectual curiosity, critical thinking, and a commitment to making a positive impact on society.<br>
<br><h5>Our Values</h5>Excellence : We are driven by a pursuit of excellence in education, research, and service to our community. Our rigorous academic programs and dedicated faculty inspire students to strive for their best.
<br><br>
Innovation : We embrace innovation and creativity as catalysts for growth. Our students are encouraged to think outside the box, challenge conventions, and explore new frontiers.
<br><br>
Inclusivity : We celebrate diversity and provide an inclusive environment where every voice is valued. Our commitment to equity ensures that all students have equal opportunities to thrive.<br>
<br>

<h5>Achievements</h5>With a legacy of academic prowess, our graduates have made significant contributions to their respective fields. 
Our research breakthroughs and collaborative projects have garnered national and international recognition.<br>
<br>
<h5>Future Goals</h5>As we move forward, we remain committed to innovation and relevance. 
We plan to expand our program offerings, enhance our research initiatives, and continue fostering an environment where students thrive both academically and personally.<br>
<br><h5>Join Us on this Journey</h5>Discover a community where learning goes beyond textbooks, where friendships are forged, and where dreams take flight. 
Explore our programs, engage with our faculty, and become a part of the CTS University family. Together, we're shaping the leaders of tomorrow. 
					
				</div>
			</div>

			<div class="col-md-3">
				<img src="resources/images/landing_image.jpeg"
					style="max-height: 400px; max-width: 100%; width: auto;"
					class="card-img-top rounded mx-auto d-block m-2" alt="img">

			</div>

		</div>

	</div>

	<hr>
	
	 <%@ include file="./components/footer.jsp"%>

</body>
</html>