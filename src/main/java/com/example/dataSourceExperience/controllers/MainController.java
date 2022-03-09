package com.example.dataSourceExperience.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        String title = "Главная страница";
        String name = "Ты тут я тут у нас кулинария";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "index";
    }

}