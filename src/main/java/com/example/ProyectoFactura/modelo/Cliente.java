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
@Table(name = "cliente")
public class Cliente{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  
     @Column(name="id_cliente")
    private Integer id_cliente;
    
    @Column(name="nombre_cliente")
    private String nombre_cliente;
    
    @Column(name="apellido_cliente")
    private String  apellido_cliente;
    
   
    @Column(name="cedula")
    private String  cedula;
    
        @Column(name="correo")
    private String  correo;
       @OneToMany(mappedBy="cliente")
    List<Factura>factura;
       
	public Integer getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}
	public String getNombre_cliente() {
		return nombre_cliente;
	}
	public void setNombre_cliente(String nombre_cliente) {
		this.nombre_cliente = nombre_cliente;
	}
	public String getApellido_cliente() {
		return apellido_cliente;
	}
	public void setApellido_cliente(String apellido_cliente) {
		this.apellido_cliente = apellido_cliente;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
       
       
}
