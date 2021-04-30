package com.example.nutrition.repository;

import com.example.nutrition.datasousce.model.Nutricionista;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutricionistaReository extends JpaRepository<Nutricionista, Long> {
}
