<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<html>
<head>
	<%@ include file="/WEB-INF/jsp/common/commonStyle.jsp"%>
	<link rel="stylesheet" href="<c:url value='/css/pageCss/signin.css'/>">
	<title> SringBoard</title>
	<script type="text/javascript"> 
		$(document).ready(function(){
// 			var openType = "<c:out value="${openType}"/>";
			var openType = "${openType}";
			if(openType == "F"){
				alert("로그인에 실패하였습니다.\n아이디와 비밀번호를 확인해주세요.");
			}else if(openType == "E"){
				
			}else if(openType == "S"){
				
			}
			
		});
	
		function doLogin() {
			if(frm.j_username.value == "") {
				alert("아이디를 입력해주세요.");
				return;
			}
			if(frm.j_password.value == "") {
				alert("패스워드를 입력해주세요.");
				return;
			}
			frm.submit();
		}
		
		function doRegister(){
			location.replace("<c:url value='/guest/userInfo/userRegistView.do'/>");
		}
	</script>
</head>
<body>
	<div class="container">
		<form class="form-signin" name="frm" action="j_spring_security_check.do" method="post">
			<h2 class="form-signin-heading">
				<c:if test="${openType eq 'E'}">Thank you</c:if>
				<c:if test="${openType ne 'E'}">Please sign in</c:if>
			</h2>
			<label for="inputEmail" class="sr-only">Email address</label>
			<input type="email" id="inputEmail" name="id" class="form-control" placeholder="Email address" required autofocus>
			<label for="inputPassword" class="sr-only">Password</label>
			<input type="password" id="inputPassword" name="pw" class="form-control" placeholder="Password" required>
			<div class="checkbox">
				<label class="width-full">
<!-- 					<input type="checkbox" name="_spring_security_remember_me"> Remember me -->
					<input type="button" value="Register" class="btn btn-xs btn-default pull-right" onClick="doRegister()">
				</label>
			</div>
			<button class="btn btn-lg btn-primary btn-block" type="submit" onclick="doLogin()">Sign in</button>
		</form>
	</div>
</body>
</html>
