package com.example.ProyectoFactura.service;

import com.example.ProyectoFactura.modelo.Cliente;
import java.util.List;



public interface IClienteService {

public List<Cliente>findAll();
	
	public Cliente findById(Integer id);
	
    public Cliente save(Cliente cliente);

    public void delete(Integer id);
    
}
