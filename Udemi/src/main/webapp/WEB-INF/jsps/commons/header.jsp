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
	
	<link href="${contextPath}/resources/css/flipclock.css"
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
	
	<script src="${contextPath}/resources/javascripts/flipclock.js"
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
<body class="page-header-fixed bg-1">
    <div class="modal-shiftfix">
      <!-- Navigation -->
      <div class="navbar navbar-fixed-top scroll-hide">
        <div class="container-fluid top-bar">
          <div class="pull-right">
            <ul class="nav navbar-nav pull-right">
              <li class="dropdown notifications hidden-xs">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span aria-hidden="true" class="se7en-flag"></span>
                  <div class="sr-only">
                    Notifications
                  </div>
                  <p class="counter">
                    4
                  </p>
                </a>
                <ul class="dropdown-menu">
                  <li><a href="#">
                    <div class="notifications label label-info">
                      New
                    </div>
                    <p>
                      New user added: Jane Smith
                    </p></a>
                    
                  </li>
                  <li><a href="#">
                    <div class="notifications label label-info">
                      New
                    </div>
                    <p>
                      Sales targets available
                    </p></a>
                    
                  </li>
                  <li><a href="#">
                    <div class="notifications label label-info">
                      New
                    </div>
                    <p>
                      New performance metric added
                    </p></a>
                    
                  </li>
                  <li><a href="#">
                    <div class="notifications label label-info">
                      New
                    </div>
                    <p>
                      New growth data available
                    </p></a>
                    
                  </li>
                </ul>
              </li>
              <li class="dropdown messages hidden-xs">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#"><span aria-hidden="true" class="se7en-envelope"></span>
                  <div class="sr-only">
                    Messages
                  </div>
                  <p class="counter">
                    3
                  </p>
                </a>
                <ul class="dropdown-menu messages">
                  <li><a href="#">
                    <img width="34" height="34" src="images/avatar-male2.png" />Could we meet today? I wanted...</a>
                  </li>
                  <li><a href="#">
                    <img width="34" height="34" src="images/avatar-female.png" />Important data needs your analysis...</a>
                  </li>
                  <li><a href="#">
                    <img width="34" height="34" src="images/avatar-male2.png" />Buy Se7en today, it's a great theme...</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown user hidden-xs"><a data-toggle="dropdown" class="dropdown-toggle" href="#">
                <img width="34" height="34" src="images/avatar-male.jpg" />John Smith<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="#">
                    <i class="fa fa-user"></i>My Account</a>
                  </li>
                  <li><a href="#">
                    <i class="fa fa-gear"></i>Account Settings</a>
                  </li>
                  <li><a href="${contextPath}/login?logout">
                    <i class="fa fa-sign-out"></i>Logout</a>
                  </li>
                </ul>
              </li>
            </ul>
          </div>
          <button class="navbar-toggle"><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="logo" href="index.html">Test</a>
          <!--<form class="navbar-form form-inline col-lg-2 hidden-xs">
            <input class="form-control" placeholder="Search" type="text">
          </form>-->
        </div>
        <div class="container-fluid main-nav clearfix">
          <div class="nav-collapse">
            <ul class="nav">
              <li>
                <a class="current" href="index.html"><span aria-hidden="true" class="se7en-home"></span>Dashboard</a>
              </li>
              <li><a href="social.html">
                <span aria-hidden="true" class="se7en-feed"></span>Social Feed</a>
              </li>
              <li class="dropdown"><a data-toggle="dropdown" href="#">
                <span aria-hidden="true" class="se7en-star"></span>UI Features<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="buttons.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Buttons
                    </p></a>
                    
                  </li>
                  <li><a href="fontawesome.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Font Awesome Icons
                    </p></a>
                    
                  </li>
                  <li><a href="glyphicons.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Glyphicons
                    </p></a>
                    
                  </li>
                  <li>
                    <a href="components.html">Components</a>
                  </li>
                  <li>
                    <a href="widgets.html">Widgets</a>
                  </li>
                  <li>
                    <a href="typo.html">Typography</a>
                  </li>
                  <li>
                    <a href="grid.html">Grid Layout</a>
                  </li>
                </ul>
              </li>
              <li class="dropdown"><a data-toggle="dropdown" href="#">
                <span aria-hidden="true" class="se7en-forms"></span>Forms<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="form-components.html">Form Components</a>
                  </li>
                  <li>
                    <a href="form-advanced.html">Advanced Forms</a>
                  </li>
                  <li><a href="xeditable.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      X-Editable
                    </p></a>
                    
                  </li>
                  <li><a href="file-upload.html">
                    <div class="notifications label label-warning">
                      New
                    </div>
                    <p>
                      Multiple File Upload
                    </p></a>
                    
                  </li>
                  <li><a href="dropzone-file-upload.html">
                    <div class="notifications label label-warning">
                      New
                    </div>
                    <p>
                      Dropzone File Upload
                    </p></a>
                    
                  </li>
                </ul>
              </li>
              <li class="dropdown"><a data-toggle="dropdown" href="#">
                <span aria-hidden="true" class="se7en-tables"></span>Tables<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li>
                    <a href="tables.html">Basic tables</a>
                  </li>
                  <li>
                    <a href="datatables.html">DataTables</a>
                  </li>
                  <li><a href="datatables-editable.html">
                    <div class="notifications label label-warning">
                      New
                    </div>
                    <p>
                      Editable DataTables
                    </p></a>
                    
                  </li>
                </ul>
              </li>
              <li><a href="charts.html">
                <span aria-hidden="true" class="se7en-charts"></span>Charts</a>
              </li>
              <li class="dropdown"><a data-toggle="dropdown" href="#">
                <span aria-hidden="true" class="se7en-pages"></span>Pages<b class="caret"></b></a>
                <ul class="dropdown-menu">
                  <li><a href="chat.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Chat
                    </p></a>
                    
                  </li>
                  <li>
                    <a href="calendar.html">Calendar</a>
                  </li>
                  <li><a href="timeline.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Timeline
                    </p></a>
                    
                  </li>
                  <li><a href="login1.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Login 1
                    </p></a>
                    
                  </li>
                  <li>
                    <a href="login2.html">Login 2</a>
                  </li>
                  <li><a href="signup1.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Sign Up 1
                    </p></a>
                    
                  </li>
                  <li><a href="messages.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Messages/Inbox
                    </p></a>
                    
                  </li>
                  <li><a href="pricing.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Pricing Tables
                    </p></a>
                    
                  </li>
                  <li>
                    <a href="signup2.html">Sign Up 2</a>
                  </li>
                  <li><a href="invoice.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      Invoice
                    </p></a>
                    
                  </li>
                  <li><a href="faq.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      FAQ
                    </p></a>
                    
                  </li>
                  <li>
                    <a href="filters.html">Filter Results</a>
                  </li>
                  <li>
                    <a href="404-page.html">404 Page</a>
                  </li>
                  <li><a href="500-page.html">
                    <span class="notifications label label-warning">New</span>
                    <p>
                      500 Error
                    </p></a>
                    
                  </li>
                </ul>
              </li>
              <li><a href="gallery.html">
                <span aria-hidden="true" class="se7en-gallery"></span>Gallery</a>
              </li>
            </ul>
          </div>
        </div>
      </div>