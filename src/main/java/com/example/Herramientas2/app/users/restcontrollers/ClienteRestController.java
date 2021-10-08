package com.example.Herramientas2.app.users.restcontrollers;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Cliente")
public class ClienteRestController {

    @GetMapping("/{id}")
    public Integer findById(@PathVariable("id")Integer id){
        return id;
    }

    @PostMapping
    public String create(@RequestBody String Nombre){
        return Nombre;
    }

}
