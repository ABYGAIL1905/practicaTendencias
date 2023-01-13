package com.example.ProyectoFactura.service;

import java.util.List;

import com.example.ProyectoFactura.modelo.Producto;



public interface IProductoService {
     
	public List<Producto>findAll();
	
	public Producto findById(Integer id);
		
	public Producto save(Producto producto);

	public void delete(Integer id);


}
