package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.PagosReservas;
import com.faremco.app.Interface.IPagosReservas;

@Service
public class ServicePagosReserva {
    @Autowired
    private IPagosReservas iPagosReservas;

    public PagosReservas guardarPagosReserva(PagosReservas pagosReserva) {
        return iPagosReservas.save(pagosReserva);
    }

    public List<PagosReservas> listarPagosReserva() {
        return (List<PagosReservas>) iPagosReservas.findAll();
    }

    public Optional<PagosReservas> buscarPagosReservaPorId(long id) {
        return iPagosReservas.findById(id);
    }

    public PagosReservas editarPagosReserva(PagosReservas pagosReserva) {
        return iPagosReservas.save(pagosReserva);
    }

    public void eliminarPagosReserva(long id) {
        iPagosReservas.deleteById(id);
    }
    
}
