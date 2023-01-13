package com.example.ProyectoFactura.service;

import java.util.List;


import com.example.ProyectoFactura.modelo.DetalleFactura;

public interface IDetalleFacService {
public List<DetalleFactura>findAll();
	
	public DetalleFactura findById(Integer id_det);
	
    public DetalleFactura save(DetalleFactura detallefact);

    public void delete(Integer id_det);

}
