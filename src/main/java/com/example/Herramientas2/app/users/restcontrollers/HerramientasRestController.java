package com.example.Herramientas2.app.users.restcontrollers;

import com.example.Herramientas2.app.users.models.Cliente;
import com.example.Herramientas2.app.users.models.Herramientas;
import com.example.Herramientas2.app.users.services.HerramientasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Herramientas")
public class HerramientasRestController {

    private final HerramientasService herramientasService;

    public HerramientasRestController(HerramientasService herramientasService) {
        this.herramientasService = herramientasService;
    }

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id){
        return id;
    }

    @PostMapping
    public Herramientas create(@RequestBody Herramientas herramientas){
        return herramientasService.create(herramientas);
    }

    @GetMapping
    public List<Herramientas> findAll(){
        return herramientasService.findAll();
    }

}
