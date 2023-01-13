package com.example.ProyectoFactura.repositorio;

import com.example.ProyectoFactura.modelo.Factura;
import org.springframework.data.jpa.repository.JpaRepository;






public interface IFacturaRepositorio extends JpaRepository<Factura, Integer>{

}
