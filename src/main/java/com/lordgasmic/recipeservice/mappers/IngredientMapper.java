package com.lordgasmic.recipeservice.mappers;

import com.lordgasmic.recipeservice.entities.RecipeIngredientEntity;
import com.lordgasmic.recipeservice.models.Ingredient;

public final class IngredientMapper {

    private IngredientMapper() {
        // intentionally left blank
    }

    public static Ingredient toIngredient(final RecipeIngredientEntity entity) {
        return Ingredient.builder()
                .id(entity.getId())
                .recipeId(entity.getRecipeId())
                .quantity(entity.getQuantity())
                .uom(entity.getUom())
                .ingredient(entity.getIngredient())
                .preparations(entity.getPreparations()
                        .stream()
                        .map(IngredientPreparationMapper::toIngredientPreparation)
                        .toList())
                .build();
    }
}
