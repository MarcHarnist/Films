package servlet.film;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.jpa.bean.Film;
import fr.eni.jpa.dao.DAOUtil;
import fr.eni.jpa.dao.GenericDaoImpl;

/**
 * Servlet implementation class AjouterFilm
 */
@WebServlet("/AjouterServlet")
public class AjouterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		/** Pour tester la servlet (commenter RequestDispatcher et rd.forward
		 * 
		response.setContentType("text/html") ;
		PrintWriter out = response.getWriter() ;
		out.println("Bonjour tout le monde !") ;
		**/
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/ajouterFilm.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
		String titre = request.getParameter("titre");
		String annee = request.getParameter("annee");
		String style = request.getParameter("style");
		String realisateur = request.getParameter("realisateur");
		String heure = request.getParameter("heure");
		String minutes = request.getParameter("minutes");
		String vu = request.getParameter("vu");
		String acteur1 = request.getParameter("acteur1");
		String synopsis = request.getParameter("synopsis");
		
		Film film = new Film(titre, annee, style, realisateur, heure, minutes, vu, acteur1, synopsis);
		System.out.print("Objet film: " ); System.out.println(film);
		
		try {
			GenericDaoImpl.add(film);
			System.out.println("OK");
		} catch (Exception e) {
			e.printStackTrace();
		}
		DAOUtil.close();
	}

}
