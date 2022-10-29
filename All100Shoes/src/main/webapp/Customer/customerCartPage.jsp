<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
rel="stylesheet" 
integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" 
crossorigin="anonymous">

</head>
<body>

	<%@include file="header.jsp"%>
	<br>
	<h1 style = "left: 40px">장바구니</h1>
	<br>
	
	<div class="container text-center">
		<table class="table">
		
			<thead>
			    <tr>
			      <th scope="col">상품명</th>
			      <th scope="col">가격</th>
			      <th scope="col">카테고리</th>
			      <th scope="col">사이즈</th>
			      <th scope="col">수량</th>
			      <th scope="col">삭제</th>
			    </tr>
			</thead>
		
		    <c:forEach items = "${list}" var = "dto">
		    
    			<tbody>
				    <tr>
						<td><input type = "hidden" value = "${dto.productmodel}">${dto.productmodel}</td>
						<td><input type = "hidden" value = "${dto.productprice}">${dto.productprice}원</td>
						<td><input type = "hidden" value = "${dto.productcategory}">${dto.productcategory}</td>
						<td><input type = "hidden" value = "${dto.productsize}">${dto.productsize}</td>
				    	<td><input type = "hidden" value = "${dto.orderquantity}">${dto.orderquantity}</td>
						<td><a href = "cartListDelete.do?orderid=${dto.orderid }">삭제</a></td>
				    </tr>
	 			</tbody>
	 			
				
		    </c:forEach>
		</table>
		<br>
	</div>
	
	
	
	 	
		 
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" 
crossorigin="anonymous">
</script>

</body>
</html>