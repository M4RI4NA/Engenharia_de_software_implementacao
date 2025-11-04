package com.unit.Unilock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class HomeController {

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("mensagem", "Bem Vindo ao sistema!");
        return "index";
    }

    public String receberFormulario(@RequestParam String nome, Model model){
        model.addAttribute("mensagem", "olá " + nome + "!");
        return "index";
    }

}
