package com.example.CookingProject.controllers;
import com.example.CookingProject.models.ComboTable;
import com.example.CookingProject.repo.ComboTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    private ComboTableRepository comboTable;

    @GetMapping("/")
    public String firstPageOpen(Model model) {
        Iterable<ComboTable> combo = comboTable.findAll();
        String title = "Главная страница";
        String name = "Диман, ты тут?";
        model.addAttribute("combo", combo);
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

//    @GetMapping("/loginAccount")
//    public String loginAccountPageOpen(Model model) {
//        String title = "Вход в личный кабинет";
//        String name = "тут тело страницы входа";
//        model.addAttribute("title", title);
//        model.addAttribute("name", name);
//        return "loginAccount";
//    }

    @GetMapping("/reg")
    public String regPageOpen(Model model) {
        String title = "Регистрация";
        String name = "тут тело страницы регистрации";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "reg";
    }

//    @GetMapping("/out")
//    public String outPage(Model model) {
//        String title = "Страница обработки выхода с аккаунта";
//        String name = "а эта тсраница будет скваозная, потому что ее код будет выполняться в джаве";
//        model.addAttribute("title", title);
//        model.addAttribute("name", name);
//        return "out";
//    }

}