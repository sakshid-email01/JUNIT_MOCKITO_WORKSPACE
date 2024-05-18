package com.example.h2.crud.customer.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.h2.crud.customer.model.Model;

public interface Repository extends CrudRepository<Model, Integer>   {

}
