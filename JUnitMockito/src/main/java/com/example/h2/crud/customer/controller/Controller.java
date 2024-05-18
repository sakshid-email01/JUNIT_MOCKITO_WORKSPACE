package com.example.h2.crud.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.h2.crud.customer.model.Model;
import com.example.h2.crud.customer.service.ServiceInterface;

@RestController
public class Controller {
	
	@Autowired
	ServiceInterface customerService;
	
	@GetMapping(value = "/findById/{id}")
	   public ResponseEntity<Object> findById(@PathVariable("id") Integer id) {
	      return new ResponseEntity<>(customerService.findById(id), HttpStatus.OK);
	}
	
	
//	@PostMapping("/create")
//	public ResponseEntity<Object> create(@RequestBody Model model) {
//		customerService.create(model);
//		return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
//	}
//	
//	@GetMapping(value = "/findAll")
//	   public ResponseEntity<Object> read() {
//	      return new ResponseEntity<>(customerService.read(), HttpStatus.OK);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//	   public ResponseEntity<Object> delete(@PathVariable("id") int id) {
//		 customerService.delete(id);
//	      return new ResponseEntity<>("Product is deleted successsfully", HttpStatus.OK);
//	}
//	
//	@PatchMapping("/update/{id}")
//	   public ResponseEntity<Object> update(@PathVariable("id") int id, @RequestBody Model model) {
//	      customerService.update(id, model);
//	      return new ResponseEntity<>("Product is updated successsfully", HttpStatus.OK);
//	   }

}
