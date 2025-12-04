package com.lordgasmic.recipeservice.models;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Ingredient {
    private long id;
    private String quantity;
    private String uom;
    private String ingredient;
    private List<IngredientPreparation> preparations;
}
