<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>
<spring:url var="vendor" value="/resources/vendor"></spring:url>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

  <head>
  	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="Felicie Neuville">

    <title>Loisiflor Ets Vatan - ${title}</title>

	<script>
		window.menu = '${title}';
	
	</script>
	
    <!-- Bootstrap core CSS -->
    <link href="${vendor}/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap SpaceLab Theme -->
    <link href="${css}/bootstrapSpaceLabTheme.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/shop-homepage.css" rel="stylesheet">

  </head>

  <body>
	
	<div class="wrapper">
	
	
	    <!-- Navigation -->
	  	<%@include file="./shared/navbar.jsp"%>
	  
	    <!-- Page Content -->
    
    	<div class="content">
    
		    <!-- Loading the home content -->
		    <c:if test="${userClickHome == true}">
				<%@include file="home.jsp"  %>
			</c:if>
	
			<!-- Load only when user clicks about  -->
			<c:if test="${userClickAbout == true}">
				<%@include file="about.jsp"  %>
			</c:if>
	
			<!-- Load only when user clicks contact  -->
			<c:if test="${userClickContact == true}">
				<%@include file="contact.jsp"  %>
			</c:if>
			
			<!-- Load only when user clicks contact  -->
			<c:if test="${userClickAllProducts == true or userClickFamilyProducts == true}">
				<%@include file="listProducts.jsp"  %>
			</c:if>
	
		</div>
	
	
    <!-- Footer comes here -->
	<%@include file="./shared/footer.jsp"%>

    <!-- Bootstrap core JavaScript -->
    <script src="${vendor}/jquery/jquery.min.js"></script>
    <script src="${vendor}/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Self coded javascript -->
 	<script src="${js}/myapp.js"></script>
 	</div>
 	
  </body>

</html>
