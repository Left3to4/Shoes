<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
function selectFx() {
	var opt = document.getElementById("textOption");
	location.href = 'Customer/productDetailStock.do';
}

</script>

</head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<body>

	<%@include file="header.jsp"%>

	<main>
	
	  <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
	    <div class="card" style="width: 18rem; height: 18rem">
		  <img src = "./shoesFolder1/1.png" class="card-img-top" alt="...">
		  <div class="card-body">
	      </div>
	      <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>
	    </div>

	    <div class="card" style="width: 18rem; height: 18rem">
		  <img src="./shoesFolder2/1.png" class="card-img-top" alt="...">
		  <div class="card-body">

	      </div>
	      <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>
	  
	    </div>
	  </div>
	    
	    <table>
	    
	    	<tr style = " position: relative;  left: 1000px; bottom: 300px">
	    		<td></td>
	    	</tr>
	    
	    	<tr style = " position: relative;  left: 1000px; bottom: 200px">
	    		<td></td>
	    	</tr>
	    
	    </table>
	    
	  <div class="d-md-flex flex-md-equal w-100 my-md-3 ps-md-3">
	  <div class="card" style="width: 18rem; height: 18rem">
		  <img src="./shoesFolder3/1.png" class="card-img-top" alt="...">
		  <div class="card-body">
	      
	      </div>
	      <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>
	    </div>
	    
	    <div class="card" style="width: 18rem; height: 18rem">
		  <img src="./shoesFolder4/1.png" class="card-img-top" alt="...">
		  <div class="card-body">

	      </div>
	      <div class="bg-body shadow-sm mx-auto" style="width: 80%; height: 300px; border-radius: 21px 21px 0 0;"></div>
	    </div>
	  </div>
	  
	   
    <table>
    
    	<tr style = " position: relative;  left: 700px; bottom: 400px">
    		<td>
    		
   			</td>
    	</tr>
   		 <tr style = " position: relative;  left: 700px; bottom: 320px;">
			<td>
				 <select style = "width: 500px; height: 32px;" id = "textOption" onchange = "selectFx()">
				    <c:forEach items = "${list}" var = "dto">
						<option value = "${dto.productsize }">${dto.productsize }</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

   		 <tr style = " position: relative;  left: 700px; bottom: 320px;">
			<td>
				 <select style="width:500px;height:32px;">
				    <c:forEach var = "dto" items = "${list }">
						<option value = "${dto.productstock}">${dto.productstock}</option>
				    </c:forEach>
				</select>
			</td>
		</tr>

			<tr style = " position: relative;  left: 700px; bottom: 300px;">
				<td>
					<button>CART</button>
					<button>BUY NOW</button>
				</td>
			</tr>
	    
	    </table>
	  
	</main>
	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>