package ntu.nguyentruong.ntuCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ntu.nguyentruong.ntuCMS.models.Page;
import ntu.nguyentruong.ntuCMS.repositories.PageRepository;

@Service
public class PageServices {
	@Autowired
	PageRepository pRepos;
	//Dịch vụ lấy về tất cả các trang
	public List<Page> getAllPages(){
		return pRepos.findAll();
	}
}
