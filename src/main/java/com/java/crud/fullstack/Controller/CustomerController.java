package com.java.crud.fullstack.Controller;

import com.java.crud.fullstack.dto.CustomerDTO;
import com.java.crud.fullstack.entity.Customer;
import com.java.crud.fullstack.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save")
    public CustomerDTO saveCustomer(@RequestBody Customer customer){
        return this.customerService.save(customer);

    }

    @GetMapping
    public List<CustomerDTO> getAllCustomers() {
        return this.customerService.findAllCustomers();
    }

    @GetMapping("/{idCustomer}")
    public CustomerDTO getById(@PathVariable("idCustomer") Integer id) {
        return this.customerService.findCustomerById(id);
    }

    @PutMapping("/update")
    public CustomerDTO updateCustomer(@RequestBody Customer customer){
        return this.customerService.save(customer);
    }

    @DeleteMapping("/delete/{idCustomer}")
    public void deleteCustomerById(@PathVariable("idCustomer") Integer id) {
        this.customerService.deleteCustomerById(id);
    }

}
