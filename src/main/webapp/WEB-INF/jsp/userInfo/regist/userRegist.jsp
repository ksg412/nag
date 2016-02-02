<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<%@ include file="/WEB-INF/jsp/common/commonStyle.jsp"%>
		<link rel="stylesheet" href="<c:url value='/css/pageCss/signin.css'/>">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>회원가입</title>
		<script type="text/javascript">
			function doRegister(){
                var frm = $("#frm").serialize();
                $.ajax({
                  method: "POST",
                  url: getContextname()+"/guest/registration/registrationSave.do",
                  data: frm
                });
			}

			function doCancel(){
				location.replace("<c:url value='/'/>");
			}
		</script>
	</head>
<body>
	<div class="contentwrap">
		<article class="container bgc-white" >
			<div class="page-header">
				<h1>회원가입 <small>일반회원가입</small></h1>
			</div>
			<c:url var="post_url"  value="/guest/userInfo/insertUserRegistInfo.do" />
			<form:form commandName="userInfoVo" cssClass="form-horizontal" id="frm" ACTION="${post_url}" METHOD="POST" >
				<div class="form-group">
					<label for="email" class="col-sm-2 control-label">이메일</label>
					<div class="col-sm-6">
						<form:input type="email" path="email" cssClass="form-control" id="email" placeholder="이메일"/>
						<form:errors path="email"  id="email" cssClass="errorMsg"/>
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="col-sm-2 control-label">비밀번호</label>
					<div class="col-sm-6">
						<form:input type="password" path="password" cssClass="form-control" id="password" placeholder="비밀번호"/>
						<form:errors path="password"  id="password" cssClass="errorMsg"/>
						<p class="help-block">숫자, 특수문자 포함 8자 이상</p>
					</div>
				</div>
				<div class="form-group">
					<label for="passwordCheck" class="col-sm-2 control-label">비밀번호 확인</label>
					<div class="col-sm-6">
						<form:input type="password" path="passwordCheck" cssClass="form-control" id="passwordCheck" placeholder="비밀번호 확인"/>
						<form:errors path="passwordCheck"  id="passwordCheck" cssClass="errorMsg"/>
						<p class="help-block">비밀번호를 한번 더 입력해주세요.</p>
					</div>
				</div>
				<!--
				<div class="form-group">
					<label for="inputRipple" class="col-sm-2 control-label">리플주소</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="inputRipple" placeholder="리플주소">
					</div>
				</div>
				-->
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label">이름</label>
					<div class="col-sm-6">
						<form:input type="text" path="name" cssClass="form-control" id="name" placeholder="이름"/>
						<form:errors path="name"  id="name" cssClass="errorMsg"/>
					</div>
				</div>
				<div class="form-group">
					<label for="phoneNumber" class="col-sm-2 control-label">휴대폰번호</label>
					<div class="col-sm-4">
						<form:input type="text" path="phoneNumber" cssClass="form-control" id="phoneNumber" placeholder="휴대폰번호"/>
						<form:errors path="phoneNumber"  id="phoneNumber" cssClass="errorMsg"/>
						<p class="help-block">- 없이 적어주세요.</p>
					</div>
                    <!--
					<div class="col-sm-2">
						<a class="btn btn-default" href="#" role="button">인증번호 전송</a>
					</div>
					-->
				</div>
                <!--
				<div class="form-group">
					<label for="inputNumberCheck" class="col-sm-2 control-label">인증번호 확인</label>
					<div class="col-sm-6">
						<input type="text" class="form-control" id="inputNumberCheck" placeholder="이름">
						<class="help-block">전송된 인증번호를 입력해주세요.</p>p
					</div>
				</div
				-->
				<div class="form-group">
					<label for="name" class="col-sm-2 control-label"></label>
					<div class="col-sm-6">
						<button type="submit" class="btn btn-primary">회원가입</button>
						<button type="button" class="btn btn-primary" onClick="doCancel();">취소</button>
					</div>
				</div>
			</form:form>
		</article>
	</div>
</body>
</html>