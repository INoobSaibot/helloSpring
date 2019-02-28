package com.manifestcorp.helloSpringts.repos;

import org.springframework.data.repository.CrudRepository;
import com.manifestcorp.helloSpringts.model.Customer;
import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer>findAll();
}