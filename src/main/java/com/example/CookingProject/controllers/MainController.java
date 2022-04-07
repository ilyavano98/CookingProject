package com.example.CookingProject.controllers;

import com.example.CookingProject.models.ComboTable;
import com.example.CookingProject.models.Ingredients;
import com.example.CookingProject.repo.IngredientsRepo;
import com.example.CookingProject.services.ComboTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ComboTableService comboTable;
    @Autowired
    private IngredientsRepo ingredients;

    @GetMapping("/")
    public String firstPageOpen(Model model) {
//        Iterable<ComboTable> combo = comboTable.getAll();
        String str = "Новый текст (проверка Димана)";
        ComboTable comboFind = comboTable.findByComboText(str);
        System.out.println(comboFind.getId());
        String title = "Главная страница";
        String name = "Диман, ты тут?";
//        model.addAttribute("combo", comboFind.getComboText());
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/game")
    public String gameOpen(@RequestParam String firstName, Model model) {
        String title = "Игровая страница";
        List<Ingredients> arIngredients = ingredients.findAll();
        model.addAttribute("title", title);
        model.addAttribute("name", firstName);
        model.addAttribute("arIngredients", arIngredients);
        return "game";
    }

    @GetMapping("/reit")
    public String openReit(Model model) {
        String title = "Страница рейтинга";
        String name = "тут таблица рейтинга";
        model.addAttribute("title", title);
        model.addAttribute("name", name);
        return "reit";
    }

//    @GetMapping("/loginAccount")
//    public String loginAccountPageOpen(Model model) {
//        String title = "Вход в личный кабинет";
//        String name = "тут тело страницы входа";
//        model.addAttribute("title", title);
//        model.addAttribute("name", name);
//        return "loginAccount";
//    }

//    @GetMapping("/reg")
//    public String regPageOpen(Model model) {
//        String title = "Регистрация";
//        String name = "тут тело страницы регистрации";
//        model.addAttribute("title", title);
//        model.addAttribute("name", name);
//        return "reg";
//    }

//    @GetMapping("/out")
//    public String outPage(Model model) {
//        String title = "Страница обработки выхода с аккаунта";
//        String name = "а эта тсраница будет скваозная, потому что ее код будет выполняться в джаве";
//        model.addAttribute("title", title);
//        model.addAttribute("name", name);
//        return "out";
//    }

}