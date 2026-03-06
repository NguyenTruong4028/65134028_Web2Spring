package ntu.nguyentruong.B2_TruyenDuLieuSangView.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
	//TruyenDuLieuSangView
	//truyền dữ liệu: MSSV, Họ tên SV, Năm sinh, Giới tính
	@GetMapping("/")
	public String SinhVien(ModelMap m) {
		String name = "Nguyen Hong Truong";
		String mssv = "65134028";
		String ns = "2004";
		String gtinh = "Nu";
		m.addAttribute("name", name);
		m.addAttribute("mssv", mssv);
		m.addAttribute("ns", ns);
		m.addAttribute("gt", gtinh);
		return "sinhvien";
	}
}
