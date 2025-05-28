package com.faremco.app.Entity;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "pagos_conceptos")
public class PagosConceptos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idconcepto;

    @ManyToOne
    @JoinColumn(name = "idpag")
    private Pagos pago;

    @ManyToOne
    @JoinColumn(name = "idtipo")
    private TiposPago tipoPago;

    @ManyToOne
    @JoinColumn(name = "idres")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "idconsu")
    private Consumos consumo;

    private BigDecimal monto;
    private String descripcion;

    public PagosConceptos() {}
    public PagosConceptos(Pagos pago, TiposPago tipoPago, Reserva reserva, Consumos consumo, BigDecimal monto, String descripcion) {
        this.pago = pago;
        this.tipoPago = tipoPago;
        this.reserva = reserva;
        this.consumo = consumo;
        this.monto = monto;
        this.descripcion = descripcion;
    }

    public Long getId() { return idconcepto; }
    public void setId(Long idconcepto) { this.idconcepto = idconcepto; }

    public Pagos getPago() { return pago; }
    public void setPago(Pagos pago) { this.pago = pago; }

    public TiposPago getTipoPago() { return tipoPago; }
    public void setTipoPago(TiposPago tipoPago) { this.tipoPago = tipoPago; }

    public Reserva getReserva() { return reserva; }
    public void setReserva(Reserva reserva) { this.reserva = reserva; }

    public Consumos getConsumo() { return consumo; }
    public void setConsumo(Consumos consumo) { this.consumo = consumo; }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}