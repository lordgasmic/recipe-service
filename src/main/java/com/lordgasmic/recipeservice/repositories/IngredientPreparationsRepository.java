package com.lordgasmic.recipeservice.repositories;

import com.lordgasmic.recipeservice.entities.IngredientPreparationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientPreparationsRepository extends CrudRepository<IngredientPreparationEntity, Long> {
}
