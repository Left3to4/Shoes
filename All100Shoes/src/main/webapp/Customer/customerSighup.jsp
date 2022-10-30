<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel= "stylesheet" href="signup.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.4.1/dist/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>

<%@include file="header.jsp"%>
<body >

<div class="divPosition">


	<h2 align="center">회원가입 게시판</h2> 
<div id="wrap" >
<script type="text/javascript">

function fn_joinMenber(){
	var joinForm = document.joinForm;
	var name 	= document.name.value;
	var id		= document.id.value;
	var pwd	 	= document.pwd.value;
	var rePwd	 = document.rePwd.value;
	var email	 = document.email.value;
	
	if(name.length==0 || name==""){
		alert("이름은 입력해주세요");
		joinForm.name.focus();
	}else if(id.length==0 || id==""){
		alert("아이디를 입력해주세요.")
		joinForm.id.focus();
	}else if(joinForm.idDuplication.value!="idCheck"){
		alert("아이디 중복체크를 해주세요");
	}else if(pwd.length==0 || pwd==""){
		alert("비밀번호를 입력해주세요");
		joinForm.pwd.focus();
	}else if(rePwd.length==0 || rePwd ==""){
		alert("비밀번호를 다시 입력해주세요")
		joinForm.rePwd.focus();
	}else if(rePwd!=pwd){
		alert("입력하신 비밀번호가 틀립니다.");
		joinForm.rePwd.focus();
	}else {
		joinForm.method="post";
		joinForm.action="${contextPath}/member/joinMember.do"
	}
	
	form.submit();
}

	function CheckId(){
		var joinForm = document.joinForm;
		joinForm.action="idcheck.do";
		joinForm.submit();
		}
	
	function snedCheckVAlue(){
		var openJoinfrm = document.joinFrom;
		
		if(document.chResult.value =="N"){
			alert("다른 아이디를 입력해주세요.");
			openJoinfrm.id.focus();
		}else{
			openJoinfrm.idDuplication.value="idCheck";
			openJoinfrm.idcheck.disabled=true;
			openJoinfrm.idcheck.style.opacity=0.6;
			openJoinfrm.idcheck.style.cursor="default";
			joinForm.action="Sighup.do";
			joinForm.submit();
		}
	}

	}
}
}
</script>
	

<form action="Sighup.do" method="post" name ="joinForm" >
		<table border="0" align="center" >
		
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" size ="30" value="${CHECKID }" >
				<button type="submit" name="idcheck" class="btn btn-dark" class="checkId" onclick="CheckId()" >중복 확인</button></td>
				<c:if test="${CHECK==true }">사용할 수 없는 ID입니다.
				</c:if>
				<c:if test="${CHECK==false }">사용 가능한 ID입니다.
				</c:if>
				<td><input type="hidden" name="idDuplication" value="idUncheck"/></td>
			</tr>
			<tr>
				<td>pw</td>
				<td><input type="password" name="pw" size="30" placeholder="영문숫자조합 4글자 이상" required="required" > </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="password" name="pw2" size="30" required="required" > </td>
			</tr>
			<tr>
				<td>name</td>
				<td><input type="text" name="name" size="30" required="required" > </td>

			</tr>
			<tr>
				<td>address</td>
				<td><input type="text" name="address" size="30" required="required" > </td>

			</tr>
			<tr>
				<td>phone</td>
				<td><input type="text" name="phone" size="30" required="required" placeholder="예시 : 010-5552-1774 (13자리)" maxlength="13"> </td>

			</tr>
			<tr>
			<td><input class="btn btn-dark" type="submit" onclick="snedCheckVAluein()" value="회원가입"></td>
			<td><button type="submit" class="btn btn-dark" onclick="login.jsp">돌아가기</button></td>
				</tr>
		
		</table>
	</form>


}

  </div>
</div>


<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- 유효성체크 : 데이터 빈공백체크(id와 성별) -->

</body>
</html>