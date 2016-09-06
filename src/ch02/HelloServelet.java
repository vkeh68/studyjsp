package ch02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServelet
 */
@WebServlet("/HelloServelet")
public class HelloServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html:charset=utf-8");
		
		try{
			PrintWriter out = response.getWriter();
			out.println("<HTML>");
		out.println("<HEAD><HTML><TITLE>ó�� �ۼ��ϴ� Servlet</HTML></Head>");
			out.println("<BODY>");
			out.println("ó�� �ۼ��ϴ� Servlet");
			out.println("</BODY>");
			out.println("<HTML>");
			out.close();
		}catch(Exception e){
			getServletContext().log("Error in HelloServlet:",e);
		}
			
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
