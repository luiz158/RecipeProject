package com.example.RecipeProject.repository;

import com.example.RecipeProject.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
