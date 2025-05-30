package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.Categoria;

public interface ICategoria extends CrudRepository<Categoria, Long> {
    
}
