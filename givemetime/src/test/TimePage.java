package test;

import test.GiveMeTime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Time")
public class TimePage extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2322077516394195748L;

	/**
	 * Method to receive get requests from the web server
	 * (Passes them onto the doPost method)
	 * @param req The HttpServletRequest which contains the information submitted via get
	 * @param res A response containing the required response data for this request
	 **/

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		doPost(req,res);  			//  Pass all GET request to the the doPost method
	}

	/**
	 * Method to relieve and process Post requests from the web server
	 * @param req The HttpServletRequest which contains the information submitted via post
	 * @param res A response containing the required response data for this request
	 **/

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		res.setContentType("text/html");	//  Set the content type of the response
		PrintWriter out=res.getWriter();	//  PrintWriter to write text to the response
		out.println("<html><head><title>un titre</title></head><body>");
		out.println("<h1>Bonjour !!</h1>");		//  Write Hello World
		out.println("la date d'aujourd'hui est "+GiveMeTime.getCurrentTime());
		out.println("</body>");
		out.close();			//  Close the PrintWriter
	}
}
