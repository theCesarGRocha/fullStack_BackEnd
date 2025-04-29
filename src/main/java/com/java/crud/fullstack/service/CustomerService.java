package com.java.crud.fullstack.service;

import com.java.crud.fullstack.entity.Customer;

import java.util.List;


public interface CustomerService {

    Customer save(Customer customer);
    Customer findCustomerById(Integer id);
    List<Customer> findAllCustomers();
    Customer updateCustomer(Customer customer);
    void deleteCustomerById(Integer id);
}
