package ntu.nguyentruong.B5_TruyenDoiTuong2View.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
	@GetMapping("/")
	public String showSinhVien(ModelMap m) {
		SinhVien sv1 = new SinhVien("65134028","Nguyen Truong","2004","Nu");
		m.addAttribute("sv",sv1);
		//return "detail";
		return "detail-2";
	}
}
