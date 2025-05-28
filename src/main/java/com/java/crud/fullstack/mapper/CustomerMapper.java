package com.java.crud.fullstack.mapper;

import com.java.crud.fullstack.dto.CustomerDTO;
import com.java.crud.fullstack.entity.Customer;

import java.util.ArrayList;
import java.util.List;


public class CustomerMapper {

    public static CustomerDTO toDTORecord(Customer entity) {
        return new CustomerDTO(entity.getId(), entity.getFirstName(),
                entity.getLastName(), entity.getEmail(), entity.getBirthDate(), entity.getTypeCustomer());
    }

    public static List<CustomerDTO> toListDTORecord(List<Customer> listEntity) {
        List <CustomerDTO> dtos = new ArrayList<CustomerDTO>();
        for(Customer entity : listEntity){
            dtos.add(toDTORecord(entity));
        }
        return dtos;
    }

}
