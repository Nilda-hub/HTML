package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.components.PostComponent;
import com.example.demo.model.Conexion;
import com.example.demo.service.PostService;
import com.example.demo.service.implementation.PostServiceImpl;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
    @Autowired
    @Qualifier("beanConexion")
	private Conexion conexion;
    
    @Autowired
    @Qualifier("com.example.demo.components.PostComponent")
    public PostComponent postComponent;
    
    @Autowired
    public PostService postService;
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		postService.validationId(postComponent.getPosts())
		.forEach((post) -> {
		System.out.println(post.getTitulo());
		});
	}
}
