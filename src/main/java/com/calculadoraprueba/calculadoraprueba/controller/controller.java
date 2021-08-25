package com.calculadoraprueba.calculadoraprueba.controller;

import com.calculadoraprueba.calculadoraprueba.domain.entity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class controller {

    @GetMapping("/index")
    public String form(Model model){
        model.addAttribute("calculadora", new entity());
        return "index";
    }

    @PostMapping("/result")
    public String postform(@ModelAttribute entity cal, BindingResult result, Model model){
        model.addAttribute("calculadora", cal);
        return "result";
    }
}
