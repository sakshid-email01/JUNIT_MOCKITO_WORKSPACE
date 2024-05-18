package com.example.h2.crud.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.h2.crud.customer.model.Model;
import com.example.h2.crud.customer.repo.Repository;
import com.example.h2.crud.customer.service.ServiceImpl;

@SpringBootTest //required
//name of test class keep it same as actual class
// keep package/file structure same of /main and /test
public class ServiceImplTest {
	
	@InjectMocks // add the file which is to be tested
	ServiceImpl serviceImpl;
	
	@Mock // dependency of actual file to be added as mock
	// mock is done by using java reflection api
	Repository repo;
	
	@Test
	// keep function name same as that of function name
	public void findByIdTest() {
		System.out.println("test executed");
		//creating mock data for test
		when(repo.findById(1)).thenReturn(createModelStub());
		
		//actual function call
		Optional<Model> model = serviceImpl.findById(1);
		
		//checking the expected vs actual value
	    assertEquals(model.get().getName(), "test");
	    //Assertions.assertThat(model).isNotNull();
	    // when(repo.save(Mockito.any(Model.class))).thenReturn(createModelStub());
	  }
	
	//creating mock data for test
	private Optional<Model> createModelStub() {
		Model model = Model.builder().id(1).emailId("test1@one.com").name("test").build();
	    return Optional.of(model);
	}
	
	@Test
	public void IllegalArgumentExceptionTest() {
		when(repo.findById(null)).thenThrow(new IllegalArgumentException());
		
		IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> serviceImpl.findById(null));
		
		assertEquals(illegalArgumentException.getMessage(), null);
	}
	
	//additional when thenReturn is used for serviceImpl test
	// build(), repo.findById(). assert()  direct for daoTest
	
	
	
	
	

}
