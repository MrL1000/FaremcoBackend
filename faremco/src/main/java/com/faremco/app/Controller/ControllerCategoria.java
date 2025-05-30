package com.faremco.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faremco.app.Entity.Categoria;
import com.faremco.app.Service.ServiceCategoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/categoria")
public class ControllerCategoria {
    @Autowired
    private ServiceCategoria serviceCategoria;

    @GetMapping("/list")
    public List<Categoria> listaCategorias() {
        return serviceCategoria.listarcategoria();
    }

    @PostMapping("/add")
    public Categoria guardarCategoria(@RequestBody Categoria c) {
        return serviceCategoria.guardarcategoria(c);
    }
    
    
}
