package com.example.Herramientas2.app.users.repos;

import com.example.Herramientas2.app.users.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
