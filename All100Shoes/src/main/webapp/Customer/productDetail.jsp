<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	    		<td>${list.productmodel}</td>
	    	</tr>
	    
	    	<tr style = " position: relative;  left: 1000px; bottom: 200px">
	    		<td>${list.productprice }</td>
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
	    			내용ㅏㄹ디ㅏ저라ㅣ어랴너랴널야너ㅐ링나ㅓ라인렁나ㅣ어낭너;밀언마ㅣㄹㅇ너ㅣㄹ아널;
	    			니ㅏㅓㄹㅇ니ㅏ러나ㅣㄹ어니ㅏㄹ언ㅇ나ㅣ리ㅏㅇ널이나ㅓㄹ니ㅏㅓㄴ러ㅣ널이나ㅓㄹㅇ니
	    			렁니렁ㄴ;ㅏㅣ렁ㄴ;미ㅏ렁니ㅏ렁니ㅏㄹ어나ㅣ렁니ㅏ렁니ㅏㅓ리아널ㅇㄴㄴ아ㅣ렁니ㅏ렁니ㅏ러
	    			ㅣㅏㄴ어리ㅏ너라ㅣㅇ너라ㅣ널이널언런렁니ㅓ라ㅣ널이ㅏ너라너ㅣ;ㄹ너리ㅏ머리;ㅁㅇ널;ㅣㅇ널
	    			;ㅣㄴ어리안ㅁ러ㅣㅇ나ㅓㄹ이ㅏㄴ러댜ㅐㅈㅇ너리ㅏㄹ니;어랴ㅐㄷ정너라ㅣㄷ너리ㅏㄷㄴ어ㅣ런ㅇ
	    			런ㅇ;렁ㄴ렁ㄴ;렁니ㅏ러이나ㅓㄹ이ㅑ;널;ㅑㅐㄴ어래야너랭널ㅇ니ㅏㄹㅇ니렁니ㅏ렁ㄴ미ㅑ;런야ㅣ러	
    			</td>
	    	</tr>
	    
	   		 <tr style = " position: relative;  left: 700px; bottom: 320px;">
				<td>
					 <select style="width:500px;height:32px;">
						<option>Korea</option>
						<option>USA</option>
						<option>Japan</option>
						<option>China</option>
					</select>
				</td>
			</tr>
	    
	   		 <tr style = " position: relative;  left: 700px; bottom: 320px;">
				<td>
					 <select style="width:500px;height:32px;">
						<option>Korea</option>
						<option>USA</option>
						<option>Japan</option>
						<option>China</option>
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