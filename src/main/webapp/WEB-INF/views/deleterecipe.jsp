<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Recipe</title>
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

input {
	width: 450px;
	height: 30px;
	margin-bottom: 20px;
	background-color: #8a73ff;
	border-style: none;
	font-color: white;
	padding: 10px;
}

::placeholder {
	color: white;
}

#project::placeholder {
	font-size: 18px;
}

.delbox {
	background-color: #ffc573;
	position: relative;
	width: 600px;
	height: 300px;
	margin: auto;
	text-align: center;
	box-shadow: 15px 15px 15px #8a73ff;
	padding: 10px;
}

p {
	text-align: center;
	color: white;
}

.addrecbutt {
	width: 120px;
	height: 50px;
	font-family: verdana;
	font-color: white;
	font-size: 18px;
	color: #8a73ff;
	box-shadow: 5px 5px 5px #ff7f73
}
</style>
	<%@include file="navbar.html"%>


	<section class="delbox">

		<form:form action="./deleterecipe" method="POST"
			modelAttribute="userrecipe">

			<h1 style="font-family:verdana;font-size:20px;color:white;">Delete Recipe</h1>

			<form:input placeholder="Recipe ID" path="userRecipeId" />
			<br>

				
				<h2 style="font-family:verdana;font-size:20px;color:white;">Press Button to Delete</h2>


			<input class="addrecbutt" type="submit" value="delete recipe" />


		</form:form>





	</section>