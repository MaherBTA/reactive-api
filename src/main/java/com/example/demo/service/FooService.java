package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.FooDao;
import com.example.demo.model.Foo;

import reactor.core.publisher.Flux;

@Service
public class FooService {

	@Autowired
	private FooDao fooDao;
	
	public Flux<Foo> getAll(){
		return fooDao.getAllFoo();
	}
	
}
