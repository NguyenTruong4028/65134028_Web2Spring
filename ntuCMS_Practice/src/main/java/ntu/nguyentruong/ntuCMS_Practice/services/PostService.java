package ntu.nguyentruong.ntuCMS_Practice.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ntu.nguyentruong.ntuCMS_Practice.models.Post;

@Service
public class PostService {
	List<Post> posts = new ArrayList<Post>();
	
	public PostService() {
		posts.add(new Post("Po01","Trang chu","Bao","C001"));
		posts.add(new Post("Po02","Gioi thieu","Bao","C001"));
		posts.add(new Post("Po03","Contact","Bao","C001"));
	}
	
	public List<Post> getAllPost() {
		return posts;
	}
	
	public Post getById(String id) {
		for (Post post : posts) {
			if(post.getId().equals(id));
			return post;
		}
		return null;
	}
	
	public void addPost(Post p) {
		posts.add(p);
	}
	
	public void delPost(String id) {
		posts.removeIf(p -> p.getId().equals(id));
	}
}
