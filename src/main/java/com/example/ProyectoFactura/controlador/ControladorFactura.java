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

import com.example.ProyectoFactura.modelo.Factura;

import com.example.ProyectoFactura.service.IFacturaService;


/**
 *
 * @author daysi
 */
@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ControladorFactura {
	@Autowired
	private IFacturaService FaService;
	
	@GetMapping("/factura")
	public List<Factura>index(){
		return FaService.findAll();
	}
	
	@GetMapping("/factura/{id}")
	public Factura show(@PathVariable Integer id) {
		return FaService.findById(id);
	}
	
	@PostMapping("/factura")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura saves(@RequestBody Factura factura) {
		return FaService.save(factura);
	}
	
	@DeleteMapping("/factura/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		FaService.delete(id);
	}
	
	@PutMapping("/factura/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Factura update(@RequestBody Factura factura, @PathVariable Integer id) {
		Factura facactual = FaService.findById(id);
		facactual.setFecha(factura.getFecha());
		facactual.setDetallefactura(factura.getDetallefactura());
	    facactual.setCliente(factura.getCliente());
		return FaService.save(facactual);
	}
    
}
