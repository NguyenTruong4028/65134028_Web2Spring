package ntu.nguyentruong.ntuCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ntu.nguyentruong.ntuCMS.models.Page;
import ntu.nguyentruong.ntuCMS.models.Post;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class APIControllers {
	List<Page> dsTrang = new ArrayList<>();
	
	public APIControllers() {
		//Danh sách trang
		dsTrang.add(new Page("P1","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P2","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P3","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		dsTrang.add(new Page("P4","Tin tức mới","news","Hôm nay Mỹ với Iran bắn nhau","001"));
		
		
	}
	
	@GetMapping("/api/hello")
	public String sayHello() {
		return "Hello from REST";
	}
	
	@GetMapping("/api/pages")
	public List<Page> getdsTrang(){
		return dsTrang;
	}
	
	@GetMapping("/api/pages/{id}")
	public Page getTrang(@PathVariable("id") String id){
	    for (Page p : dsTrang) {
	        if(p.getId().equals(id))
	            return p;
	    }
	    return null;
	}
	
	@GetMapping("/api/oneObj")
	public Page getObj() {
		return new Page("007","GioiThieu","Introduce","Content","002");
	}
	
	@PutMapping("/api/pages/update/{id}")
	public boolean updatePage(@RequestBody Page page, @PathVariable("id") String id) {
		for(Page p : dsTrang){
	        if(p.getId().equals(id)){
	            dsTrang.remove(p);
	            dsTrang.add(page);
	            return true;
	        }
	    }
	    return false;
	}

	@PostMapping("/api/pages/add")
	public boolean createPage(@RequestBody Page page) {	
		return dsTrang.add(page);
	}
	
	@DeleteMapping("/api/pages/del/{id}")
	public boolean delPage(@PathVariable("id") String id) {
		for(Page page : dsTrang)
			if(page.getId().equals(id)) {
				boolean kq = dsTrang.remove(page);
				return kq;
				
			}
		return false;
	}
	
	@DeleteMapping("/api/pages/del2/{id}")
	public boolean delPage2(@PathVariable("id") String id) {
		return  dsTrang.removeIf(page -> page.getId().equals(id));
	}
}
