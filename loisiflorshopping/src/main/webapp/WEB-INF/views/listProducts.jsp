<div class="container">

	<div class="row">
	
		<!-- Would be to display sidebar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp" %>
		</div>
	
		<!-- to display the actual products -->
		<div class="col-md-9">
			<!-- Added breadcrumb component -->
			<div class="row">
				<div class="col-lg-12">
				
					<c:if test="${userClickAllProducts == true}">
					
						<ol class="breadcrumb">
						
						<li><a href="${contextRoot}/home"> Home </a></li>
						<li class="active"> All Products </li>
						
						</ol>
				
					</c:if>
					
					<c:if test="${userClickFamilyProducts == true}">
					<ol class="breadcrumb">
					
						<li><a href="${contextRoot}/home"> Home </a></li>
						<li class="active"> Family </li>
						<li class="active">${family.nameFamily}</li>
					
					</ol>
					</c:if>
					
					<!-- col-lg-12 -->
				</div>
				<!-- row -->
			</div>
			<!-- col-md-9 -->
		</div>
		<!-- row -->
	</div>


<!-- container -->
</div>