<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <div class="masthead">
        <h3 class="text-muted">${mainVo.companyName}</h3>
        <nav class="navbar navbar-default" role="navigation">
            <ul class="nav nav-justified">
                <li><a href="<c:url value='/'/>">Home</a></li>
                <li>
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">android<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<c:url value='/admin/messagePush/messagePushView.do'/>">message push</a></li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">d3<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<c:url value='/test/d3/testView01.do'/>">testView01</a></li>
                        <li><a href="<c:url value='/test/d3/testView02.do'/>">testView02</a></li>
                        <li><a href="<c:url value='/test/d3/testView03.do'/>">testView03</a></li>
                        <li><a href="<c:url value='/test/d3/testView04.do'/>">testView04</a></li>
                        <!--<li class="divider"></li>-->
                        <!--<li class="dropdown-header">Nav header</li>-->
                        <li><a href="#">Separated link</a></li>
                        <li><a href="#">One more separated link</a></li>
                    </ul>
                </li>
                <li><a href="#">EMPTY</a></li>
                <li><a href="#">EMPTY</a></li>
                <li><a href="#">EMPTY</a></li>
            </ul>
        </nav>
    </div>
</html>