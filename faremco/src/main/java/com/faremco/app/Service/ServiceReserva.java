package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Reserva;
import com.faremco.app.Interface.IReserva;

@Service
public class ServiceReserva {
    @Autowired
    private IReserva ireserva;

    public Reserva guardarReserva(Reserva reserva) {
        return ireserva.save(reserva);
    }

    public List<Reserva> listarReservas() {
        return (List<Reserva>) ireserva.findAll();
    }

    public Optional<Reserva> buscarReservaPorId(long id) {
        return ireserva.findById(id);
    }

    public Reserva editarReserva(Reserva reserva) {
        return ireserva.save(reserva);
    }

    public void eliminarReserva(long id) {
        ireserva.deleteById(id);
    }
}
