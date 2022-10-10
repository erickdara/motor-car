package com.ventas.motor.car.service;

import com.ventas.motor.car.model.entities.Customer;
import com.ventas.motor.car.model.entities.Employee;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomerById(long id);
    void deleteCustomerById(long id);
}
