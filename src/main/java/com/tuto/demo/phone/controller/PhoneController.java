package com.tuto.demo.phone.controller;

import com.tuto.demo.phone.services.PhoneService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class PhoneController {

    @Autowired
    PhoneService phoneService;
    @GetMapping("/brand")
    public String getBrandPage(Model model ){
        return "Brand";
    }
}
