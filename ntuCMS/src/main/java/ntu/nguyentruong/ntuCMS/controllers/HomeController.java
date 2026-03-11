package ntu.nguyentruong.ntuCMS.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.nguyentruong.ntuCMS.models.Page;
import ntu.nguyentruong.ntuCMS.models.Post;

@Controller
public class HomeController {
	//Danh sách các Page, Post
	List<Page> dsTrang = new ArrayList<>();
	List<Post> dsBaiViet = new ArrayList<>();
	@GetMapping("/")
	public String home() {
		return "dashboard";
	}
	public HomeController() {
		//Danh sách trang
		dsTrang.add(new Page("P1","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P2","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P3","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P4","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		//Danh sách bài viết
		dsBaiViet.add(new Post("ps1","Mỹ và Trung Quốc","Mỹ và TQ so kè chiếm lĩnh thế giới","001","../imgs/anh.jpg"));
		dsBaiViet.add(new Post("ps1","Mỹ và Trung Quốc","Mỹ và TQ so kè chiếm lĩnh thế giới","001","../imgs/anh.jpg"));
		dsBaiViet.add(new Post("ps1","Mỹ và Trung Quốc","Mỹ và TQ so kè chiếm lĩnh thế giới","001","../imgs/anh.jpg"));
		dsBaiViet.add(new Post("ps1","Mỹ và Trung Quốc","Mỹ và TQ so kè chiếm lĩnh thế giới","001","../imgs/anh.jpg"));
		
	}
	@GetMapping("/page/all")
	public String getdanhsachPage(ModelMap m) {
		m.addAttribute("lsPage", dsTrang);		
		return "pages";
	}
	@GetMapping("/post/all")
	public String getdanhsachPost(ModelMap m) {
		m.addAttribute("lsPost", dsBaiViet);		
		return "posts";
	}
	
}
