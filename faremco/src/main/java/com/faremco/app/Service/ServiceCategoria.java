package com.faremco.app.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Entity.Categoria;
import com.faremco.app.Interface.ICategoria;


@Service
public class ServiceCategoria{
    
    @Autowired
    private ICategoria icategoria;

    public Categoria guardarcategoria(Categoria categoria) {
        return icategoria.save(categoria);
    }

	public List<Categoria> listarcategoria(){
		return (List<Categoria>)icategoria.findAll();
	}

    public Optional<Categoria> buscarcategoriaPorId(long id) {
        return icategoria.findById(id);
    }

	 public Categoria editarcategoria(Categoria categoria) {
        return icategoria.save(categoria);
    }


    public void eliminarcategoria(long id) {
        icategoria.deleteById(id);
    }
    
}