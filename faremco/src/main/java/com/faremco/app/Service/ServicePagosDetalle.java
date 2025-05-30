package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.PagosDetalle;
import com.faremco.app.Interface.IPagosDetalle;

@Service
public class ServicePagosDetalle {
    @Autowired
    private IPagosDetalle iPagosDetalle;

    public PagosDetalle guardarPagosDetalle(PagosDetalle pagosDetalle) {
        return iPagosDetalle.save(pagosDetalle);
    }

    public List<PagosDetalle> listarPagosDetalle() {
        return (List<PagosDetalle>) iPagosDetalle.findAll();
    }

    public Optional<PagosDetalle> buscarPagosDetallePorId(long id) {
        return iPagosDetalle.findById(id);
    }

    public PagosDetalle editarPagosDetalle(PagosDetalle pagosDetalle) {
        return iPagosDetalle.save(pagosDetalle);
    }

    public void eliminarPagosDetalle(long id) {
        iPagosDetalle.deleteById(id);
    }
}
