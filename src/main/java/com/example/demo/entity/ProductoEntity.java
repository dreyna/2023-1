package com.example.demo.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

public class ProductoEntity implements Serializable{
	private static final long serialVersionUID = -2170897015344177815L;

	@Id
  	@Column(name = "ID_PRODUCTO")
  	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
    @SequenceGenerator(sequenceName = "SEQ_PRODUCTO", allocationSize = 1, name = "seqProducto")
	private Long id;
  
  	@Column(name = "NOMBRE")
  	private String nombre;
  	
  	@Column(name = "DESCRIPCION")
  	private String descripcion;

  	@Column(name = "PRECIO")
  	private Double precio;

  	@Column(name = "STOCK")
  	private Double stock;

  	@Column(name = "ESTADO")
  	private String estado;
}
