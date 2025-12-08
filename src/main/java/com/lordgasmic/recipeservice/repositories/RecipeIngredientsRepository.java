package com.lordgasmic.recipeservice.repositories;

import com.lordgasmic.recipeservice.entities.RecipeIngredientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientsRepository extends CrudRepository<RecipeIngredientEntity, Long> {
}
