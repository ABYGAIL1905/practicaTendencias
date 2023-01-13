package com.example.ProyectoFactura.service;

import java.util.List;


import com.example.ProyectoFactura.modelo.Factura;

public interface IFacturaService {
public List<Factura>findAll();
	
	public Factura findById(Integer id);
	 
    public Factura save(Factura factura);

    public void delete(Integer id);

}
