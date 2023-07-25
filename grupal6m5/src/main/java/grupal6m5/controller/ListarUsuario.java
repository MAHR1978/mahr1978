package grupal6m5.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import grupal6m5.implementacion.CapacitacionDAOImpl;
import grupal6m5.implementacion.UsuarioDAOImpl;
import grupal6m5.interfaces.ICapacitacionDAO;
import grupal6m5.model.Capacitaciones;
import grupal6m5.model.ConnectDB;
import grupal6m5.model.Usuario;

/**
 * Servlet implementation class ListarUsuario
 */
@WebServlet("/ListarUsuario")
public class ListarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		UsuarioDAOImpl uDao = new UsuarioDAOImpl();
		List<Usuario> usu = uDao.readAll();
		request.setAttribute("usu",usu);
		
		getServletContext().getRequestDispatcher("/ShowUsuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
