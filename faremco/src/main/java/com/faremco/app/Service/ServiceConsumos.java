package com.faremco.app.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Consumos;
import com.faremco.app.Interface.IConsumos;

@Service
public class ServiceConsumos {
    @Autowired
    private IConsumos iconsumos;

    public Consumos guardarconsumos(Consumos consumos) {
        return iconsumos.save(consumos);
    }

	public List<Consumos> listarconsumos(){
		return (List<Consumos>)iconsumos.findAll();
	}

    public Optional<Consumos> buscarconsumosPorId(long id) {
        return iconsumos.findById(id);
    }

	 public Consumos editarconsumos(Consumos consumos) {
        return iconsumos.save(consumos);
    }


    public void eliminarconsumos(long id) {
        iconsumos.deleteById(id);
    }   
}
