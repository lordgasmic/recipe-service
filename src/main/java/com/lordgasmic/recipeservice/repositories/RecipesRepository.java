package com.lordgasmic.recipeservice.repositories;

import com.lordgasmic.recipeservice.entities.RecipeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipesRepository extends CrudRepository<RecipeEntity, Long> {
}
