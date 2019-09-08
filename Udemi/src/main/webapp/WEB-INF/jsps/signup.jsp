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
					<form:form modelAttribute="userBean" method="POST" action="signup" class="form-horizontal">


						<div class="form-group">
							<label class="control-label col-md-2">First Name</label>
							<div class="col-md-7">
								<form:input class="form-control" placeholder="Enter First Name" path="firstName" />
								<form:errors path="firstName" cssClass="errorMessage"/>
						
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">Middle Name</label>
							<div class="col-md-7">
								<form:input class="form-control" placeholder="Enter Middle Name"	path="middleName" />
								
							</div>
						</div>

						<div class="form-group">
							<label class="control-label col-md-2">Last Name</label>
							<div class="col-md-7">
								<form:input class="form-control" placeholder="Enter Last Name" path="lastName" />
								<form:errors path="lastName" cssClass="errorMessage"/>
							</div>
						</div>
						
						<div class="form-group">
							<label class="control-label col-md-2">Email Id</label>
							<div class="col-md-7">
								<form:input class="form-control" placeholder="Enter Email Id" path="email" />
								<form:errors path="email" cssClass="errorMessage"/>
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
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/jsps/commons/footer.jsp" />

<script type="text/javascript">
         
</script>

