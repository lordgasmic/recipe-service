package com.lordgasmic.recipeservice.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeIngredientsRepository extends CrudRepository<RecipeIngredientsRepository, Long> {
}
