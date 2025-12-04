package com.lordgasmic.recipeservice.repositories;

import com.lordgasmic.recipeservice.entities.RecipeDirectionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeDirectionsRepository extends CrudRepository<RecipeDirectionEntity, Long> {
}
