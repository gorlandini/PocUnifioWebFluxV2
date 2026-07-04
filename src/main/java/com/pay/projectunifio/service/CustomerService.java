package com.pay.projectunifio.service;

import com.pay.projectunifio.model.Customer;
import com.pay.projectunifio.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Mono<Customer> create(Customer c){
        return customerRepository.save(c)
                .doOnNext(saved -> System.out.println("SALVO: " + saved));
    }


    public Flux<Customer> findAll() {
        return customerRepository.findAll();
    }
}
