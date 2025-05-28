package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.PagosDetalle;

public interface IPagosDetalle extends CrudRepository<PagosDetalle, Long> {
    
}
