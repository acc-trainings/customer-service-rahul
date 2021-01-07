package com.acc.training.ra.customerservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @GetMapping("/health")
    public String health() {
        return "Alive and kicking";
    }

    /*
    @Override
    public ResponseEntity<Customer> getCustomer(String ID) {
        // TODO Auto-generated method stub
        Customer cust = new Customer();
        cust.setId("12345");
        cust.setCustomerName("Rahul");
        cust.setCustomerId("12345");
        cust.setCustomerAddress("250 Main");
        return ResponseEntity.status(HttpStatus.OK).body(cust);
    }*/



    
    
}
