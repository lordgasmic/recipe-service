package com.lordgasmic.recipeservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IngredientPreparation {
    private long id;
    private long ingredientId;
    private String preparation;
}
