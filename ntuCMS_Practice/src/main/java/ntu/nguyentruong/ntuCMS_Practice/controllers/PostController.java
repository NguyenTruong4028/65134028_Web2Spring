package ntu.nguyentruong.ntuCMS_Practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ntu.nguyentruong.ntuCMS_Practice.models.Page;
import ntu.nguyentruong.ntuCMS_Practice.models.Post;
import ntu.nguyentruong.ntuCMS_Practice.services.PostService;

@Controller
@RequestMapping("/post")
public class PostController {
	@Autowired
	PostService service;
	
	@GetMapping("/all")
	public String list(ModelMap m) {
		m.addAttribute("posts", service.getAllPost());
		return "post/list";
	}
	
	@GetMapping("/view/{id}")
	public String viewById(@PathVariable("id") String id, ModelMap m) {
		m.addAttribute("view", service.getById(id));
		return "post/view";
	}
	
	@GetMapping("/new")
	public String addPost(ModelMap m) {
		m.addAttribute("add", new Post());
		return "post/new";
	}
	
	@PostMapping("/save")
	public String save(Post post) {
		service.addPost(post);
		return "redirect:/post/all";
	}
	
	@GetMapping("/delete/{id}")
	public String delById(@PathVariable("id") String id) {
		service.delPost(id);
		return "post/delete";
	}
}
