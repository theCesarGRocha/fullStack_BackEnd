package com.java.crud.fullstack.service;

import com.java.crud.fullstack.entity.TypeCustomer;

import java.util.List;

public interface TypeCustomerService {

    List<TypeCustomer> findAllTypeCustomers();
    TypeCustomer findTypeCustomerById(Integer id);
}
