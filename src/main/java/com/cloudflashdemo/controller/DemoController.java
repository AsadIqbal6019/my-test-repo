package com.cloudflashdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
	
	@GetMapping("/demo")
    public String sayHello(){
        
        return "Hello-Asad Iqbal";
    }


}
	
	


