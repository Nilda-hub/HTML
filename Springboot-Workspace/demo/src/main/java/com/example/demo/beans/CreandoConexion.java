package com.example.demo.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import com.example.demo.model.Conexion;
import com.example.demo.model.Usuario;

@Component
public class CreandoConexion {
	@Bean(name = "beanUsuario")
	public Usuario getUsuario() {
		return new Usuario();
	}
	
	@Bean(name = "beanConexion")
	public Conexion getConexion() {
		com.example.demo.model.Conexion conexion = new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		return conexion;
	}
	
	@Bean(name = "beanConexionDos")
	public Conexion getConexionDos() {
		com.example.demo.model.Conexion conexion = new Conexion();
		conexion.setDb("mysql");
		conexion.setUrl("localhost");
		return conexion;
	}
	
}
