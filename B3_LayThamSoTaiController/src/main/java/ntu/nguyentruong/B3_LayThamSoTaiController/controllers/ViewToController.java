package ntu.nguyentruong.B3_LayThamSoTaiController.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ViewToController {
	@GetMapping("/") //http://localhost:8080/?name=truong&que=camranh
	public String getParametes(HttpServletRequest ts, ModelMap m) {
		String name = ts.getParameter("name");
		String quequan = ts.getParameter("que");
		m.addAttribute("ten",name);
		m.addAttribute("ns",quequan);
		return "index";
	}
	
}
