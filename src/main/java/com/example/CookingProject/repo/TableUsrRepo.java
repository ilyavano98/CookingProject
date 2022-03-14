package com.example.CookingProject.repo;

import com.example.CookingProject.models.TableUsr;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableUsrRepo extends JpaRepository<TableUsr, Long> {
    TableUsr findByUsername(String username);
}
