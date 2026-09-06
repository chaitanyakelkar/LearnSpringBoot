package me.chaitanyakelkar.firstspring.service;

import me.chaitanyakelkar.firstspring.model.Customer;
import me.chaitanyakelkar.firstspring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer getCustomer(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()){
            return customerOptional.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with ID=" + id + " Doesnt Exist!");
        }
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(Customer customer, Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()){
            Customer dbCustomer = customerOptional.get();
            dbCustomer.updateCustomer(customer);
            customerRepository.save(dbCustomer);
            return dbCustomer;
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with ID=" + id + " Doesnt Exist!");
        }
    }

    @Override
    public void deleteCustomer(Long id) {
        Optional<Customer> customerOptional = customerRepository.findById(id);
        if (customerOptional.isPresent()){
            customerRepository.deleteById(id);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Customer with ID=" + id + " Doesnt Exist!");
        }
    }

}
