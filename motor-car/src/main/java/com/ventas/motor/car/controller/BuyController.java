package com.ventas.motor.car.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.ventas.motor.car.model.entities.Buy;
import com.ventas.motor.car.service.BuyService;

@Controller
public class BuyController {
   
	@Autowired
	private BuyService buyService;
	 
	   @PostMapping("/saveBuy")
	    public String saveBuy(@ModelAttribute("buy") @Valid Buy buy , BindingResult result){
	       
	        if(result.hasErrors()){
	            return "buy_vehicule";
	        }
	        buyService.saveBuy(buy);
	        return "redirect:/buys";
	    }
	 
	    @GetMapping("/Buy")
	    public String verFormCompra(Model model){
	        return "buy_vehicule";
	    }
}
