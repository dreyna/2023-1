package com.example.demo.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ProductoDTO implements Serializable{
		  
		private Long id;
	  
	  	private String nombre;
	  	
	  	private String descripcion;
	  	private Double precio;

	  	private Double stock;

	  	private String estado;

}