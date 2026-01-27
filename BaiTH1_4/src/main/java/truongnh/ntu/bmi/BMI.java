package truongnh.ntu.bmi;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class BMI
 */
@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMI() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("html/bmi-form.html").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String h = request.getParameter("height");
		String w = request.getParameter("weight");
		String standard = request.getParameter("standard");
		
		double height = Double.parseDouble(h);
		double weight = Double.parseDouble(w);
		
		double bmi = weight / (height * height);
		
		String category, advice;
		
		if ("asia".equals(standard)) {
            if (bmi < 18.5) {
                category = "Gầy";
                advice = "Bạn nên ăn uống đầy đủ và tăng cường dinh dưỡng.";
            } else if (bmi < 23) {
                category = "Bình thường";
                advice = "Hãy duy trì chế độ ăn uống và luyện tập hợp lý.";
            } else if (bmi < 25) {
                category = "Thừa cân";
                advice = "Bạn nên giảm tinh bột và tăng vận động.";
            } else {
                category = "Béo phì";
                advice = "Nên có kế hoạch giảm cân và tham khảo ý kiến bác sĩ.";
            }
        } else { // WHO
            if (bmi < 18.5) {
                category = "Gầy";
                advice = "Bạn nên tăng cân lành mạnh.";
            } else if (bmi < 25) {
                category = "Bình thường";
                advice = "Tiếp tục duy trì lối sống lành mạnh.";
            } else if (bmi < 30) {
                category = "Thừa cân";
                advice = "Cần kiểm soát chế độ ăn và tập luyện.";
            } else {
                category = "Béo phì";
                advice = "Nên thăm khám để có hướng dẫn giảm cân phù hợp.";
            }
        }

		 request.setAttribute("height", height);
	     request.setAttribute("weight", weight);
	     request.setAttribute("bmi", String.format("%.2f", bmi));
	     request.setAttribute("category", category);
	        request.setAttribute("advice", advice);
	        request.setAttribute("standardName",
	                "asia".equals(standard) ? "Chuẩn Châu Á" : "Chuẩn Quốc tế (WHO)");

	        // CHUYỂN SANG JSP HIỂN THỊ
	     request.getRequestDispatcher("html/bmi-result.jsp")
	               .forward(request, response);
		
				
	}

}
