<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
</head>
<body>
<style type="text/css">
		.dropbtn {
  background-color: #8a73ff;
  color: white;
  padding: 16px;
  font-size: 16px;
  border: none;
  box-shadow: 2px 2px white;
}


.dropdown {
  position: relative;
  display: inline-block;
}


.dropdown-content {
  display: none;
  position: absolute;
  background-color: #ffc573;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px white;
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 10px 14px;
  text-decoration: none;
  font-size: 16px;
  display: block;
}

.dropdown-content a:hover {background-color: #ff7f73;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: #8a73ff;}
		
		body {
			background-color: #ff7f73;
			
		}
		.container {
			background-color: #ffc573;
		}
		input {
			width: 200px;
			height: 30px;
			margin-bottom: 20px;
			background-color: #8a73ff;
			border-style: none;
			color: white;
			padding: 10px;
		}
		::placeholder {
  			color: white;
  		}
  		#project::placeholder {
			font-size: 18px;
		}
		
		.input_box {
			background-color: #ffc573;
			position: relative; 
			width: 600px;
			height: 400px;
			margin:auto;
			text-align: center;
			box-shadow: 15px 15px 15px #8a73ff;
			padding: 10px;
		}
		h3 {text-align: center;
   	 		color:white;				   ;
		}
		h4{text-align: center;
	    	color:white;				   ;
		}
 		p {text-align: center;
    		color:white;				   ;
		}
		
		.registerbtn{
		width: 120px; height: 50px; font-family:verdana; font-size: 18px; color:white ; box-shadow: 5px 5px 5px #ff7f73;
		}
		
		
	</style>
</head>
<body>
	

	 <section class="input_box">
		<h2 style="font-family:verdana; color: #ff7f73;text-shadow: 2px 2px white;">New User?</h2>
		<h3 style="font-family:verdana; color: #ff7f73; text-shadow: 2px 2px white;">Create Account Below</h3>
		
		<form:form action="./register" method="POST" modelAttribute="user">
			<div>
				<input  id="email" type="email" name="email" placeholder="Enter your email" required />
			</div>
			<div>
				<input  id="password" type="password" name="password" placeholder="Enter your password" required />
			</div>
			<div>
				<input class="registerbtn" type="submit" value="Register">
		</div><br>
		
	
		</form:form>
		<button style="width: 120px; height: 50px; font-family:verdana; font-size: 18px; color:#8a73ff ; box-shadow: 5px 5px 5px #ff7f73"><a href="./login">Returning User?</a></button></button>
	
	</section>
		
	

</body>
</html>