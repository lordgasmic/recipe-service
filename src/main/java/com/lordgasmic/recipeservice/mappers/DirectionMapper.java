package com.lordgasmic.recipeservice.mappers;

import com.lordgasmic.recipeservice.entities.RecipeDirectionEntity;
import com.lordgasmic.recipeservice.models.Direction;

public final class DirectionMapper {

    private DirectionMapper() {
        // intentionally left blank
    }

    public static Direction toDirection(final RecipeDirectionEntity entity) {
        return Direction.builder()
                .id(entity.getId())
                .recipeId(entity.getRecipeId())
                .direction(entity.getDirection())
                .build();
    }
}
