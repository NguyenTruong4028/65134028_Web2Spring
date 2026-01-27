package truongnh.ntu.doPost;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ViDuDoPost
 */
@WebServlet("/ViDuDoPost")
public class ViDuDoPost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ViDuDoPost() {
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		PrintWriter traVe = response.getWriter();
		traVe.append("Bạn vừa yêu cầu dạng GET, đây là đáp ứng của tôi!");
		String noidungHTML = "<form method = POST action = '/BaiTH1_2/ViDuDoPost'>"
				+ "<label> Họ </label>"
				+ "<input type = 'text' name = 'fname'><br>\r\n"
				+ "<label> Tên </label>"
				+ "<input type = 'text' name = 'lname'><br>\r\n"
				+ "<input type = 'submit' value = 'Gửi đi'><br>\r\n"
				+ "</form>";
		traVe.append(noidungHTML);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String value1 = request.getParameter("fname");
		String value2 = request.getParameter("lname");
		PrintWriter traVe = response.getWriter();
		traVe.append("Bạn vừa yêu cầu dạng POST, đây là đáp ứng của tôi!");
		traVe.append("\nGiá trị tham số fname = ");
		traVe.append(value1);
		traVe.append("\nGiá trị tham số lname = ");
		traVe.append(value2);
				
	}

}
