package com.tdeCastro.customer;

import org.springframework.stereotype.Service;

@Service
public record CustomerService (CustomerRepository customerRepository){
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // TODO: 6/20/2024 some email checks
        customerRepository.save(customer);
    }
}
