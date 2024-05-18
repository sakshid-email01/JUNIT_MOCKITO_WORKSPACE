package com.example.h2.crud.customer.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.h2.crud.customer.model.Model;
import com.example.h2.crud.customer.repo.Repository;

@Service
public class ServiceImpl implements ServiceInterface{
	@Autowired
	Repository repo;
	
	public Optional<Model> findById(Integer id) {
		try {
			Optional<Model> model = repo.findById(id);
			return model;
		}
		catch(IllegalArgumentException e) {
			throw e;
		}
	}

//	@Override
//	public void create(Model model) {
//		repo.save(model);
//	}
//
//	@Override
//	public Collection<Model> read() {	
//		return (Collection<Model>) repo.findAll();
//	}
//
//	@Override
//	public void update(int id, Model model) {
//	    repo.save(model);
//	}
//
//	@Override
//	public void delete(int id) {
//		repo.deleteById(id);
//	}

	
}
