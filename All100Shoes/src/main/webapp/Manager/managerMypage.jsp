<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function updateaction(){
	var form=document.mypage;
	form.action="update.do";
	form.submit();
}
function deleteaction(){
	var form=document.mypage;
	form.action="delete.do";
	form.submit();
}
</script>
</head>
<body>
<form action="#" name="mypage" method="post">
ID: <input type="text" name="managerid" value="${MANAGERID }" readonly="readonly"><br>
비밀번호: <input type="password" name="managerpw"><br>
비밀번호 확인: <input type="password" name="managerpwcheck"><br>
이름: <input type="text" name="managername" value="${MANAGERNAME }"><br>
<input type="button" name="update" value="수정하기" onclick="updateaction()"><br>
<input type="button" name="delete" value="수정하기" onclick="deleteaction()"><br>
</form>
</body>
</html>