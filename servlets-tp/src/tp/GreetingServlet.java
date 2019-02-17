package tp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/hello")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		// then write the data of the response
		out.println("<html>" + "<head><title>Hello</title></head>");

		out.println(
				"<body  bgcolor=\"#ffffff\">"
				+ "<img src=\"duke.waving.gif\" alt=\"Duke waving\">"
				+ "<h2>Hello, my name is Duke. What's yours?</h2>"
				+ "<form method=\"get\">"
				+ "<input type=\"text\" name=\"username\" size=\"25\">"
				+ "<p></p>" + "<input type=\"submit\" value=\"Submit\">"
				+ "<input type=\"reset\" value=\"Reset\">" + "</form>");

		String username = request.getParameter("username");

		if ((username != null) && (username.length() > 0)) {
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/lenom");
			dispatcher.include(request, response);
		}
		
		out.println("tati");

		out.println("</body></html>");
		out.close();
	}

	public String getServletInfo() {
		return "The Hello servlet says hello.";
	}

}
