package truongnh.ntu.doGet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class DoGet
 */
@WebServlet("/DoGet")
public class DoGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public DoGet() {
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter wt = response.getWriter();
		String value1 = request.getParameter("param1");
		String value2 = request.getParameter("param2");
		wt.append("Value of param1 = ");
		wt.append(value1);
		wt.append("\nValue of param2 = ");
		wt.append(value2);
	}

}
