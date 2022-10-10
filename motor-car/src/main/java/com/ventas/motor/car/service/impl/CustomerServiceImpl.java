package com.ventas.motor.car.service.impl;

import com.ventas.motor.car.model.entities.Customer;
import com.ventas.motor.car.model.entities.Employee;
import com.ventas.motor.car.repository.CustomerRepository;
import com.ventas.motor.car.repository.EmployeeRepository;
import com.ventas.motor.car.service.CustomerService;
import com.ventas.motor.car.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(long id) {
        Optional<Customer> optional = customerRepository.findById(id);
        Customer customer = null;
        if (optional.isPresent()){
            customer = optional.get();
        }else {
            throw new RuntimeException("Employee not found for id :: " + id);
        }
        return customer;
    }

    @Override
    public void deleteCustomerById(long id) {
        this.customerRepository.deleteById(id);
    }
}
