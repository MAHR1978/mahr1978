package springFinalm5.servlet;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springFinalm5.model.Asesoria;
import springFinalm5.model.AsesoriasDAOImpl;

/**
 * Servlet implementation class Asesorias
 */
@WebServlet("/Asesorias")
public class Asesorias extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Asesorias() {
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
		//doGet(request, response);
		String nombre=(request.getParameter("nombre"));
		String detalle=(request.getParameter("detalle"));
		int profesionalId=(Integer.valueOf(request.getParameter("proId")));
		AsesoriasDAOImpl assDAO = new AsesoriasDAOImpl();
		Asesoria nuevaAses= new Asesoria(1,nombre,detalle,profesionalId);
		assDAO.create(nuevaAses);
		
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
		
	}

}
