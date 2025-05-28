package com.faremco.app.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "pagos_reservas")
public class PagosReservas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idpr;

    @ManyToOne
    @JoinColumn(name = "idrol")
    private Pagos pago;

    @ManyToOne
    @JoinColumn(name = "idres")
    private Reserva idres;

    public PagosReservas() {}

    public PagosReservas(Pagos pago, Reserva idres) {
        this.pago = pago;
        this.idres = idres;
    }
    public long getId() {
        return idpr;
    }
    public void setId(long idpr) {
        this.idpr = idpr;
    }
    public Pagos getPago() {
        return pago;
    }
    public void setPago(Pagos pago) {
        this.pago = pago;
    }
    public Reserva getReserva() {
        return idres;
    }
    public void setReserva(Reserva idres) {
        this.idres = idres;
    }
    
}
