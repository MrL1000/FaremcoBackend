package com.faremco.app.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpro;
    private String nombre;
    private String precio;
    private String stock;

    public Producto() {}
    public Producto(String nombre, String precio, String stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public long getId() { return idpro; }
    public void setId(long idpro) { this.idpro = idpro; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPrecio() { return precio; }
    public void setPrecio(String precio) { this.precio = precio; }

    public String getStock() { return stock; }
    public void setStock(String stock) { this.stock = stock;}
    
}
