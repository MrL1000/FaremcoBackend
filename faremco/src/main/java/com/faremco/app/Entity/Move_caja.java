package com.faremco.app.Entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "movimientos_caja")
public class Move_caja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idmc;

    @ManyToOne
    @JoinColumn(name = "idusuario", nullable = false)
    private Usuario idusuario;

    private String tipo;
    private BigDecimal monto;
    private String descripcion;
    private LocalDateTime registrado_en;

    public Move_caja() {}

    public Move_caja(Usuario idusuario, String tipo, BigDecimal monto, String descripcion, LocalDateTime registrado_en) {
        this.idusuario = idusuario;
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.registrado_en = registrado_en;
    }

    public Long getId() { return idmc; }
    public void setId(Long idmc) { this.idmc = idmc; }

    public Usuario getUsuario() { return idusuario; }
    public void setUsuario(Usuario idusuario) { this.idusuario = idusuario; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public LocalDateTime getRegistrado_en() { return registrado_en; }
    public void setRegistrado_en(LocalDateTime registrado_en) { this.registrado_en = registrado_en; }

}