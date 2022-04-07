package com.example.CookingProject.repo;

import com.example.CookingProject.models.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientsRepo extends JpaRepository<Ingredients, Long>, JpaSpecificationExecutor<Ingredients> {
    List <Ingredients> findAll();
}
