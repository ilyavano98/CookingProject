package com.example.CookingProject.controllers;

import com.example.CookingProject.models.CombinationNameRequest;
import com.example.CookingProject.models.ComboTable;
import com.example.CookingProject.services.ComboTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class FindComboController {
    @Autowired
    private ComboTableService comboTable;

    @PostMapping(value="/findController",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity find(@RequestBody CombinationNameRequest reguest)
    {
        String result = reguest.getName();
        ComboTable findСomdo = comboTable.findByComboText(result);
//        System.out.println(findСomdo.getName_combo());
        if(findСomdo != null)
        {
            return ResponseEntity.status(HttpStatus.OK).body(findСomdo);
        }
//        return ResponseEntity.badRequest().build();
        else
        return ResponseEntity.ok(HttpStatus.NOT_FOUND);
    }
}
