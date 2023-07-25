<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>exito !!</title>
 <style>
        .success-message {
            background-color: #D4EDDA;
            color: #155724;
            padding: 10px;
            border: 1px solid #C3E6CB;
            border-radius: 4px;
            margin: 10px 0;
        }
    </style>

</head>
<body>

<div class="container">

	<%-- Si el mensaje de éxito está presente, muestra el div --%>
    <% if (request.getAttribute("successMessage") != null) { %>
        <div class="success-message">
            <%= request.getAttribute("successMessage") %>
        </div>
    <% } %>

</div>

</body>
</html>