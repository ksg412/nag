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

</head>
<body>

<div class="container">

    <!--import topHeader -->
    <c:import url="/conponent/topHeaderPage.do"/>

    <!--import header-->
    <c:import url="/conponent/headerPage.do"/>

    <div class="contentwrap">
        <article class="container bgc-white" >
            <div class="page-header">
                <h3>GCM(Google Cloud Message) based message push test</h3>
            </div>
            <c:url var="post_url"  value="/admin/messagePush/messagePushAction.do" />
            <form:form commandName="messagePushVo" cssClass="form-horizontal" id="frm" ACTION="${post_url}" METHOD="POST" >
                <div class="form-group">
                    <label for="msg" class="col-sm-2 control-label">send message</label>
                    <div class="col-sm-6">
                        <form:input type="msg" path="msg" cssClass="form-control" id="msg" placeholder="send message"/>
                        <form:errors path="msg"  id="msg" cssClass="errorMsg"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="name" class="col-sm-2 control-label"></label>
                    <div class="col-sm-6">
                        <button type="submit" class="btn btn-primary">푸시</button>
                        <button type="button" class="btn btn-primary" onClick="doCancel();">메인</button>
                    </div>
                </div>
            </form:form>
        </article>
    </div>

    <!-- import footer -->
    <c:import url="/conponent/footerPage.do"/>

</div> <!-- /container -->
</body>
</html>