package com.java.crud.fullstack.service;

import com.java.crud.fullstack.entity.Customer;
import com.java.crud.fullstack.dto.CustomerDTO;


import java.util.List;


public interface CustomerService {

    CustomerDTO save(Customer customer);
    CustomerDTO findCustomerById(Integer id);
    List<CustomerDTO> findAllCustomers();
    CustomerDTO updateCustomer(Customer customer);
    void deleteCustomerById(Integer id);
}
