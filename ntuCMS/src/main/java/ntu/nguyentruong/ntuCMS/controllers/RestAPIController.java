package ntu.nguyentruong.ntuCMS.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ntu.nguyentruong.ntuCMS.models.Page;
import ntu.nguyentruong.ntuCMS.repositories.PageRepository;
import ntu.nguyentruong.ntuCMS.services.PageServices;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class RestAPIController {
	@Autowired
	PageServices pServices;
	
	@GetMapping("/restAPI/pages/all")
	public List<Page> getAllPages() {
		List<Page> dsTrang = new ArrayList<Page>();
		//Các xử lý khác
//		//dsTrang.add(new Page("P002","Introduce","Gioi thieu","Giới thiệu về NTU","P001"));
		dsTrang = pServices.getAllPages();
		//Các xử lý khác
		return dsTrang;
	}
	
}
