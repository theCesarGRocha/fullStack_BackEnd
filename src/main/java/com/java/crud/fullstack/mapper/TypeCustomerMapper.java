package com.java.crud.fullstack.mapper;

import com.java.crud.fullstack.dto.TypeCustomerDTO;
import com.java.crud.fullstack.entity.TypeCustomer;

import java.util.ArrayList;
import java.util.List;

public class TypeCustomerMapper {

    public static TypeCustomerDTO toDTORecord(TypeCustomer entity) {
        return new TypeCustomerDTO(entity.getId(), entity.getName(), entity.getCustomers());
    }

    public static List<TypeCustomerDTO> toListDTORecord(List<TypeCustomer> entityList) {
        List<TypeCustomerDTO> dtoList = new ArrayList<TypeCustomerDTO>();
        for (TypeCustomer entity : entityList) {
            dtoList.add(toDTORecord(entity));
        }
        return dtoList;
    }
}
