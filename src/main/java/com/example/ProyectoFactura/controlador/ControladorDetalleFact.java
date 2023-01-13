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

import com.example.ProyectoFactura.modelo.DetalleFactura;

import com.example.ProyectoFactura.service.IDetalleFacService;

/**
 *
 * @author daysi
 */
@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ControladorDetalleFact {
	@Autowired
	private IDetalleFacService DetService;
	
	@GetMapping("/detalle_factura")
	public List<DetalleFactura>index(){
		return DetService.findAll();
	}
	
	@GetMapping("/detalle_factura/{id_det}")
	public DetalleFactura show(@PathVariable Integer id_det) {
		return DetService.findById(id_det);
	}
	
	@PostMapping("/detalle_factura")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFactura saves(@RequestBody DetalleFactura detallefact) {
		return DetService.save(detallefact);
	}
	
	@DeleteMapping("/detalle_factura/{id_det}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id_pro) {
		DetService.delete(id_pro);
	}
	
	@PutMapping("/detalle_factura/{id_det}")
	@ResponseStatus(HttpStatus.CREATED)
	public DetalleFactura update(@RequestBody DetalleFactura detallefact, @PathVariable Integer id_det) {
		DetalleFactura detactual = DetService.findById(id_det);
		detactual.setNumero_factrua(detallefact.getNumero_factrua());
		detactual.setCantidad(detallefact.getCantidad());
		
		return DetService.save(detactual);
	}
    
}
