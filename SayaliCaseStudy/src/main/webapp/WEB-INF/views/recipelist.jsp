<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String id = request.getParameter("userId");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "casestudydbb";
String userId = "root";
String password = "password";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>






<table>
<tr>
		<td>Recipes<td>
</tr>
<th><img src="${recipe.getPhoto()}" var="photo" width="400px" height="600px"/></th>
<c:forEach items="${recipes}" var="recipe">

<th>${recipe.getrName()}</th>
<tr>${recipe.getIngredients()}</tr>
<tr>${recipe.getSteps()}</tr>


</c:forEach>

</table>




</table>



<div id="container">
<ul id="recipeList" class ="thumbnails">
<c:forEach items ="${recipes}" var="recipe">

<img src="${recipe.getPhoto()}" var="photo" width="400px" height="600px"/>

<h1 class="rName">${recipe.getrName()}</h1>
<h2 class ="ingredients">${recipe.getIngredients()}</h2>
<h3 class="steps">${recipe.getSteps()}</h3>
<p1 class="mealtime">${recipe.getMealTime()}</p1>
<p2 class="mealtype">${recipe.getMealType()}</p2>
<p3 class="cuisine">${recipe.getCuisine()}</p3>





</c:forEach>
</ul>




</div>