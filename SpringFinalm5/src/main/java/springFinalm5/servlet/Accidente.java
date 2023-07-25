package springFinalm5.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springFinalm5.model.AccidenteDAOImpl;
import springFinalm5.model.Accidentes;

/**
 * Servlet implementation class Accidente
 */
@WebServlet("/Accidente")
public class Accidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accidente() {
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
		String clientId=(request.getParameter("cliente_id"));
		
		int idUser = Integer.parseInt(clientId);
		
		String fechaString = (request.getParameter("fecha_accidente")); // Supongamos que tienes la fecha en formato de cadena
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date fechaUtil = null;
		try {
			fechaUtil = dateFormat.parse(fechaString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
		String detalle=(request.getParameter("detalle"));
		AccidenteDAOImpl accDao= new AccidenteDAOImpl();
		Accidentes nuevoAccidentes = new Accidentes(1,idUser,fechaSQL,detalle);
		
		accDao.create(nuevoAccidentes);
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
					// TODO Auto-generated catch blocks
					e.printStackTrace();
				}
            }
        }, delayInSeconds * 1000);
		//doGet(request, response);
	}

}
