package com.example.ProyectoFactura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.example.ProyectoFactura.modelo.DetalleFactura;
import com.example.ProyectoFactura.repositorio.IDetalleFacturaRepositorio;

@Service
public class DetalleFactServiceImpl implements IDetalleFacService{
	@Autowired
	private IDetalleFacturaRepositorio detallefac;
    @Override
	@Transactional(readOnly=true)
	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return (List<DetalleFactura>) detallefac.findAll();
	}

	@Override
	public DetalleFactura findById(Integer id_det) {
		// TODO Auto-generated method stub
		return detallefac.findById(id_det).orElse(null);
	}

	@Override
	public DetalleFactura save(DetalleFactura detallefact) {
		// TODO Auto-generated method stub
		return detallefac.save(detallefact);
	}

	@Override
	public void delete(Integer id_det) {
		detallefac.deleteById(id_det);
		
	}

}
