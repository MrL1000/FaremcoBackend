package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.TiposPago;
import com.faremco.app.Interface.ITiposPago;

@Service
public class ServiceTiposPagos {
    @Autowired
    private ITiposPago iTiposPago;

    public TiposPago guardarTipoPago(TiposPago tipoPago) {
        return iTiposPago.save(tipoPago);
    }

    public List<TiposPago> listarTiposPagos() {
        return (List<TiposPago>) iTiposPago.findAll();
    }

    public Optional<TiposPago> buscarTipoPagoPorId(long id) { 
        return iTiposPago.findById(id);
    }

    public TiposPago editarTipoPago(TiposPago tipoPago) {
        return iTiposPago.save(tipoPago);
    }

    public void eliminarTipoPago(long id) {
        iTiposPago.deleteById(id);
    }
}
