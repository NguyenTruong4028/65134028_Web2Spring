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
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/page")
public class PageController {
	@Autowired
	PageService pService;
	
	@GetMapping("/all")
	public String list(ModelMap m) {
		m.addAttribute("pages", pService.getAllPages());
		return "page/list";
	}
	
	@GetMapping("/view/{id}")
	public String viewById(@PathVariable("id") String id, ModelMap m) {
		m.addAttribute("view", pService.getById(id));
		return "page/view";
	}
	
	@GetMapping("/new")
	public String addPage(ModelMap m) {
		m.addAttribute("add", new Page());
		return "page/new";
	}
	
	@PostMapping("/save")
	public String save(Page page) {
		pService.addPage(page);
		return "redirect:/page/all";
	}
	
	@GetMapping("/delete/{id}")
	public String delById(@PathVariable("id") String id) {
		pService.delPage(id);
		return "page/delete";
	}
}

