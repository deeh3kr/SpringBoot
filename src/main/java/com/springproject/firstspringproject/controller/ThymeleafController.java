package com.springproject.firstspringproject.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class ThymeleafController {

    @GetMapping("/about")
    public String about(Model model){
        System.out.println("About page called");

        List<String> names = List.of("Ankit", "Jatin", "Karan");
        model.addAttribute("listName", names);
        model.addAttribute("name", "Deepanshu");
        model.addAttribute("CurrentDate", new Date().toLocaleString());
        return "about";
    }
    
}
