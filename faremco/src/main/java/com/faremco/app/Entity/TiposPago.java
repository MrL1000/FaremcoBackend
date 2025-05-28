package com.faremco.app.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "tipos_pago")
public class TiposPago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idtipo;
    private String nombre;
    private String descripcion;

    public TiposPago() {}
    public TiposPago(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() { return idtipo; }
    public void setId(Long idtipo) { this.idtipo = idtipo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}