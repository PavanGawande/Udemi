<jsp:include page="/WEB-INF/jsps/commons/header.jsp" />
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

  <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">   
  
  
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
         <c:if test="${userBean.forgetPasswordBean.isPasswordUpdate eq 'Y'}">
               
                  <h4 class="modal-title">congratulations</h4>
         </c:if>
         
          <c:if test="${userBean.forgetPasswordBean.isPasswordUpdate eq 'N'}">
               
                  <h4 class="modal-title">OOPS SomeThing Went Wrong!!!!</h4>
         </c:if>

        </div>
        <div class="modal-body">
          <c:if test="${userBean.forgetPasswordBean.isPasswordUpdate eq 'Y'}">
              <p>You Successfully Change the Password </p>
          </c:if>
          
            <c:if test="${userBean.forgetPasswordBean.isPasswordUpdate eq 'N'}">
               
               <p>You have Enter Wrong OTP or OTP is expired to  </p>
               <p>Regenerate OTP click on Below Link  </p>
               
                  <a href="#" type="button" onclick="reGenerateOtp('${userBean.forgetPasswordBean.email}')">Regenerate Otp</a>
            </c:if>
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal" onclick="redirectToLogin()">Close</button>
        </div>
      </div>
      
    </div>
  </div>
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
					<form:form modelAttribute="userBean" method="POST" action="forgetPassword" class="form-horizontal">
						<div class="form-group">
						<label class="control-label col-md-2"></label>
							<div class="col-md-7">
								<div class="alert alert-success">
									OTP is send on <strong>${userBean.forgetPasswordBean.email}</strong>

								</div>
								<div class="alert alert-warning">
									<strong>OTP</strong> is Valid for 30 min.
								</div>
							</div>
						</div>
						<input type="hidden" name="forgetPasswordBean.email" value="${userBean.forgetPasswordBean.email}">
						<input type="hidden" name="forgetPasswordBean.isOtpPage" value="Y">
						
						<div class="form-group">
									<label class="control-label col-md-2"></label>
									<div class="col-md-7">
										  <form:errors path="passwordCommErr" cssClass="errorMessage"/>
									</div>
					</div>
						
						    <div class="form-group">
							<label class="control-label col-md-2">Enter OTP</label>
							<div class="col-md-7">
								<input type="text" class="form-control" placeholder="Enter First Name" name="forgetPasswordBean.otp" value="${userBean.forgetPasswordBean.otp}"/>
								<form:errors path="forgetPasswordBean.otp" cssClass="errorMessage"/>
						
							</div>
							<a href="#" type="button" onclick="reGenerateOtp('${userBean.forgetPasswordBean.email}')">Regenerate Otp</a>
						</div>
						  
						   <div class="form-group">
							<label class="control-label col-md-2">Enter Password</label>
							<div class="col-md-7">
								<input type="text" class="form-control" placeholder="Enter First Name" name="forgetPasswordBean.password" value="${userBean.forgetPasswordBean.password}"/>
								<form:errors path="forgetPasswordBean.password" cssClass="errorMessage"/>
						
							</div>
						</div>
						
						
						<div class="form-group">
							<label class="control-label col-md-2">Confirm Password</label>
							<div class="col-md-7">
								<input type="text" class="form-control" placeholder="Enter First Name" name="forgetPasswordBean.confirmPassword" value="${userBean.forgetPasswordBean.confirmPassword}"/>
								<form:errors path="forgetPasswordBean.confirmPassword" cssClass="errorMessage"/>
						
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

$(document).ready(function () {

  var  isPasswordUpdate = "${userBean.forgetPasswordBean.isPasswordUpdate}";
      
      if(isPasswordUpdate == 'Y' || isPasswordUpdate == 'N'){
    	
    	  $('#myModal').modal('show');
      }
       
   });
   
   function redirectToLogin(){
	   window.location.href = "${contextPath}/login";
   }
   
   function reGenerateOtp(email){
	   
	   window.location.href = "${contextPath}/regenerateOtp?email="+email;
   }

</script>

