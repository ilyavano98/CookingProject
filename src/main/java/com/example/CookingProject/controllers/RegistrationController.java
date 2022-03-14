package com.example.CookingProject.controllers;

import com.example.CookingProject.models.Role;
import com.example.CookingProject.models.TableUsr;
import com.example.CookingProject.repo.TableUsrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;

@Controller
public class RegistrationController {
    @Autowired
    private TableUsrRepo usr_repo;

    @GetMapping("/reg")
    public String regOpen(Model model)
    {
        return "reg";
    }

    @PostMapping("/reg")
    public String addUser(TableUsr user, Model model)
    {
        TableUsr userFromDb = usr_repo.findByUsername(user.getUsername());
        if(userFromDb != null)
        {
            model.addAttribute("message", "Пользоавтель уже существует, используйте другое имя");
            return "reg";
        }

        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        usr_repo.save(user);
        return ("redirect:/loginAccount");
    }
}
