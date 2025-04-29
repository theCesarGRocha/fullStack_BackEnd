package com.java.crud.fullstack.service;

import com.java.crud.fullstack.entity.Customer;
import com.java.crud.fullstack.exception.ResourceNotFoundException;
import com.java.crud.fullstack.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        try {
            return customerRepository.save(customer);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return this.customerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("The Customer with ID: " + id + " was Not_Found")
        );
    }

    @Override
    public List<Customer> findAllCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        savedCustomer.setEmail(customer.getEmail());
        savedCustomer.setFirstName(customer.getFirstName());
        savedCustomer.setLastName(customer.getLastName());
        return this.customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        this.customerRepository.deleteById(id);
    }
}
