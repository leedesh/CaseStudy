<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
    <!DOCTYPE html>
<html>
<head>
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
		
  	
		
		
		.box {

			background-color: #ffc573;
			position: static;
			width: 600px;
			height: 1000px;
			margin:auto;
			text-align: center;
			box-shadow: 15px 15px 15px #8a73ff;
			padding: 25px;
		}
		h1{text-align: center;
   	 		color:white;				   
		}
		h2{text-align: center;
	    	color:white;				   
		}
 		p{text-align: center;
    		color:white;overflow-wrap: break-word;		   
		}				   
		
					   
		h3{text-align: center;
    		color:white;				   
		}
		
		h4{text-align: center;
    		color:white;				   
		}


		}
	</style>
	<title>Recipe</title>
</head>
<body>

 <h1 style= "font-family:verdana; color: white; text-shadow: 2px 2px #8a73ff"> Dollar Store Spoon University
      <div class="dropdown">

         <button class="dropbtn" style="font-family: verdana">Menu</button>
          <div class="dropdown-content">
             <a href="file:///Users/Lee/SBA%20HTMLJS/MAINPAGE.html">Main Page</a>
            <a href="file:///Users/Lee/SBA%20HTMLJS/LOGINPAGE.html">Login</a>
            <a href="file:///Users/Lee/SBA%20HTMLJS/Recipes.html">Recipes</a>
            <a href="file:///Users/Lee/SBA%20HTMLJS/Cookbook.HTML">Cookbook</a>
          
 </div>

</h1>
<div>
<c:forEach items="${recipes}" var="recipe">
<section class="box">
<ul id="recipeList" class ="thumbnails">

	<h2>${recipe.getrName()}</h2>
	<h3><img src="${recipe.getPhoto()}" var="photo" width="400px" height="600px" style="box-shadow: 5px 5px 5px #ff7f73"/></h3>
	<h4>Ingredients</h4>
	<p> ${recipe.getIngredients()}</p>

	<h5> Steps</h5>
	<p>${recipe.getSteps()}</p>
<button style="width: 60px; height: 25px; font-family:verdana; font-size: 12px; color:#8a73ff ; box-shadow: 5px 5px 5px #ff7f73">Like</button>
<button style="width: 75px; height: 25px; font-family:verdana; font-size: 12px; color:#8a73ff ; box-shadow: 5px 5px 5px #ff7f73">Comment</button>
</ul>
</section>
</c:forEach>
</div>
</body>


</html>