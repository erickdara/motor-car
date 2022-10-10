package com.ventas.motor.car.repository;

import com.ventas.motor.car.model.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
