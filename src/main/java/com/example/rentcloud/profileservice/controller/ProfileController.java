package com.example.rentcloud.profileservice.controller;

import com.example.rentcloud.commons.model.Customer;
import com.example.rentcloud.profileservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/services")
public class ProfileController {

    @Autowired
    CustomerService customerService;

    @PostMapping("/profile")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
