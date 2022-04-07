package com.example.CookingProject.services;

import com.example.CookingProject.models.ComboTable;
import com.example.CookingProject.repo.ComboTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor//аннотация от Ломбок
public class ComboTableService {
    private final ComboTableRepository comboTableRepo;

    public List<ComboTable> getAll(){
        return comboTableRepo.findAll(); //реализовали метод внедренного бина
    }
    public void save(ComboTable comboTable) {
        comboTableRepo.save(comboTable);
    }

    public ComboTable findByComboText(String name) {
        return comboTableRepo.findByComboText(name);
    }

    public List<ComboTable> findAll() {
        return comboTableRepo.findAll();
    }
}
