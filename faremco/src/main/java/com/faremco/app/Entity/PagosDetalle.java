package com.faremco.app.Entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pagos_detalle")
public class PagosDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idpag_detalle;

    @ManyToOne
    @JoinColumn(name = "idpag")
    private Pagos pago;

    private BigDecimal monto;

    @Enumerated(EnumType.STRING)
    private MetodoPago metodo;

    private String referencia;

    public enum MetodoPago {
        Efectivo, Tarjeta_Débito, Tarjeta_Crédito, Transferencia, Depósito, Otro
    }

    public PagosDetalle() {}
    public PagosDetalle(Pagos pago, BigDecimal monto, MetodoPago metodo, String referencia) {
        this.pago = pago;
        this.monto = monto;
        this.metodo = metodo;
        this.referencia = referencia;
    }

    public Long getId() { return idpag_detalle; }
    public void setId(Long idpag_detalle) { this.idpag_detalle = idpag_detalle; }

    public Pagos getPago() { return pago; }
    public void setPago(Pagos pago) { this.pago = pago; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public MetodoPago getMetodo() { return metodo; }
    public void setMetodo(MetodoPago metodo) { this.metodo = metodo; }

    public String getReferencia() { return referencia; }
    public void setReferencia(String referencia) { this.referencia = referencia; }

}