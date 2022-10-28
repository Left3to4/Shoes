<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function check(){
	var form=document.manageradd;
	form.action="idcheck.do";
	form.submit();
}
</script>
</head>
<body>
<h2>회원가입</h2>
<form name="manageradd" action="manageradd.do" method="post">
ID: <input type="text" name="managerid">
<input type="button" name="idcheck" onclick="check()" value="중복체크">
<c:if test="${CHECK==true }">사용할 수 없는 ID입니다.</c:if>
<c:if test="${CHECK==false }">사용 가능한 ID입니다.</c:if>
<br>
비밀번호: <input type="password" name="managerpw"><br>
이름: <input type="text" name="managername"><br>
전화번호: <input type="text" name="managerphone"><br>
<input type="submit" value="회원가입">
</form>
</body>
</html>