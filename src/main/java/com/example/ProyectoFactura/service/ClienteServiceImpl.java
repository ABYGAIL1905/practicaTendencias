package com.example.ProyectoFactura.service;

import com.example.ProyectoFactura.modelo.Cliente;
import com.example.ProyectoFactura.repositorio.IClienteRepositorio;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	private IClienteRepositorio clienterep;
	@Override
	@Transactional(readOnly=true)
	public List<Cliente> findAll() {
	return (List<Cliente>) clienterep.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Cliente findById(Integer id) {
		// TODO Auto-generated method stub
		return clienterep.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		// TODO Auto-generated method stub
		return clienterep.save(cliente);
	}

	@Override
	public void delete(Integer id) {
		clienterep.deleteById(id);
		
	}

	

}
