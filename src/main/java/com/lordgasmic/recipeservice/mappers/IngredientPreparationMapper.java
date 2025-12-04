package com.lordgasmic.recipeservice.mappers;

import com.lordgasmic.recipeservice.entities.IngredientPreparationEntity;
import com.lordgasmic.recipeservice.models.IngredientPreparation;

public final class IngredientPreparationMapper {

    private IngredientPreparationMapper() {
        // intentionally left blank
    }

    public static IngredientPreparation toIngredientPreparation(IngredientPreparationEntity entity) {
        return IngredientPreparation.builder()
                                    .id(entity.getIngredientPreparationPK().getId())
                                    .preparation(entity.getPreparation())
                                    .build();
    }
}
