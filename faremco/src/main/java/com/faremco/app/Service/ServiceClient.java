package com.faremco.app.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.faremco.app.Interface.IClient;
import com.faremco.app.Entity.Client;

@Service
public class ServiceClient {
    
    @Autowired
    private IClient icliente;

    public Client guardarclientes(Client cliente) {
        return icliente.save(cliente);
    }

	public List<Client> listarclientes(){
		return (List<Client>)icliente.findAll();
	}

    public Optional<Client> buscarclientePorId(long id) {
        return icliente.findById(id);
    }

	 public Client editarcliente(Client cliente) {
        return icliente.save(cliente);
    }


    public void eliminarcliente(long id) {
        icliente.deleteById(id);
    }
    
}
