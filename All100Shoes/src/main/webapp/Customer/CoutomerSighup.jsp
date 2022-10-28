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



<body >



    
<div class="divPosition">


	<h2 align="center">회원가입 게시판</h2> 
<div id="wrap" >
	

<form action="joinPro.jsp" method="post" name ="fr" >
		<table border="0" align="center" >
		
			<tr>
				<td>ID</td>
				<td><input type="text" name="id" class="id" size ="30"></td>
				<td><input type="button" value="중복확인" class="dup" onclick="winopen()"></td>
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
			<td><button type="submit" value="입력" class="btn btn-dark">회원가입</button></td>
			<td><button type="button" class="btn btn-dark" onclick="loginhome()">돌아가기</button></td>
				</tr>
		
		</table>
	</form>

<script type="text/javascript">

<!-- 아이디중복체크 -->
function winopen(){
	
	if(document.fr.id.value =="" || document.fr.id.value.length < 0){
		alert("아이디를 먼저 입력해주세요")
		document.fr.id.focus();
	}else{
		window.open("joinIdCheck.jsp?id="+document.fr.id.value,"","width=500, height=300");
	}
}
function loginhome(){
	var form=document.fr;
	form.action="http://localhost:8080/All100Shoes/Customer/login.jsp";
	form.submit();
}
	
}

</script>
 
  </div>
</div>


<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<!-- 유효성체크 : 데이터 빈공백체크(id와 성별) -->

</body>
</html>