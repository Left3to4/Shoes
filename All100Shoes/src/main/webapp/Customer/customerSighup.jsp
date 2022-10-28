<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	}else if(pwd.lenggth==0 || pwd==""){
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
function fn_dbCheckId(){
	
	var joinForm =document.joinForm;
	var id = joinForm.id.value;
	if(id.length==0 || id ==""){
		alert("아이디를 입력햏주세요");
		joinForm.id.focus();
	}else{
		window.open("${contextPath}/membet/dbCheckId.do?user_id="+id,"","width=500, height=300");
	}
}else if(action.equals("/dbCheckId.do")){
	String id = request.getParameter("user_id");
	system.out.println("id를 가져옴 : " id);
	int result = memberService.idCheck(id);
	ssesion.setAttribute("result",result);
	nextPage="/jjsp/dbCheckId.jsp";
	
	public int idCheck(String id){
		int result = memberDAO.selectAllId(id);
		return result;
	}
	function sendCheckValue(){
		var openJoinfrm = opener.document.joinForm;
		alert("다른 아이디를 입력해주세요");
		operJoinfrm.id.focus();
		window.close();
		
	}else{
		openJoinfrm.idBuplication.value="idCheck";
		openJoinfrm.dbCheckId.disabled=true;
		openJoinfrm.dbCheckId.style.opacity=0.6;
		openJoinfrm.dbCheckId.style.cursor="default";
		window.close();
		
	}
	function inputIdChk(){
		var joinForm = document.joinForm;
		var dbCheckId = document.joinForm.dbCheckId;
		document.joinForm.idBuplication.value="idUncheck";
		dbCheckId.disabled=false;
		dbCheckId.style.opacity=1;
		dbCheckId.style.cursor="pointer";
		
	}
	function fn_dbCheckId(){
		var joinForm = document.joinForm;
		joinForm.action="http://localhost:8080/All100Shoes/Customer/main.jsp";
		joinForm.submit();
		}

		
	}
}
}
</script>
	

<form action="list.do" method="post" name ="joinForm" >
		<table border="0" align="center" >
		
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" onkeydown="inputIdChk()" size ="30"></td>
				<td><button type="button" name="dbCheckID" class="btn btn-dark" class="checkId" onclick="fn_dbCheckId()'" >중복 확인</button></td>
				<input type="hidden" name="idDuplication" value="idUncheck"/>
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
			<td><input class="btn btn-dark" type="submit" onclick="join()" value="회원가입"></td>
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