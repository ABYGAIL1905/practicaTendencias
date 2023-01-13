/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ProyectoFactura.controlador;

import com.example.ProyectoFactura.modelo.Cliente;
import com.example.ProyectoFactura.service.IClienteService;
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




/**
 *
 * @author daysi
 */
@CrossOrigin (origins = {"http://localhost:8080"})
@RestController
@RequestMapping("/api")
public class ControladorCliente {
	@Autowired
	private IClienteService icliente;
	
	//retorna todos
	@GetMapping("/cliente")
	public List<Cliente>index(){
		return icliente.findAll();	
	}
	
	//retorna uno
	@GetMapping("/cliente/{id}")
	public Cliente show(@PathVariable Integer id){
		return icliente.findById(id);
	}
	
	//inserta un cliente
	@PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente saves(@RequestBody Cliente cliente) {
        return icliente.save(cliente);
    }
	
	//elimina un cliente
	@DeleteMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		icliente.delete(id);
	}
	
	//actualiza un cliente
	@PutMapping("/cliente/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer id){
		Cliente clienteactual = icliente.findById(id);
		clienteactual.setNombre_cliente(cliente.getNombre_cliente());
		clienteactual.setApellido_cliente(cliente.getApellido_cliente());
		clienteactual.setCedula(cliente.getCedula());
		clienteactual.setCorreo(cliente.getCorreo());
		return icliente.save(clienteactual);
	}
	
    
}
