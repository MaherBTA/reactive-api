package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Foo;
import com.example.demo.service.FooService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/")
public class HomeController {

	@Autowired
	private FooService fooService;
	
	@GetMapping(value= "/getall", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<Foo> getAll() {
		return fooService.getAll();
	}
}
