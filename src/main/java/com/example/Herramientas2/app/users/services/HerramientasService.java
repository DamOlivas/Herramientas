package com.example.Herramientas2.app.users.services;


import com.example.Herramientas2.app.users.models.Herramientas;
import com.example.Herramientas2.app.users.repos.HerramientasRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HerramientasService {

    private final HerramientasRepository herramientasRepository;

    public HerramientasService(HerramientasRepository herramientasRepository){
        this.herramientasRepository = herramientasRepository;
    }

    public List<Herramientas>findAll(){
        return herramientasRepository.findAll();
    }

    public Herramientas create(Herramientas herramientas){
        return herramientasRepository.save(herramientas);
    }
}
