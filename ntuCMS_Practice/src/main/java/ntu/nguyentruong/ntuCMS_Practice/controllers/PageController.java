package ntu.nguyentruong.ntuCMS_Practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ntu.nguyentruong.ntuCMS_Practice.models.Page;
import ntu.nguyentruong.ntuCMS_Practice.services.PageService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	PageService pService;
	
	@GetMapping("/all")
	public String list(ModelMap m) {
		m.addAttribute("pages", pService.getAllPages());
		
		m.addAttribute("content", "page/list :: content");
		
		return "dashboard";
	}
	
	@GetMapping("/view/{id}")
	public String viewById(@PathVariable("id") String id, ModelMap m) {
		m.addAttribute("view", pService.getById(id));
		
		m.addAttribute("content", "page/view :: content");
		
		return "dashboard";
	}
	
	@GetMapping("/new")
	public String addPage(ModelMap m) {
		m.addAttribute("add", new Page());
		
		m.addAttribute("content", "page/new :: content");
		
		return "dashboard";
	}
	
	@PostMapping("/save")
	public String save(Page page) {
		pService.addPage(page);
		return "redirect:/page/all";
	}
	
	@GetMapping("/delete/{id}")
	public String delById(@PathVariable("id") String id) {
		pService.delPage(id);
		 return "redirect:/page/all"; 
	}
}

