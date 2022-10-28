<%@ page language="java" 
	pageEncoding="UTF-8"%>
<header
	class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
	
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">

<script type="text/javascript">
	function login() {
		var form = document.loginbtn;
		form.action = "login.jsp";
		form.submit();
	}

	function logout() {
		var form = document.loginokay;
		form.action = "main.jsp?id=null";
		sessionStorage.clear();
		form.submit();
		
	}
</script>


<img src="sport-shoe.png" style="width: 80px">
	<ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-10">
		<li><a href="#" class="nav-link px-2 link-secondary">HOME</a></li>
		<li><a href="#" class="nav-link px-2 link-secondary">USERS</a></li>
		<li><a href="#" class="nav-link px-2 link-secondary">PRODUCTS</a></li>
		<li><a href="#" class="nav-link px-2 link-secondary">SALES</a></li>
		<li><a href="#" class="nav-link px-2 link-secondary">ORDER</a></li>
		<li><a href="#" class="nav-link px-2 link-secondary">HISTORY</a></li>
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
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
	
</header>