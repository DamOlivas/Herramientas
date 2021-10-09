package com.example.Herramientas2.app.users.models;


import javax.persistence.*;

@Entity
@Table(name = "herramientas")
public class Herramientas {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "herramientas_seq_gen")
    @SequenceGenerator(name = "herramientas_seq_gen", sequenceName = "herramientas_id_seq", allocationSize = 1)
    @Column(name = "id")
    private Integer id;
    @Column(name = "Tipo", columnDefinition = "varchar (25)", nullable = false, unique = true)
    private String Tipo;
    @Column(name = "Descripcion", columnDefinition = "varchar (70)", nullable = false, unique = true)
    private String Descripcion;
    @Column(name = "Cantidad", columnDefinition = "Integer")
    private Integer Cantidad;

    public Herramientas(){
    }

    public Integer getId(){ return id;}

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.Cantidad = cantidad;
    }
}
