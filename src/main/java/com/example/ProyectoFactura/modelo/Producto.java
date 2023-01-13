/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.modelo;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_producto")
    private Integer id_producto;
    
    @Column (name = "nombre")
    private String nombre;
    
    @Column (name = "precio")
    private Double precio;
    
    @Column (name = "stock")
    private Integer stock;
    
    @OneToMany(mappedBy = "producto")
    List<DetalleFactura> detalle_factura;

	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public List<DetalleFactura> getDetalle_factura() {
		return detalle_factura;
	}

	public void setDetalle_factura(List<DetalleFactura> detalle_factura) {
		this.detalle_factura = detalle_factura;
	}

	
	
    
    
    
}