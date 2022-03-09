package com.example.CookingProject.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/")
    public String firstPagaOpen(Model model) {
        String title = "Главная страница";
        String name = "Диман, ты тут?";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/game")
    public String gameOpen(@RequestParam String firstName, Model model) {
        String title = "Игровая страница";
        model.addAttribute("title", title);
        model.addAttribute("name", firstName);
        return "game";
    }

    @GetMapping("/reit")
    public String openReit(Model model) {
        String title = "Страница рейтинга";
        String name = "тут таблица рейтинга";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "game";
    }

    @GetMapping("/reg")
    public String regPageOpen(Model model) {
        String title = "Регистрация";
        String name = "тут тело страницы выхода";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "reg";
    }

    @GetMapping("/out")
    public String outPage(Model model) {
        String title = "Страница обработки выхода с аккаунта";
        String name = "а эта тсраница будет скваозная, потому что ее код будет выполняться в джаве";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "out";
    }

}