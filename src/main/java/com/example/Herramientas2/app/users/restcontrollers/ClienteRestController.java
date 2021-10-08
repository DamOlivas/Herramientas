package com.example.Herramientas2.app.users.restcontrollers;


import com.example.Herramientas2.app.users.models.Cliente;
import com.example.Herramientas2.app.users.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Cliente")
public class ClienteRestController {

    private final ClienteService clienteService;

    public ClienteRestController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id){
        return id;
    }

    @PostMapping
    public String create(@RequestBody String Nombre){
        return Nombre;
    }

    @GetMapping
    public List<Cliente>findAll(){
        return clienteService.findAll();
    }

}
