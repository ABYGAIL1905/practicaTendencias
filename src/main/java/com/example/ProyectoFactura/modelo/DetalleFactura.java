/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.modelo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Table(name = "detalle_factura")
public class DetalleFactura {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_detalle")
    private Integer id_detalle;
    
    @Column (name = "numero_factrua")
    private Integer numero_factrua;
    
    @Column (name = "cantidad")
    private Integer cantidad;
    
    @ManyToOne
    @JoinColumn (name = "id_factura", referencedColumnName = "id_factura")
    private Factura factura;
    
    @ManyToOne
    @JoinColumn (name = "id_producto", referencedColumnName = "id_producto")
    private Producto producto;

	public Integer getId_detalle() {
		return id_detalle;
	}

	public void setId_detalle(Integer id_detalle) {
		this.id_detalle = id_detalle;
	}

	public Integer getNumero_factrua() {
		return numero_factrua;
	}

	public void setNumero_factrua(Integer numero_factrua) {
		this.numero_factrua = numero_factrua;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
    
    
}