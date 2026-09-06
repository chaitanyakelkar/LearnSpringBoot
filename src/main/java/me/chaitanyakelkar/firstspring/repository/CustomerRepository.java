package me.chaitanyakelkar.firstspring.repository;

import me.chaitanyakelkar.firstspring.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
