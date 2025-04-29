package com.java.crud.fullstack.repository;

import com.java.crud.fullstack.entity.TypeCustomer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer, Integer> {

}
