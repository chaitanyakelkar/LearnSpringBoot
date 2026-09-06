package me.chaitanyakelkar.firstspring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.jspecify.annotations.NonNull;

@Entity
public class Customer {
    @Id
    private Long Id;
    private String firstName;
    private String lastName;
    private String email;
    private String phonenumber;

    public Customer() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void updateCustomer(@NonNull Customer customer){
        this.setFirstName(customer.getFirstName());
        this.setLastName(customer.getLastName());
        this.setEmail(customer.getEmail());
        this.setPhonenumber(customer.getPhonenumber());
    }
}
