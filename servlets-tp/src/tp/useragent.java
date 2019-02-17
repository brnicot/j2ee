package tp;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class useragent
 */
@WebServlet("/useragent")
public class useragent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public useragent() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("<html>");
		response.getWriter().append("<style>table, th, td { border: 1px solid black; }</style>");
		response.getWriter().append("<body>");
		response.getWriter().append("<table style='text-align: center;'>");
		response.getWriter().append("<tr>");
		response.getWriter().append("<th>Header</th>");
		response.getWriter().append("<th>Value</th>");
		response.getWriter().append("</tr>");
		
		for (Enumeration<String> e = request.getHeaderNames(); e.hasMoreElements();) {
			String currentHeader = e.nextElement();
			response.getWriter().append("<tr><td>" + currentHeader + "</td><td>" + request.getHeader(currentHeader) + "</td></tr>");
		}
		
		response.getWriter().append("<table>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
	}

}
