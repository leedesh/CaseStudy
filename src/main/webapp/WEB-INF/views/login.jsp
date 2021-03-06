<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
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
			width: 450px;
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
			height: 450px;
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
		.loginbtn{
		width: 120px; height: 50px; font-family:verdana; font-size: 18px; color:white ; box-shadow: 5px 5px 5px #ff7f73;
		
		
		}

		
	</style>
</head>
<body>
	<h1 style= "text-align: center;font-family:verdana; color: white; text-shadow: 2px 2px #8a73ff"> Dollar Store Spoon University
    </h1>

	 <section class="input_box">
		<h2 style="font-family:verdana; color: #ff7f73;text-shadow: 2px 2px white;">Returning User?</h2>
		<h3 style="font-family:verdana; color: #ff7f73; text-shadow: 2px 2px white;">Sign in Below</h3>
		
			<form:form action="./login" method="post">
			<div>
				<input id="email" type="email" name="email" placeholder="Enter your email" required >
			</div>
			<div>
				<input id="password" type="password" name="password" placeholder="Enter your password" required >
			</div>
			<div>
				
		</div><br>
		
		<input  class="loginbtn" type="submit" value="Login" id ="login">
		
		<h4 style="font-family:verdana; color: #ff7f73;text-shadow: 2px 2px white;">${loginFailedMessage}</h4>
		
		</form:form>
		<form action="./register">
	<input class="loginbtn"type="submit" value="New User" />
</form>
		
	
		
	</section>
		
	

</body>
</html>