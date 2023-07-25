<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="springFinalm5.model.*" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<%@ include file="menu.jsp" %>
		<header>
			<h3>listar asistentes</h3>
		</header>
		<table class="table">
				<tr class="table-dark">
					<td>capacitacion id</td>
					<td>usuario id</td>
				
				</tr>
				<tbody>
				<% ArrayList<Asistentes> aSis = (ArrayList<Asistentes>)request.getAttribute("aSis"); 
				for(Asistentes a : aSis){%>
					<tr>
						<td><%=a.getCapacitacionID() %></td>
						<td><%=a.getusuarioID() %></td>
						
					</tr>
				<%} %>
				
				</tbody>
			</table>
	</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>