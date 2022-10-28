<%@ page language="java" contentType="text/html; UTF-8"
	pageEncoding="UTF-8"%>

<header
	class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	<img src="" style="width: 35%">
	<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-10">
		<li><a href="#" class="nav-link px-2 link-secondary">Home</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">브랜드</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">카테고리</a></li>
		<li><a href="#" class="nav-link px-2 link-dark">상품검색</a></li>
	</ul>

	<div class="col-md-4 text-end">
		<c:if test="${id==null }">
			<form name="loginbtn" method="post">
				<input type="button" class="btn btn-outline-dark me-2"
					onclick="login()" value="Log in"> <input type="button"
					class="btn btn-dark me-2" onclick="signup()" value="Sign Up">
			</form>
		</c:if>
		<c:if test="${id!=null }">
			<form name="loginokay" method="post">
				${id }님, 안녕하세요! <input type="button" class="btn btn-dark"
					onclick="mypage()" value="마이페이지"> <input type="button"
					class="btn btn-outline-dark me-2" onclick="logout()" value="로그아웃">
			</form>
		</c:if>
	</div>
</header>