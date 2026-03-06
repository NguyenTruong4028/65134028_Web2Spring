package ntu.nguyentruong.B6_TruyenDanhSach2View.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinhVienController {
	@GetMapping("/")
	public String listSinhVien(ModelMap m) {
		List<SinhVien> ds = Arrays.asList(
			new SinhVien("65134028","Nguyen Truong","2004","Nu"),
			new SinhVien("65138467","Nguyen Tuong","2005","Nam"),
			new SinhVien("65187458","Nguyen Trung","2006","Nu")
				);
		m.addAttribute("sinhviens",ds);
		return "danhsach";
	}
}
