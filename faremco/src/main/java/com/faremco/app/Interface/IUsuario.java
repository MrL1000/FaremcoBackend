package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Long> {
    
}
