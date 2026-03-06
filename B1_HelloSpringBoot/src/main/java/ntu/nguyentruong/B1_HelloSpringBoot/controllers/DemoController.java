package ntu.nguyentruong.B1_HelloSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class DemoController {
		//Ví dụ truyền dữ liệu sang view
		@GetMapping("/vd1")
		public String getVidu1(ModelMap m) {
			String kq = "Dữ liệu này đến từ Controller";
			m.addAttribute("tb",kq);
			return "index";
		}
		// Lấy giá trị (tham số url) truyền từ view sang controller
		//http://...//vd2?ten=NguyenTruong&mk=123
		@GetMapping("/vd2")
		public String getMethodName(HttpServletRequest thamso, ModelMap m) {
			String tenNhanDuoc = thamso.getParameter("ten");
			String mkNhanDuoc = thamso.getParameter("mk");
			m.addAttribute("name", tenNhanDuoc);
			m.addAttribute("pass", mkNhanDuoc);
			return "index2";
		}
		@GetMapping("/vd3")
		public String getChoVd3(@RequestParam("ten") String tenP,@RequestParam("mk") String mkP, ModelMap m) {
			m.addAttribute("name", tenP);
			m.addAttribute("pass", mkP);
			return "index2";
		}
		//=====================================================================
		//Lấy dữ liệu từ form trong trang login.html (http://..//login)
		@GetMapping("/login")
		public String dangNhap() {
			return "login"; //ta tạo trang login.html, trong đó form có thuộc tính action='/vd4', method=POST
		}
		
		@PostMapping("/vd4")
		public String postMethodName(HttpServletRequest thamso, ModelMap m) {
			String tenNhanDuoc = thamso.getParameter("uname");
			String mkNhanDuoc = thamso.getParameter("upass");
			m.addAttribute("name", tenNhanDuoc);
			m.addAttribute("pass", mkNhanDuoc);
			return "index4"; //index4 sẽ hiển thị tên nhận được từ form
		}
}
