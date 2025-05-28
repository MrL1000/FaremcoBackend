package com.faremco.app.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcat;
    private String nombre;
    private String descripcion;
    private Double precio;

    public Categoria() {}
    public Categoria(String nombre, String descripcion, Double precio) {
        this.precio = precio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public long getId() { return idcat; }
    public void setId(long idcat) { this.idcat = idcat; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion;}

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio;}
}
