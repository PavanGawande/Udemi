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
					<form:form modelAttribute="OnlineTestQuestionBean" method="POST" action="savequestion" class="form-horizontal"> 
							
							<form:hidden path="optionsCount"/>


						<div class="form-group">
							<label class="control-label col-md-2">Type Of Test</label>
							<div class="col-md-7">
								<select class="select2able" name="courceId" id="courseId">
								<option value="">Select the Test Type</option>
								<c:forEach items="${courseLst}" var="course">
								
								    <option value="${course.courseId}" ${courseId == course.courseId ?'selected' : ''}>${course.course}</option>
								</c:forEach>
							
								</select>
							</div>
						</div>



						<div class="form-group">
							<label class="control-label col-md-2">Enter your question
								here.</label>
							<div class="col-md-7">
								<textarea class="form-control" rows="3" name="question" id="question" placeholder="Enter your question">
								      ${OnlineTestQuestionBean.question}
								</textarea>
							
							 <a class="${hideShowDiv != 'Y' ? 'hidden' : show}" onclick="hideShowDiv()" id="addMoreOptionsLink">Add More Options(MCQ)</a>
							              	
								<form:errors path="question" cssClass="errorMessage"/>
								
							</div>
						</div>

                     <div class="${hideShowDiv == 'Y' ? 'hidden' : show}" id="optionsCountDiv">
						<div class="form-group">
							<label class="control-label col-md-2">Please Enter Number
								Of Count Option</label>
							<div class="col-md-7">
								<input class="form-control" placeholder="Text" type="text" id="optionsCountField">
								
							</div>
						</div>



						<div class="form-group">
							<label class="control-label col-md-2"></label>
							<div class="col-md-7">
								<a href="#" type="button" onclick="sentOptionCountToBknd()">Show Options</a>
								<!-- <button class="btn btn-default-outline">Cancel</button> -->
							</div>
						</div>
					
					</div>
					<c:if test="${OnlineTestQuestionBean.optionsCount > 0}">
					<div  id="optionAnswer">
						<c:forEach begin="1" end="${OnlineTestQuestionBean.optionsCount}"  varStatus="loop">             
                  		<div class="form-group">
							<label class="control-label col-md-2">Option ${loop.index }</label>
							<div class="col-md-7">

								 <input class="form-control" placeholder="Text" type="text" name="options[${loop.index-1}]" value="${OnlineTestQuestionBean.options[loop.index-1]}">
								
								<form:errors path="options[${loop.index-1}]" cssClass="errorMessage"/>
								

							</div>
							<div class="col-md-2" style="margin-left: 1%;">

								<div class="form-group">

									<div>
										<label class="checkbox-inline"> <input type="checkbox" name="answer[${loop.index-1}]" value="Y"  ${OnlineTestQuestionBean.answer[loop.index-1] eq 'Y' ? 'checked' : '' }><span>Answer</span></label>
										
										<form:errors path="answer" cssClass="errorMessageAnswer"/>
									</div>
									
								</div>
							</div>
						</div>
                      </c:forEach>
                     </div> 
                    
						<div class="form-group" id="formAction">
							<label class="control-label col-md-2">Form Actions</label>
							<div class="col-md-7">
								<button class="btn btn-primary" type="submit">Submit</button>
								<button class="btn btn-default-outline">Cancel</button>
							</div>
						</div>
					</c:if>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</div>

<jsp:include page="/WEB-INF/jsps/commons/footer.jsp" />

<script type="text/javascript">
           
function sentOptionCountToBknd() {
	
	var optionsCount = document.getElementById("optionsCountField").value;
	var question = document.getElementById("question").value;
	var courseId = document.getElementById("courseId").value;
	location.replace("${contextPath}/showoptionsfield?optionsCount="+optionsCount+"&question="+question+"&courseId="+courseId);
	
}
 
function hideShowDiv(){
	document.getElementById("optionsCountDiv").classList.remove('hidden');
	document.getElementById("addMoreOptionsLink").classList.add('hidden');
	document.getElementById("optionAnswer").classList.add('hidden');
	document.getElementById("formAction").classList.add('hidden');
}
</script>

