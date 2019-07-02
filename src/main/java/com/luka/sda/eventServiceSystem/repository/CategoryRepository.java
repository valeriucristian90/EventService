package com.luka.sda.eventServiceSystem.repository;

import com.luka.sda.eventServiceSystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
