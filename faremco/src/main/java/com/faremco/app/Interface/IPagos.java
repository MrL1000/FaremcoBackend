package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.Pagos;

public interface IPagos extends CrudRepository<Pagos, Long> {
    
}
