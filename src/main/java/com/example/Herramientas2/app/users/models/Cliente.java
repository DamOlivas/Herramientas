package com.example.Herramientas2.app.users.models;

import javax.persistence.*;

@Entity
@Table(name = "clientes")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_seq_gen")
    @SequenceGenerator(name = "cliente_seq_gen", sequenceName = "cliente_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Nombre",columnDefinition = "varchar (50)", nullable = false, unique = true)
    private String Nombre;
    @Column(name = "Direccion", columnDefinition = "varchar (50)")
    private String Direccion;
    @Column(name = "Factura", columnDefinition = "Integer",  nullable = false)
    private Integer Factura;

    public Cliente(){
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id; }

    public String getNombre() {return Nombre; }

    public void setNombre(String Nombre) {this.Nombre = Nombre; }

    public String getDireccion() { return Direccion; }

    public void setDireccion(String Direccion) { this.Direccion = Direccion;}

    public Integer getFactura() {
        return Factura;
    }

    public void setFactura(Integer factura) {
        this.Factura = factura;
    }
}
