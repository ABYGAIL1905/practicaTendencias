/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.modelo;



import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author daysi
 */
@Entity
@Getter
@Setter
@Table(name = "factura")
public class Factura {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name="id_factura")
    private Integer id_factura;
    
    @Column (name = "fecha")
    private Date fecha;
    
    @ManyToOne
    @JoinColumn (name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;
    
    @OneToMany(mappedBy = "factura")
    List<DetalleFactura> detallefactura;

	public Integer getId_factura() {
		return id_factura;
	}
	

	public void setId_factura(Integer id_factura) {
		this.id_factura = id_factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<DetalleFactura> getDetallefactura() {
		return detallefactura;
	}

	public void setDetallefactura(List<DetalleFactura> detallefactura) {
		this.detallefactura = detallefactura;
	}
    
    
}