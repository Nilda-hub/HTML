package com.example.demo.components;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.model.Post;

@Component("com.example.demo.components.PostComponent")
public class PostComponent {

	public List<Post> getPosts(){
		ArrayList<Post> post = new ArrayList<>();
		
		post.add(new Post(1, "La principal característica de las Phalaenopsis son sus flores en forma de mariposa.", "http://localhost/img/post.jpg", new Date(), "Phalaenopsis"));
		post.add(new Post(2, "La principal característica de las Phalaenopsis son sus flores en forma de mariposa.", "http://localhost/img/post.jpg", new Date(), "Phalaenopsis"));
		
		return post;
	}

	
}
