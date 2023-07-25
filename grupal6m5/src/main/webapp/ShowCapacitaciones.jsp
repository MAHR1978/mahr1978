<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="grupal6m5.model.*" %>
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
				<h3>Lista de capacitaciones</h3>
			</header>
			<form action="" method="post">
				<table class="table">
					<tr class="table-dark">
						<td>id</td>
						<td>nombre</td>
						<td>detalle</td>
					</tr>
					<tbody>
					<%  ArrayList<Capacitaciones> cap=(ArrayList<Capacitaciones>)request.getAttribute("cap");   
					for(Capacitaciones c :cap ){ %>
						<tr>
							<td><%=c.getId() %></td>
							<td><%=c.getNombre() %></td>
							<td><%=c.getDetalle() %></td>
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