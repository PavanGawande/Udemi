<jsp:include page="/WEB-INF/jsps/commons/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container-fluid main-content">
	<div class="page-title" style="margin-top: 1%;">

		<h1>User Registration</h1>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="widget-container fluid-height clearfix">
				<div class="heading">
					<i class="fa fa-bars"></i>User Registration
				</div>
				<div class="widget-content padded">
				<c:choose> 
				   <c:when test="${isUserSave ne 'Y' }">
				

							<form:form modelAttribute="userBean" method="POST"
								action="confirmPassword" class="form-horizontal">
                                   
                                   <form:hidden path="firstName"/>
                                   <form:hidden path="middleName"/>
                                   <form:hidden path="lastName"/>
                                   <form:hidden path="email"/>
                                   <form:hidden path="showPassField"/>
                                 <div class="form-group">
									<label class="control-label col-md-2"></label>
									<div class="col-md-7">
										  <form:errors path="passwordCommErr" cssClass="errorMessage"/>
									</div>
								</div>
                                  
								<div class="form-group">
									<label class="control-label col-md-2">Enter Password</label>
									<div class="col-md-7">
										<form:input class="form-control" placeholder="Enter Email Id" path="password" />
										<form:errors path="password" cssClass="errorMessage"/>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2">Confirm Password</label>
									<div class="col-md-7">
										<form:input class="form-control" placeholder="Enter Email Id" path="confirmPassword" />
										<form:errors path="confirmPassword" cssClass="errorMessage"/>
									</div>
								</div>

								<div class="form-group">
									<label class="control-label col-md-2">Form Actions</label>
									<div class="col-md-7">
										<button class="btn btn-primary" type="submit">Submit</button>
										<button class="btn btn-default-outline">Cancel</button>
									</div>
								</div>


							</form:form>
			
				</c:when>
				<c:otherwise>
					<div class="form-group">
									<label class="control-label col-md-2"></label>
									<div class="col-md-7">
				<div class="alert alert-success">
    <strong>Success!</strong> This alert box could indicate a successful or positive action.
  </div>
				</div></div>
				</c:otherwise>
				</c:choose>
			</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/jsps/commons/footer.jsp" />

<script type="text/javascript">
	
</script>

