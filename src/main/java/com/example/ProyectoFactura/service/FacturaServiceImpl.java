package com.example.ProyectoFactura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.ProyectoFactura.modelo.Factura;

import com.example.ProyectoFactura.repositorio.IFacturaRepositorio;
@Service
public class FacturaServiceImpl implements IFacturaService {

	@Autowired
	private IFacturaRepositorio factrep;
	@Override
	@Transactional(readOnly=true)
	public List<Factura> findAll() {
	
		return (List<Factura>) factrep.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Factura findById(Integer id) {
		// TODO Auto-generated method stub
		return factrep.findById(id).orElse(null);
	}

	@Override
	public Factura save(Factura factura) {
		// TODO Auto-generated method stub
		return factrep.save(factura);
	}

	@Override
	public void delete(Integer id) {
		factrep.deleteById(id);
		
	}
}
