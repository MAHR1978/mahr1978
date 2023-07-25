<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<body>
<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary">
  			<div class="container-fluid">
    			<a class="navbar-brand" href="#">Mutual</a>
    			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      				<span class="navbar-toggler-icon"></span>
    			</button>
    		<div class="collapse navbar-collapse" id="navbarSupportedContent">
      			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
        			<li class="nav-item">
          				<a class="nav-link active" aria-current="page" href="Inicio.jsp">Home</a>
        			</li>
        			
        			<li class="nav-item dropdown">
          				<a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            				Seleccion
          				</a>
          				<ul class="dropdown-menu">
            				<li><a class="dropdown-item" href="usuarios.jsp">usuario</a></li>
				            <li><a class="dropdown-item " href="Capacitacion.jsp">Capacitacion</a></li>
				            <li><hr class="dropdown-divider"></li>
				            <li><a class="dropdown-item" href="Asesorias.jsp">asesorias</a></li>
				            <li><a class="dropdown-item" href="Accidente.jsp">Accidente</a></li>
				            <li><a class="dropdown-item" href="asistentes.jsp">Asistentes</a></li>
				             <li><a class="dropdown-item" href="chequeos.jsp" disabled>Chequeos</a></li>
          				</ul>
        			</li>
        			
      			</ul>
      			<%
      				String usuario = (String) session.getAttribute("user");
    			%>
      			<div class="col-sm-4"><h5>Bienvenido :<%=usuario %></h5></div><span><a href="Login.jsp">cerrar sesion</a></span>    
    		</div>
    		</div>
  		
		</nav>
	</header>