package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Habitaciones;
import com.faremco.app.Interface.IHabitaciones;

@Service
public class ServiceHabitaciones {
    @Autowired
    private IHabitaciones iHabitaciones;

    public Habitaciones guardarHabitaciones(Habitaciones habitaciones) {
        return iHabitaciones.save(habitaciones);
    }

    public List<Habitaciones> listarHabitaciones() {
        return (List<Habitaciones>) iHabitaciones.findAll();
    }

    public Optional<Habitaciones> buscarHabitacionesPorId(long id) {
        return iHabitaciones.findById(id);
    }
    public Habitaciones editarHabitaciones(Habitaciones habitaciones) {
        return iHabitaciones.save(habitaciones);
    }
    public void eliminarHabitaciones(long id) {
        iHabitaciones.deleteById(id);
    }
}
