package com.tuto.demo.general;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }

    @GetMapping("/about")
    public String getAbout(){
        return "about";
    }
    @GetMapping("/contact")
    public String getContact(){
        return "contact";
    }
}
