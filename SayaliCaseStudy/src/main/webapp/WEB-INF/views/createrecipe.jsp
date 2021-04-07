<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Recipe Page</title>
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
			height: 800px;
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

		
	</style>
</head>
<body>
	<h1 style= "font-family:verdana; color: white; text-shadow: 2px 2px #8a73ff"> Dollar Store Spoon University
      <div class="dropdown">

         <button class="dropbtn" style="font-family: verdana">Menu</button>
          <div class="dropdown-content">
            <a href="file:///Users/Lee/SBA%20HTMLJS/LOGINPAGE.html">Login</a>
             <a href="file:///Users/Lee/SBA%20HTMLJS/MAINPAGE.html">Main Page</a>
            <a href="file:///Users/Lee/SBA%20HTMLJS/Recipes.html">Recipes</a>
            <a href="file:///Users/Lee/SBA%20HTMLJS/Cookbook.HTML">Cookbook</a>
        </div>
    </div>
</h1>

	 <section class="input_box">
		<h2 style="font-family:verdana; color: #ff7f73;text-shadow: 2px 2px white;">Write your recipe here</h2>
		
		
		
			<div>
				<input id="rname" type="rname" name="rname" placeholder="Enter the name of the recipe" required >
			</div>
			<div>
				<input id="password" type="password" name="password" placeholder="Enter your password" required >
			</div>
			<div>
				
		</div><br>
		<button style="width: 120px; height: 50px; font-family:verdana; font-size: 18px; color:#8a73ff ; box-shadow: 5px 5px 5px #ff7f73">Submit</button>
		
		

	</section>
		
	

</body>
</html>