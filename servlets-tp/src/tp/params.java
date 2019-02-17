package tp;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class params
 */
@WebServlet("/params")
public class params extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public params() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		String nom, prenom, email;
		nom = request.getParameter("nom") != null ? request.getParameter("nom") : "inconnu";
		prenom = request.getParameter("prenom") != null ? request.getParameter("prenom") : "inconnu";
		email = request.getParameter("email") != null ? request.getParameter("email") : "inconnue";
		
		response.getWriter().append("Bonjour <br/>");
		response.getWriter().append("Ton nom est " + nom + "<br/>");
		response.getWriter().append("Ton prénom est " + prenom + "<br/>");
		response.getWriter().append("et enfin ton email est " + email);
		
		Map<String, String[]> mesElements = request.getParameterMap();
		for(Entry<String, String[]> entry: mesElements.entrySet()) {
			response.getWriter().append("<br/><br/>" + entry.getKey() + " : " + Arrays.toString(entry.getValue()));
		}
		
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}
	
	


}
