package com.example.RecipeProject.repository;

import com.example.RecipeProject.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
