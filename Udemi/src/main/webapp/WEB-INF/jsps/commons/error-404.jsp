<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
  <head>
<title>Udemi Online Exam</title>
<link href="http://fonts.googleapis.com/css?family=Lato:100,300,400,700"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/bootstrap.min.css"
	media="all" rel="stylesheet" type="text/css" />
	<link href="${contextPath}/resources/css/common.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/font-awesome.min.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/se7en-font.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/isotope.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/jquery.fancybox.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/fullcalendar.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/wizard.css" media="all"
	rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/select2.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/morris.css" media="all"
	rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/datatables.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/datepicker.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/timepicker.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/colorpicker.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/bootstrap-switch.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/bootstrap-editable.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/daterange-picker.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/typeahead.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/summernote.css"
	media="all" rel="stylesheet" type="text/css" />
<link
	href="${contextPath}/resources/stylesheets/ladda-themeless.min.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/social-buttons.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/pygments.css"
	media="all" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/style.css" media="all"
	rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/color/green.css"
	media="all" rel="alternate stylesheet" title="green-theme"
	type="text/css" />
<link href="${contextPath}/resources/stylesheets/color/orange.css"
	media="all" rel="alternate stylesheet" title="orange-theme"
	type="text/css" />
<link href="${contextPath}/resources/stylesheets/color/magenta.css"
	media="all" rel="alternate stylesheet" title="magenta-theme"
	type="text/css" />
<link href="${contextPath}/resources/stylesheets/color/gray.css"
	media="all" rel="alternate stylesheet" title="gray-theme"
	type="text/css" />
<link
	href="${contextPath}/resources/stylesheets/jquery.fileupload-ui.css"
	media="screen" rel="stylesheet" type="text/css" />
<link href="${contextPath}/resources/stylesheets/dropzone.css"
	media="screen" rel="stylesheet" type="text/css" />
<script src="http://code.jquery.com/jquery-1.10.2.min.js"
	type="text/javascript"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/bootstrap.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/raphael.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/selectivizr-min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/jquery.mousewheel.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/jquery.vmap.min.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.vmap.sampledata.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/jquery.vmap.world.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.bootstrap.wizard.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/fullcalendar.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/gcal.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.dataTables.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/datatable-editable.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.easy-pie-chart.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/excanvas.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/jquery.isotope.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/isotope_extras.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/modernizr.custom.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.fancybox.pack.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/select2.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/styleswitcher.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/wysiwyg.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/typeahead.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/summernote.min.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.inputmask.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/jquery.validate.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-fileupload.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-datepicker.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-timepicker.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-colorpicker.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-switch.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/typeahead.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/spin.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/ladda.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/moment.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/mockjax.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/bootstrap-editable.min.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/xeditable-demo-mock.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/xeditable-demo.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/address.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/daterange-picker.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/date.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/morris.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/skycons.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/fitvids.js"
	type="text/javascript"></script>
<script
	src="${contextPath}/resources/javascripts/jquery.sparkline.min.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/dropzone.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/main.js"
	type="text/javascript"></script>
<script src="${contextPath}/resources/javascripts/respond.js"
	type="text/javascript"></script>
<meta
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"
	name="viewport">
</head>
  <body class="fourofour">
    <!-- Login Screen -->
    <div class="fourofour-container">
      <h1>
        404
      </h1>
      <h2>
        It looks like you're lost.
      </h2>
      <a class="btn btn-lg btn-default-outline" href="index.html"><i class="fa fa-home"></i>Go to the homepage</a>
    </div>
    <!-- End Login Screen -->
  </body>
</html>