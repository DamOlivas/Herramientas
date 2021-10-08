package com.example.Herramientas2.app.users.services;

import com.example.Herramientas2.app.users.models.Cliente;
import com.example.Herramientas2.app.users.repos.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente>findAll(){
        return clienteRepository.findAll();
    }

    public Cliente create(Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
