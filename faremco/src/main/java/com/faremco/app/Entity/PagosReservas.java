package com.faremco.app.Entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "pagos_reservas")
public class PagosReservas {
    @EmbeddedId
    private PagosReservasId id;

    @ManyToOne
    @MapsId("idpag")
    @JoinColumn(name = "idpag")
    private Pagos pago;

    @ManyToOne
    @MapsId("idres")
    @JoinColumn(name = "idres")
    private Reserva reserva;

    public PagosReservas() {}

    public PagosReservas(Pagos pago, Reserva reserva) {
        this.pago = pago;
        this.reserva = reserva;
        this.id = new PagosReservasId(pago.getId(), reserva.getId());
    }

    public PagosReservasId getId() {
        return id;
    }

    public void setId(PagosReservasId id) {
        this.id = id;
    }

    public Pagos getPago() {
        return pago;
    }

    public void setPago(Pagos pago) {
        this.pago = pago;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}

@Embeddable
class PagosReservasId implements Serializable {
    private Long idpag;
    private Long idres;

    public PagosReservasId() {}

    public PagosReservasId(Long idpag, Long idres) {
        this.idpag = idpag;
        this.idres = idres;
    }

    public Long getIdpag() {
        return idpag;
    }

    public void setIdpag(Long idpag) {
        this.idpag = idpag;
    }

    public Long getIdres() {
        return idres;
    }

    public void setIdres(Long idres) {
        this.idres = idres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PagosReservasId)) return false;
        PagosReservasId that = (PagosReservasId) o;
        return Objects.equals(idpag, that.idpag) && Objects.equals(idres, that.idres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idpag, idres);
    }
}