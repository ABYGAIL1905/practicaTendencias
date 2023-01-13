package com.example.ProyectoFactura.repositorio;

import com.example.ProyectoFactura.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;



public interface IClienteRepositorio extends JpaRepository<Cliente, Integer>{
	@Query(value = "Select * from cliente c where c.cedula = :cedula", nativeQuery = true)
    public Cliente buscarCliente(String cedula);

}
