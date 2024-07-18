package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AayushController {
        @GetMapping("/msg")
        
        public String show() {
        	return "hello bhai...kya haal chal";
        }
        
        
        
        

        
}
