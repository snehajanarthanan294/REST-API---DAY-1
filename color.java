package com.example.demo;
import  org.springframework.web.bind.annotation.*;


	
	@RestController
	public class color {
		
		@RequestMapping(value="/MyFav/{color}",method=RequestMethod.GET)
		public String getMyFav(@PathVariable String color)
		{
			return "My favorite color is "+color;
		}
}

