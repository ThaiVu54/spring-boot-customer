package com.example.customerspringboot.repository;

import com.example.customerspringboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long> {


}
