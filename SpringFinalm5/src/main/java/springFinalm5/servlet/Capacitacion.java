package springFinalm5.servlet;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springFinalm5.model.CapacitacionDAOImpl;
import springFinalm5.model.Capacitaciones;

/**
 * Servlet implementation class Capacitacion
 */
@WebServlet("/Capacitacion")
public class Capacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Capacitacion() {
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
		String nombre=(request.getParameter("nombre"));
		String detalle=(request.getParameter("detalle"));
		
		CapacitacionDAOImpl capDAO = new CapacitacionDAOImpl();
		Capacitaciones nuevaCap=new Capacitaciones(1,nombre,detalle);
		capDAO.create(nuevaCap);
		response.sendRedirect("Succes");
		Timer timer = new Timer();
        int delayInSeconds = 5; // tiempo de retraso en segundos

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Coloca aquí la tarea que deseas ejecutar después del retraso de tiempo
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
