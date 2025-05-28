package com.java.crud.fullstack.Controller;

import com.java.crud.fullstack.dto.TypeCustomerDTO;
import com.java.crud.fullstack.entity.TypeCustomer;
import com.java.crud.fullstack.service.TypeCustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/types")
@CrossOrigin(origins = "http://localhost:4200")
public class TypeCustomerController {
    private final TypeCustomerService typeCustomerService;

    public TypeCustomerController(TypeCustomerService typeCustomerService) {
        this.typeCustomerService = typeCustomerService;
    }

    @GetMapping
    public List<TypeCustomerDTO> getAllTypesCustomer() {
        return this.typeCustomerService.findAllTypeCustomers();
    }

    @GetMapping("{idTypeCustomer}")
    public TypeCustomerDTO getById(@PathVariable("idTypeCustomer") Integer idTypeCustomer) {
        return this.typeCustomerService.findTypeCustomerById(idTypeCustomer);
    }

}
