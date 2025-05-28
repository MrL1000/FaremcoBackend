package com.faremco.app.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "consumos")
public class Consumos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idconsu;

    @ManyToOne
    @JoinColumn(name = "idres", nullable = false)
    private Reserva idres;

    @ManyToOne
    @JoinColumn(name = "idpro", nullable = false)
    private Producto idpro;

    private int cantidad;
    private LocalDateTime consumidoEn;

    public Consumos() {}

    public Consumos(Reserva idres, Producto idpro, int cantidad, LocalDateTime consumidoEn) {
        this.idres = idres;
        this.idpro = idpro;
        this.cantidad = cantidad;
        this.consumidoEn = consumidoEn;
    }

    public Long getId() { return idconsu; }
    public void setId(Long idconsu) { this.idconsu = idconsu; }

    public Reserva getReserva() { return idres; }
    public void setReserva(Reserva idres) { this.idres = idres; }

    public Producto getProducto() { return idpro; }
    public void setProducto(Producto idpro) { this.idpro = idpro; }

    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public LocalDateTime getConsumidoEn() { return consumidoEn; }
    public void setConsumidoEn(LocalDateTime consumidoEn) { this.consumidoEn = consumidoEn; }
}