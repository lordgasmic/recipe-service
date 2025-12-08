package com.lordgasmic.recipeservice.mappers;

import com.lordgasmic.recipeservice.entities.IngredientPreparationEntity;
import com.lordgasmic.recipeservice.models.IngredientPreparation;

public final class IngredientPreparationMapper {

    private IngredientPreparationMapper() {
        // intentionally left blank
    }

    public static IngredientPreparation toIngredientPreparation(final IngredientPreparationEntity entity) {
        return IngredientPreparation.builder()
                .id(entity.getId())
                .ingredientId(entity.getIngredientId())
                .preparation(entity.getPreparation())
                .build();
    }
}
