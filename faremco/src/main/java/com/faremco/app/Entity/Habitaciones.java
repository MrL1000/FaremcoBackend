package com.faremco.app.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "habitaciones")
public class Habitaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idhab;
    
    @ManyToOne
    @JoinColumn(name = "idcat")
    private Categoria idcat;

    private int numero;
    private String estado;

    public Habitaciones() {}
    public Habitaciones(Categoria idcat, int numero, String estado) {
        this.idcat = idcat;
        this.numero = numero;
        this.estado = estado;
    }

    public long getId() { return idhab; }
    public void setId(long idhab) { this.idhab = idhab; }

    public Categoria getIdcat() { return idcat; }
    public void setIdcat(Categoria idcat) { this.idcat = idcat; }

    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado;}
}
