package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Pagos;
import com.faremco.app.Interface.IPagos;

@Service
public class ServicePagos {
    @Autowired
    private IPagos iPagos;

    public Pagos guardarPagos(Pagos pagos) {
        return iPagos.save(pagos);
    }
    
    public List<Pagos> listarPagos() {
        return (List<Pagos>) iPagos.findAll();
    }

    public Optional<Pagos> buscarPagosPorId(long id) {
        return iPagos.findById(id);
    }

    public Pagos editarPagos(Pagos pagos) {
        return iPagos.save(pagos);
    }

    public void eliminarPagos(long id) {
        iPagos.deleteById(id);
    }
}
