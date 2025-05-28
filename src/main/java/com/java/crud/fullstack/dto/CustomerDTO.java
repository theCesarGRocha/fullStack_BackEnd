package com.java.crud.fullstack.dto;

import com.java.crud.fullstack.entity.TypeCustomer;

import java.util.Date;

public record CustomerDTO(
        Integer id,
        String firstName,
        String lastName,
        String email,
        Date birthDate,
        TypeCustomer typeCustomer
) {}
