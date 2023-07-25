package grupal6m5.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Claudia Lima,Dario perez, Marco Hernandez
 */

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		
		
		if(nombre.equals("marco"))
		{
			
			if(clave.equals("1234")) {
				
				HttpSession session = request.getSession();
				session.setAttribute("user", nombre);
								
				RequestDispatcher dispatcher = request.getRequestDispatcher("Inicio.jsp");
				dispatcher.forward(request, response);
			}			
		}
		//HttpSession session = request.getSession();
		//session.invalidate();
		  // response.sendRedirect("Login.jsp");
		//RequestDispatcher dispatcher = request.getRequestDispatcher("/views/Login.jsp");
		//dispatcher.forward(request, response);
		
		
	}

}
