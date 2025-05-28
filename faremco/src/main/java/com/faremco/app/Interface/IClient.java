package com.faremco.app.Interface;
import org.springframework.data.repository.CrudRepository;
import com.faremco.app.Entity.Client;

public interface IClient extends CrudRepository<Client, Long>{
}   