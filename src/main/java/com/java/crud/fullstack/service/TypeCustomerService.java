package com.java.crud.fullstack.service;

import com.java.crud.fullstack.dto.TypeCustomerDTO;

import java.util.List;

public interface TypeCustomerService {

    List<TypeCustomerDTO> findAllTypeCustomers();
    TypeCustomerDTO findTypeCustomerById(Integer id);
}
