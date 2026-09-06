package me.chaitanyakelkar.firstspring.service;

import me.chaitanyakelkar.firstspring.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer getCustomer(Long id);
    List<Customer> getAllCustomer();
    Customer updateCustomer(Customer customer, Long id);
    void deleteCustomer(Long id);
}
