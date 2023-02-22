package com.example.demo;
import  org.springframework.web.bind.annotation.*;


@RestController
public class namegettry {
	
	@RequestMapping(value = "/name/{name}",method = RequestMethod.GET)
	
	public String getName(@PathVariable String name)
	{
		return "hello " + name;
	}
	
	

}
