package com.java.crud.fullstack.dto;

import com.java.crud.fullstack.entity.Customer;

import java.util.List;

public record TypeCustomerDTO(Long id, String name, List<Customer> customers) {

}

