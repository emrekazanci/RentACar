package com.emre.controller;

import com.emre.dto.request.SaveCustomerRequestDto;
import com.emre.entity.Customer;
import com.emre.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.emre.constant.EndPointList.*;

@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @PostMapping(SAVE)
    public ResponseEntity<Customer> save(SaveCustomerRequestDto dto) {
        return ResponseEntity.ok(customerService.save(dto));
    }

    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Customer>> findAll() {
        return ResponseEntity.ok(customerService.findAll());
    }

}
