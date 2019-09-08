<jsp:include page="/WEB-INF/jsps/commons/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container-fluid main-content">
	<div class="page-title" style="margin-top: 1%;">

		<h1>Form Components</h1>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<div class="widget-container fluid-height clearfix">
				<div class="heading">
					<i class="fa fa-bars"></i>Basic Components
				</div>
				<div class="widget-content padded">
					<form:form modelAttribute="userBean" method="POST" action="forgetPasswordEnterEmail" class="form-horizontal"> 
						
		
                         <div class="form-group">
							<label class="control-label col-md-2">Enter Your Email</label>
							<div class="col-md-7">
								<input type="text" class="form-control" placeholder="Enter First Name" name="forgetPasswordBean.email"/>
								<form:errors path="forgetPasswordBean.email" cssClass="errorMessage"/>
						
							</div>
						</div>
						<div class="form-group" id="formAction">
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

