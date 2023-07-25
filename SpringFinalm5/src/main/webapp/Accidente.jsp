<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
		<%@ include file="menu.jsp" %><a href="ListarAccidente">Listar accidente</a>
		<form action="Accidente" method="post">
			<table class="table">
				<tr>
					<td>id_cliente</td>
					<td><input type="text" name="cliente_id" class="form-control" /></td>
				</tr>
				<tr>
					<td>Fecha Accidente</td>
					<td><input type="date" name="fecha_accidente" class="form-control" /></td>
				</tr>
				<tr>
					<td>Detalle</td>
					<td><input type="text" name="detalle" class="form-control" /></td>
				</tr>			
			</table>
			<input type="submit" class="btn btn-primary" value="enviar" />		
		</form>	
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" 
integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
</body>
</html>