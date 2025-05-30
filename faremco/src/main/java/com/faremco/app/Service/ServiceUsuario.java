package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Usuario;
import com.faremco.app.Interface.IUsuario;

@Service
public class ServiceUsuario {
    @Autowired
    private IUsuario iUsuario;

    public Usuario guardarUsuario(Usuario usuario) {
        return iUsuario.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) iUsuario.findAll();
    }

    public Optional<Usuario> buscarUsuarioPorId(long id) {
        return iUsuario.findById(id);
    }

    public Usuario editarUsuario(Usuario usuario) {
        return iUsuario.save(usuario);
    }

    public void eliminarUsuario(long id) {
        iUsuario.deleteById(id);
    }
}
