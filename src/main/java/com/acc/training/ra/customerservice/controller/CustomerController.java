package com.acc.training.ra.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
 
    @GetMapping("/health")
	public String health() {
		return "Alive and kicking";
    }
    
}
