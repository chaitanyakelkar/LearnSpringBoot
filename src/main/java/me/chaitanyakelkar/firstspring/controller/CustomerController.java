package me.chaitanyakelkar.firstspring.controller;

import me.chaitanyakelkar.firstspring.model.Customer;
import me.chaitanyakelkar.firstspring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.createCustomer(customer), HttpStatus.CREATED);
    }

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getAllCustomer(){
        return new ResponseEntity<>(customerService.getAllCustomer(), HttpStatus.OK);
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id){
        return new ResponseEntity<>(customerService.getCustomer(id), HttpStatus.OK);
    }

    @PutMapping("/customer/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Long id, @RequestBody Customer customer){
        return new ResponseEntity<>(customerService.updateCustomer(customer, id), HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("Customer with id=" + id + " deleted successfully!", HttpStatus.OK);
    }
}
