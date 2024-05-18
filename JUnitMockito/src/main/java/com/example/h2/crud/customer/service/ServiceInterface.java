package com.example.h2.crud.customer.service;

import java.util.Collection;
import java.util.Optional;

import com.example.h2.crud.customer.model.Model;

// this service interface contains all the functions/apis declaration 
// this service interface is implemented by the serviceiml class
// which contains all the definitions
// this service interface is autowired in the controller class and used
public interface ServiceInterface {
	
	public abstract Optional<Model> findById(Integer id);
	
//	public abstract void create(Model model);
//	public abstract Collection<Model> read();
//    public abstract void update(int id, Model model);
//    public abstract void delete(int id);
    
}
