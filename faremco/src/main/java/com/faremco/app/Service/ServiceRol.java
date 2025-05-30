package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Rol;
import com.faremco.app.Interface.IRol;

@Service
public class ServiceRol {
    @Autowired
    private IRol iRol;

    public Rol guardarRol(Rol rol) {
        return iRol.save(rol);
    }

    public List<Rol> listarRoles() {
        return (List<Rol>) iRol.findAll();
    }

    public Optional<Rol> buscarRolPorId(long id) {
        return iRol.findById(id);
    }

    public Rol editarRol(Rol rol) {
        return iRol.save(rol);
    }

    public void eliminarRol(long id) {
        iRol.deleteById(id);
    }
}
