<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="springFinalm5.model.*" %>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de asesoria</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<%@ include file="menu.jsp" %>
		<form>
			<table class="table">
				<tr class="table-dark">
					<td>id</td>
					<td>nombre</td>
					<td>detalle</td>
					<td>profesional id</td>
				</tr>
				<tbody>
				<% ArrayList<Asesoria> ass = (ArrayList<Asesoria>)request.getAttribute("ass"); 
				for(Asesoria a : ass){%>
					<tr>
						<td><%=a.getId() %></td>
						<td><%=a.getNombre() %></td>
						<td><%=a.getDetalle() %></td>
						<td><%=a.getProfesionalId() %></td>
					</tr>
				<%} %>
				
				</tbody>
			</table>
		</form>
	</div>



<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>