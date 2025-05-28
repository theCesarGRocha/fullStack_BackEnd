package com.java.crud.fullstack.service;

import com.java.crud.fullstack.dto.CustomerDTO;
import com.java.crud.fullstack.entity.Customer;
import com.java.crud.fullstack.exception.ResourceNotFoundException;
import com.java.crud.fullstack.mapper.CustomerMapper;
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
    public CustomerDTO save(Customer customer) {
        try {
            Customer c = customerRepository.save(customer);
            return CustomerMapper.toDTORecord(c);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public CustomerDTO findCustomerById(Integer id) {
        Customer c = this.customerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("The Customer with ID: " + id + " was Not_Found")
        );
        return CustomerMapper.toDTORecord(c);
    }

    @Override
    public List<CustomerDTO> findAllCustomers() {
        List<Customer> cs = this.customerRepository.findAll();
        return CustomerMapper.toListDTORecord(cs);
    }

    @Override
    public CustomerDTO updateCustomer(Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        savedCustomer.setEmail(customer.getEmail());
        savedCustomer.setFirstName(customer.getFirstName());
        savedCustomer.setLastName(customer.getLastName());
        Customer c = this.customerRepository.save(customer);
        return CustomerMapper.toDTORecord(c);
    }

    @Override
    public void deleteCustomerById(Integer id) {
        this.customerRepository.deleteById(id);
    }
}
