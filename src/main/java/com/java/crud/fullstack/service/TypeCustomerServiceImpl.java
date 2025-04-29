package com.java.crud.fullstack.service;

import com.java.crud.fullstack.entity.TypeCustomer;
import com.java.crud.fullstack.exception.ResourceNotFoundException;
import com.java.crud.fullstack.repository.TypeCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    private final TypeCustomerRepository typeCustomerRepository;

    public TypeCustomerServiceImpl(TypeCustomerRepository typeCustomerRepository) {
        this.typeCustomerRepository = typeCustomerRepository;
    }

    @Override
    public List<TypeCustomer> findAllTypeCustomers() {
        return this.typeCustomerRepository.findAll();

    }

    @Override
    public TypeCustomer findTypeCustomerById(Integer id) {
//        return  this.typeCustomerRepository.findById(id).orElseThrow(
//                () -> new ResourceNotFoundException("The Type Customer with ID: " + id + " was Not_Found")
//        );
        TypeCustomer t = this.typeCustomerRepository.findById(id).get();
        t.getCustomers();
        return t;
    }

}
