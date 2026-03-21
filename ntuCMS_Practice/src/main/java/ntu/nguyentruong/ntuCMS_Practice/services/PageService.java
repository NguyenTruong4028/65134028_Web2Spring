package ntu.nguyentruong.ntuCMS_Practice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ntu.nguyentruong.ntuCMS_Practice.models.Page;

@Service
public class PageService {
	List<Page> pages = new ArrayList<>();
	
	public PageService() {
		pages.add(new Page("P001","Tin tức","news","Tin tức mới nhất","P1"));
		pages.add(new Page("P002","Tin học","IT","Tin học tiên tiến","P1"));
		pages.add(new Page("P003","Học đường","school","Học đường hôm nay","P1"));
	}
	
	public List<Page> getAllPages() {
		return pages;
	}
	
	public Page getById(String id) {
		for (Page p : pages) {
			if(p.getId().equals(id))
				return p;
		}
		return null;
	}
	
	public void addPage(Page page) {
		pages.add(page);
	}
	
	public void delPage(String id) {
		pages.removeIf(p -> p.getId().equals(id));
	}
}
