package com.faremco.app.Entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpag;

    @ManyToOne
    @JoinColumn(name = "idres")
    private Reserva idres;

    @ManyToOne
    @JoinColumn(name = "idusuario")
    private Usuario idusuario;

    private Double monto;
    private String metodo;
    private LocalDateTime pagadoEn;
    private String numeroComprobante;

    public Pagos() {}

    public Pagos(Reserva idres, Usuario idusuario, Double monto, String metodo, LocalDateTime pagadoEn, String numeroComprobante) {
        this.idres = idres;
        this.idusuario = idusuario;
        this.monto = monto;
        this.metodo = metodo;
        this.pagadoEn = pagadoEn;
        this.numeroComprobante = numeroComprobante;
    }

    public Long getId() { return idpag; }
    public void setId(Long idpag) { this.idpag = idpag; }

    public Reserva getReserva() { return idres; }
    public void setReserva(Reserva idres) { this.idres = idres; }

    public Usuario getRecibidoPor() { return idusuario; }
    public void setRecibidoPor(Usuario idusuario) { this.idusuario = idusuario; }

    public Double getMonto() { return monto; }
    public void setMonto(Double monto) { this.monto = monto; }

    public String getMetodo() { return metodo; }
    public void setMetodo(String metodo) { this.metodo = metodo; }

    public LocalDateTime getPagadoEn() { return pagadoEn; }
    public void setPagadoEn(LocalDateTime pagadoEn) { this.pagadoEn = pagadoEn; }

    public String getNumeroComprobante() { return numeroComprobante; }
    public void setNumeroComprobante(String numeroComprobante) { this.numeroComprobante = numeroComprobante; }

}