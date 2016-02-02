<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
    <style>
    .node rect {
    cursor: move;
    shape-rendering: crispEdges;
    }

    .node text {
    pointer-events: none;
    text-shadow: 1px 1px 2px #fff;
    font-size: 0.8em;
    font-family: sans-serif;
    }

    #tooltip {
    position: absolute;
    pointer-events: none;
    font-size: 0.7em;
    font-family: sans-serif;
    padding: 3px;
    width: auto;
    height: auto;
    background-color: #F2F2F2;
    -webkit-box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.4);
    -mox-box-shadow: 0px 0px 0px 5px rgba(0, 0, 0, 0.4);
    box-shadow: 0px 0px 5px rbga(0, 0, 0, 0.4);
    pointer-events: none;
    }

    .value {
    white-space: pre-line;
    margin: 0;
    }
    </style>
</head>
<body>
<div id="chart"></div>

<script src="/b40/d3/d3.min.js"></script>
<script src="/b40/d3/bihisankey.js"></script>
<script src="<c:url value='/d3/app.js'/>"></script>

</body>
</html>