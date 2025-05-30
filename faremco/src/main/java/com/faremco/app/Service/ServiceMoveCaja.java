package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Move_caja;
import com.faremco.app.Interface.IMoveCaja;

@Service
public class ServiceMoveCaja {

    @Autowired
    private IMoveCaja iMoveCaja;

    public Move_caja guardarMoveCaja(Move_caja Move_caja) {
        return iMoveCaja.save(Move_caja);
    }

    public List<Move_caja> listarMoveCaja() {
        return (List<Move_caja>) iMoveCaja.findAll();
    }

    public Optional<Move_caja> buscarMoveCajaPorId(long id) {
        return iMoveCaja.findById(id);
    }

    public Move_caja editarMoveCaja(Move_caja moveCaja) {
        return iMoveCaja.save(moveCaja);
    }

    public void eliminarMoveCaja(long id) {
        iMoveCaja.deleteById(id);
    }

}
