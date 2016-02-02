<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<script>
    function goUserUpdate(){
        document.location.href ="<c:url value='/member/userInfo/userUpdateView.do'/>";
    }

    function doLogout(){
        document.location.href ="<c:url value='/user/main/j_spring_security_logout.do'/>";
    }

    function doSetup(){
        document.location.href = "<c:url value='/admin/setup/setupView.do'/>"
    }
</script>
<div class="topHeader">
    <button type="button" class="btn btn-xs btn-info" onclick="goUserUpdate();">
        <c:out value="${memberVo.name}"/>
    </button>
    <button type="button" class="btn btn-xs btn-info" onClick="doSetup();">설정</button>
    <button type="button" class="btn btn-xs btn-info" onClick="doLogout();">로그아웃</button>
</div>
</html>