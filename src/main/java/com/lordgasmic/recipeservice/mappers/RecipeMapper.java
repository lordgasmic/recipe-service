package com.lordgasmic.recipeservice.mappers;

import com.lordgasmic.recipeservice.entities.RecipeEntity;
import com.lordgasmic.recipeservice.models.RecipeResponse;

public final class RecipeMapper {

    private RecipeMapper() {
        // intentionally left blank
    }

    public static RecipeResponse toRecipeResponse(final RecipeEntity recipeEntity) {
        return RecipeResponse.builder()
                             .id(recipeEntity.getId())
                             .name(recipeEntity.getName())
                             .description(recipeEntity.getDescription())
                             .ingredients(recipeEntity.getIngredients().stream().map(IngredientMapper::toIngredient).toList())
                             .directions(recipeEntity.getDirections().stream().map(DirectionMapper::toDirection).toList())
                             .build();
    }
}
