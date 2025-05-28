package com.java.crud.fullstack.service;

import com.java.crud.fullstack.dto.TypeCustomerDTO;
import com.java.crud.fullstack.entity.TypeCustomer;
import com.java.crud.fullstack.exception.ResourceNotFoundException;
import com.java.crud.fullstack.mapper.TypeCustomerMapper;
import com.java.crud.fullstack.repository.TypeCustomerRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.MultipartConfigElement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeCustomerServiceImpl implements TypeCustomerService {

    private final TypeCustomerRepository typeCustomerRepository;

    public TypeCustomerServiceImpl(TypeCustomerRepository typeCustomerRepository, MultipartConfigElement multipartConfigElement) {
        this.typeCustomerRepository = typeCustomerRepository;
    }

    @Override
    public List<TypeCustomerDTO> findAllTypeCustomers() {
        List<TypeCustomer> list = this.typeCustomerRepository.findAll();
        return TypeCustomerMapper.toListDTORecord(list);
    }

    @Override
    public TypeCustomerDTO findTypeCustomerById(Integer id) {
        TypeCustomer t = this.typeCustomerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("TypeCustomer no encontrado con id " + id));

        return TypeCustomerMapper.toDTORecord(t);
    }

}
