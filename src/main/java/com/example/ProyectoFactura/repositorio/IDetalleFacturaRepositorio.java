package com.example.ProyectoFactura.repositorio;

import com.example.ProyectoFactura.modelo.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;





public interface IDetalleFacturaRepositorio extends JpaRepository<DetalleFactura, Integer>{

}
