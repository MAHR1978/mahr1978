package springFinalm5.servlet;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springFinalm5.model.Usuario;
import springFinalm5.model.UsuarioDAOImpl;

/**
 * Servlet implementation class Usuarios
 */
@WebServlet("/Usuarios")
public class Usuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Usuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre=(request.getParameter("Nombre"));
		String tipo = (request.getParameter("tipo"));
		
		UsuarioDAOImpl usuDAO = new UsuarioDAOImpl();
		Usuario nuevoUsuario= new Usuario(1,nombre,tipo);
		usuDAO.create(nuevoUsuario);
		response.sendRedirect("Succes");
		Timer timer = new Timer();
        int delayInSeconds = 5; // tiempo de retraso en segundos

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Coloca aquí la tarea que deseas ejecutar después del retraso de tiempo
            	
            	///System.out.println("La tarea se ha ejecutado después de " + delayInSeconds + " segundos.");
            	try {
					response.sendRedirect("/Inicio.jsp");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        }, delayInSeconds * 1000);
		//doGet(request, response);
	}

}
