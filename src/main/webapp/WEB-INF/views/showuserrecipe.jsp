<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

.dropdown-content a:hover {
	background-color: #ff7f73;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #8a73ff;
}

body {
	background-color: #ff7f73;
}

.container {
	background-color: #ffc573;
}

.boxxx {
	background-color: #ffc573;
	position: static;
	width: 600px;
	height: 1100px;
	margin: auto;
	margin-top: 100px;
	margin-bottom: 100px;
	text-align: center;
	box-shadow: 15px 15px 15px #8a73ff;
	padding: 25px;
}

h1 {
	text-align: center;
	color: white;
}

h2 {
	text-align: center;
	color: white;
}

p {
	text-align: center;
	color: white;
	overflow-wrap: break-word;
}



h3 {
	text-align: center;
	color: white;
}

h4, h5, h6 {
	font-family: verdana;
	text-align: center;
	color: white;
}


</style>
<title>User Recipes</title>
</head>
<body>
<%@include file="navbar.html"%>


	
	<div>
		<c:forEach items="${userrecipes}" var="userrecipe">
			<section class="boxxx">
				<ul id="recipeList" class="thumbnails">

					<h2>${userrecipe.getUserRName()}</h2>
					
					<h3>
						<img src="${userrecipe.getUserPhoto()}" var="photo" width="400px"
							height="600px" style="box-shadow: 5px 5px 5px #ff7f73" />
					</h3>
					<h4>Ingredients</h4>
					<p>${userrecipe.getUserIngredients()}</p>

					<h5>Steps</h5>
					<p>${userrecipe.getUserSteps()}</p>
					
					
					<%@include file="delupbuttons.html"%>
					
					
					

				</ul>
			</section>
		</c:forEach>
	</div>
</body>


</html>