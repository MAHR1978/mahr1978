package springFinalm5.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import springFinalm5.model.Asesoria;
import springFinalm5.model.AsesoriasDAOImpl;
import springFinalm5.model.Asistentes;
import springFinalm5.model.AsistentesDAOImpl;

/**
 * Servlet implementation class ListarAsistente
 */
@WebServlet("/ListarAsistente")
public class ListarAsistente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarAsistente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		AsistentesDAOImpl asisDAO = new AsistentesDAOImpl();
		List<Asistentes> aSis = asisDAO.readAll();
		request.setAttribute("aSis", aSis);
		getServletContext().getRequestDispatcher("/ShowAsistentes.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
