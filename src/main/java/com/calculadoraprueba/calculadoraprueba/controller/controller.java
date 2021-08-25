package com.calculadoraprueba.calculadoraprueba.controller;

import domain.calculadora;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {

    @GetMapping("/index")
    public String form(Model model){
        model.addAttribute("calculadora", new calculadora());
        return "index";
    }

    @PostMapping("/result")
    public String postform(@ModelAttribute calculadora cal, BindingResult result, Model model){
        model.addAttribute("calculadora", cal);
        return "result";
    }
}
