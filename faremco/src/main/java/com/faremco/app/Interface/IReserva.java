package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.Reserva;

public interface IReserva extends CrudRepository<Reserva, Long> {
    
}
