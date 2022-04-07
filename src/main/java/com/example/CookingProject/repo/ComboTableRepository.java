package com.example.CookingProject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.CookingProject.models.ComboTable;

import java.util.List;


@Repository
public interface ComboTableRepository extends JpaRepository<ComboTable, Long>, JpaSpecificationExecutor<ComboTable> {
    @Query(value = "SELECT * FROM combo_table c WHERE c.combo_text = :name",
                nativeQuery = true)
    ComboTable findByComboText(@Param("name") String name);

//    @Query(value = "SELECT * FROM combo_table", nativeQuery = true)
    List <ComboTable> findAll();
}