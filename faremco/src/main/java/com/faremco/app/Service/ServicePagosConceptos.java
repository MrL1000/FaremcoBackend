package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.PagosConceptos;
import com.faremco.app.Interface.IPagosConceptos;

@Service
public class ServicePagosConceptos {
    @Autowired
    private IPagosConceptos iPagosConceptos;

    public PagosConceptos guardarPagosConceptos(PagosConceptos pagosConceptos) {
        return iPagosConceptos.save(pagosConceptos);
    }

    public List<PagosConceptos> listarPagosConceptos() {
        return (List<PagosConceptos>) iPagosConceptos.findAll();
    }

    public Optional<PagosConceptos> buscarPagosConceptosPorId(long id) {
        return iPagosConceptos.findById(id);
    }

    public PagosConceptos editarPagosConceptos(PagosConceptos pagosConceptos) {
        return iPagosConceptos.save(pagosConceptos);
    }

    public void eliminarPagosConceptos(long id) {
        iPagosConceptos.deleteById(id);
    }
}
