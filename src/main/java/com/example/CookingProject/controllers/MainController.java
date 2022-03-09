package com.example.CookingProject.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String greeting(Model model) {
        String title = "Главная страница";
        String name = "Диман, ты тут?";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "index";
    }

}