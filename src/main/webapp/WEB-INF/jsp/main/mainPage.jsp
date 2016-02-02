<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Justified Nav Template for Bootstrap</title>

    <!--공통 style import-->
    <%@ include file="/WEB-INF/jsp/common/commonStyle.jsp"%>

    <!-- Custom styles for this template -->
    <link rel="stylesheet" href="<c:url value='/css/pageCss/carousel.css'/>">

    <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
    <!--[if lt IE 9]>
    <!--<script src="<c:url value='/assets/js/ie8-responsive-file-warning.js'/>"></script>-->
    <![endif]-->
    <!--<script src="<c:url value='/assets/js/ie-emulation-modes-warning.js'/>"></script>-->
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <!--<script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>-->
    <!--<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>-->
    <![endif]-->
</head>
<body>

<div class="container">

    <!--import topHeader -->
    <c:import url="/conponent/topHeaderPage.do"/>

    <!--import header-->
    <c:import url="/conponent/headerPage.do"/>

    <!-- import Carousel -->

    <!-- import Jumbotron -->
    <c:import url="/conponent/jumbotronPage.do"/>

    <!-- import Featurettes -->
    <c:import url="/conponent/featurettesPage.do"/>

    <!-- import footer -->
    <c:import url="/conponent/footerPage.do"/>

</div> <!-- /container -->
</body>
</html>