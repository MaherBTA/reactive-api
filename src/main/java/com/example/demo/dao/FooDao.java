package com.example.demo.dao;

import java.time.Duration;

import org.springframework.stereotype.Component;

import com.example.demo.model.Foo;

import reactor.core.publisher.Flux;

@Component
public class FooDao {
	
	
	
	public Flux<Foo> getAllFoo(){
		return Flux.range(1, 20)
				.delayElements(Duration.ofSeconds(1))
				.doOnNext(i-> System.out.println("processing Foo "+i))
				.map(i->new Foo(i,"Foo "+i));
	}
}
