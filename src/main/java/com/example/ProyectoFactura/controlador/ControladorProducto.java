/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.example.ProyectoFactura.modelo.Producto;
import com.example.ProyectoFactura.service.IProductoService;



/**
 *
 * @author daysi
 */
@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ControladorProducto {
	@Autowired
	private IProductoService IPro;
	@GetMapping("/producto")
	public List<Producto>index(){
		return IPro.findAll();
	}
	
	//Bucar Proucto por id
	@GetMapping("/producto/{id}")
	public Producto show(@PathVariable Integer id) {
		return IPro.findById(id);
	}

	//Guardar Producto
	@PostMapping("/producto")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto create (@RequestBody Producto producto) {
		return IPro.save(producto);

	}

	

	

	//eliminar 

	@DeleteMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		IPro.delete(id);
	}


		

	
	@PutMapping("/producto/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Producto update(@RequestBody Producto producto, @PathVariable Integer id) {
		Producto productoactual = IPro.findById(id);
		productoactual.setNombre(producto.getNombre());
		productoactual.setPrecio(producto.getPrecio());
	    productoactual.setStock(producto.getStock());
		return IPro.save(productoactual);
	}



}
