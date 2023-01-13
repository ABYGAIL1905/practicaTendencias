package com.example.ProyectoFactura.repositorio;

import com.example.ProyectoFactura.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IProductoRepositorio extends JpaRepository<Producto, Integer>{

}
