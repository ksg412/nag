<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<html>
<head>
	<%@ include file="/WEB-INF/jsp/common/commonStyle.jsp"%>
	<script src="<c:url value='/js/pageJs/offcanvas.js'/>"></script>
<%-- 	<link rel="stylesheet" href="<c:url value='/css/pageCss/offcanvas.css'/>"> --%>
	<link rel="stylesheet" href="<c:url value='/css/pageCss/sticky-footer-navbar.css'/>">
	
	<title>mainPage</title>
	<script type="text/javascript"> 
	</script>
</head>
<body>
	<c:import url="/conponent/headerPage.do"/>
	<div class="container">
		<div class="row row-offcanvas row-offcanvas-right">
			<div class="col-xs-12 col-sm-9">
				<p class="pull-right visible-xs">
					<button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
				</p>
				<div class="jumbotron">
					<h1>안녕하세요! <c:out value="${userId}"/>님</h1>
					<p>이 시스템은 물품을 관리하는 시스템입니다.</p>
				</div>
				<div class="row">
					<div class="col-xs-12 col-lg-8">
						<h2>공지사항</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
						<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
					</div><!--/.col-xs-6.col-lg-4-->
					<div class="col-xs-12 col-lg-4">
						<h2>실시간현황</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
						<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
					</div><!--/.col-xs-6.col-lg-4-->
	<!--             <div class="col-xs-6 col-lg-4"> -->
	<!--               <h2>Heading</h2> -->
	<!--               <p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p> -->
	<!--               <p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p> -->
	<!--             </div>/.col-xs-6.col-lg-4 -->
					<div class="col-xs-12 col-lg-4">
						<h2>회계</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
						<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
					</div><!--/.col-xs-6.col-lg-4-->
					<div class="col-xs-12 col-lg-4">
						<h2>일정</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
						<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
					</div><!--/.col-xs-6.col-lg-4-->
					<div class="col-xs-12 col-lg-4">
						<h2>member</h2>
						<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, tellus ac cursus commodo, tortor mauris condimentum nibh, ut fermentum massa justo sit amet risus. Etiam porta sem malesuada magna mollis euismod. Donec sed odio dui. </p>
						<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>
					</div><!--/.col-xs-6.col-lg-4-->
				</div><!--/row-->
			</div><!--/.col-xs-12.col-sm-9-->

			<div class="col-xs-6 col-sm-3 sidebar-offcanvas" id="sidebar">
				<div class="list-group">
					<a href="#" class="list-group-item active">즐겨찾기</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
					<a href="#" class="list-group-item">Link</a>
				</div>
			</div><!--/.sidebar-offcanvas-->
		</div><!--/row-->
	</div>
	<c:import url="/conponent/footerPage.do"/>
</body>
</html>
