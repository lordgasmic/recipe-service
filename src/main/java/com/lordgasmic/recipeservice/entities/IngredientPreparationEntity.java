package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity(name = "ingredient_preparations_vw")
public class IngredientPreparationEntity {

    @EmbeddedId
    private IngredientPreparationPK ingredientPreparationPK;
    private String preparation;
}
