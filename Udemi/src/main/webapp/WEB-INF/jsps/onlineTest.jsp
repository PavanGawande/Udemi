
<jsp:include page="/WEB-INF/jsps/commons/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<div class="container-fluid main-content">
	<div class="page-title" style="margin-top: 1%;">

		<h1>User Registration</h1>
	</div>
	<div class="row">
		<div class="col-lg-12 ">
			<div class="widget-container fluid-height clearfix stats-container">
				<div class="heading">
					<i class="fa fa-bars"></i>User Registration
				</div>
				<div class="widget-content padded">

					<div class="col-md-9" style="font-size: 185%">
						<form action="confirmPassword" class="form-horizontal">

							<div class="form-group">
								<label class="control-label col-md-1"></label>
								<div class="col-md-6">
									<label class="checkbox"><span class="question">What
											is Java</span></label>
								</div>
							</div>



							<div class="form-group">
								<label class="control-label col-md-1"></label>
								<div class="col-md-7">
									<label class="checkbox"><input type="checkbox"><span>Checkbox
											1</span></label><label class="checkbox"><input type="checkbox"><span>Checkbox
											2</span></label><label class="checkbox"><input type="checkbox"><span>Checkbox
											3</span></label><label class="checkbox"><input type="checkbox"><span>Checkbox
											4</span></label><label class="checkbox"><input type="checkbox"><span>Checkbox
											1</span></label>
											<label class="checkbox"><input type="checkbox"><span>Checkbox
											1</span></label>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label col-md-1"></label>
								<div class="col-md-7">
									<button class="btn btn-primary" type="submit">Submit</button>
									<button class="btn btn-default-outline">Cancel</button>
								</div>
							</div>
						</form>
					</div>

					
						<div class="col-md-3">
							<div class="number">
								<div class="icon globe"></div>
								86<small>%</small>
							</div>
							<div class="text">Overall growth</div>
						</div>
						
						<div class="col-md-3">
							<div class="number">
								<div class="icon globe"></div>
								86<small>%</small>
							</div>
							<div class="text">Overall growth</div>
						</div>
						
						<div class="col-md-3">
							<div class="number">
								<div class="icon globe"></div>
								86<small>%</small>
							</div>
							<div class="text">Overall growth</div>
						</div>
						<div class="col-md-3">
							<div class="number">
								<div class="icon globe"></div>
								86<small>%</small>
							</div>
							<div class="text">Overall growth</div>
						</div>

					
				</div>
			</div>
		</div>

	</div>
</div>

<jsp:include page="/WEB-INF/jsps/commons/footer.jsp" />
