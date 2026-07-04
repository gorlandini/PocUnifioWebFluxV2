package com.pay.projectunifio.controller;

import com.pay.projectunifio.model.Customer;
import com.pay.projectunifio.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/customers")
public class CustomerController {

    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping()
    public Mono<Customer> create(@RequestBody Customer c){
        System.out.println("CHEGOU NO CONTROLLER");
        return customerService.create(c);
    }

    @GetMapping
    public Flux<Customer> listAll(){
        return customerService.findAll();
    }


}
