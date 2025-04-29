package com.java.crud.fullstack.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="typeCustomer")
public class TypeCustomer {
    @Id
    private Long id;
    private String name;

    @OneToMany(mappedBy = "typeCustomer", fetch = FetchType.LAZY)
    @JsonBackReference
    private List<Customer> customers;

}
