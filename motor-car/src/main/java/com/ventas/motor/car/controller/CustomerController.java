package com.ventas.motor.car.controller;

import com.ventas.motor.car.model.entities.Customer;
import com.ventas.motor.car.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/customers/")
//localhost:8080/customers/saveCustomer
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") @Valid Customer customer , BindingResult result){
        //Save customer to database
        if(result.hasErrors()){
            return "register_customer";
        }
        customerService.saveCustomer(customer);
        return "redirect:/";
    }

    @GetMapping("/showNewCustomerForm")
    public String showNewEmployeeForm(Model model){
        // create model attribute to bind form data
        Customer employee = new Customer();
        model.addAttribute("customer", employee);
        return "register_customer";
    }

    @GetMapping("cliente")
    public String verFormCliente(){
        return "register_customer";
    }
}
