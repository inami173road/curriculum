package sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	@GetMapping("/")
	public String getHello(){
		System.out.println("helloが返されます");
		return "hello";
	}
		
}
