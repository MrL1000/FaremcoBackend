package com.faremco.app.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpag;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario usuario;

    private BigDecimal monto_total;
    private LocalDateTime pagadoEn;
    private String numeroComprobante;

    @Enumerated(EnumType.STRING)
    private EstadoPago estado;

    public enum EstadoPago {
        Pendiente, Parcial, Completo
    }

    public Pagos() {}
    public Pagos(Usuario usuario, BigDecimal monto_total, LocalDateTime pagadoEn, String numeroComprobante, EstadoPago estado) {
        this.usuario = usuario;
        this.monto_total = monto_total;
        this.pagadoEn = pagadoEn;
        this.numeroComprobante = numeroComprobante;
        this.estado = estado;
    }

    public Long getId() { return idpag; }
    public void setId(Long idpag) { this.idpag = idpag; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public BigDecimal getMonto_total() { return monto_total; }
    public void setMonto_total(BigDecimal monto_total) { this.monto_total = monto_total; }

    public LocalDateTime getPagadoEn() { return pagadoEn; }
    public void setPagadoEn(LocalDateTime pagadoEn) { this.pagadoEn = pagadoEn; }

    public String getNumeroComprobante() { return numeroComprobante; }
    public void setNumeroComprobante(String numeroComprobante) { this.numeroComprobante = numeroComprobante; }

    public EstadoPago getEstado() { return estado; }
    public void setEstado(EstadoPago estado) { this.estado = estado; }

}