package com.emre.service;

import com.emre.dto.request.SaveCustomerRequestDto;
import com.emre.entity.Customer;
import com.emre.exception.ErrorType;
import com.emre.exception.RentACarException;
import com.emre.mapper.ICustomerMapper;
import com.emre.repository.IColorRepository;
import com.emre.repository.ICustomerRepository;
import com.emre.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService extends ServiceManager<Customer, Long> {
    private final ICustomerRepository customerRepository;

    public CustomerService(ICustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    public Customer save(SaveCustomerRequestDto dto) {
        return save(ICustomerMapper.INSTANCE.toCustomer(dto));
    }

    public List<Customer> findAll() {
        List<Customer> customers = customerRepository.findAll();
        if (customers.isEmpty())
            throw new RentACarException(ErrorType.CUSTOMER_NOT_FOUND);
        return customers;
    }

}
