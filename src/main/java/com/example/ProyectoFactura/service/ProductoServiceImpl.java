package com.example.ProyectoFactura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ProyectoFactura.modelo.Producto;
import com.example.ProyectoFactura.repositorio.IProductoRepositorio;


@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepositorio ProductoSer;

	@Override
	@Transactional(readOnly=true)
	public List<Producto>findAll() {
	    return (List<Producto>) ProductoSer.findAll();
	}
	

	@Override
	@Transactional(readOnly=true)
	public Producto findById(Integer id) {
	
		return ProductoSer.findById(id).orElse(null);
	
	}

	@Override
	public Producto save(Producto producto) {
		
		return ProductoSer.save(producto);
	}

	@Override
	public void delete(Integer id) {
		
		ProductoSer.deleteById(id);;
	}
	
	
}
