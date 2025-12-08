package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "recipe_ingredients_vw")
public class RecipeIngredientEntity {

    @EmbeddedId
    private RecipeIngredientPK recipeIngredientPK;

    private String quantity;

    private String uom;

    private String ingredient;

    @OneToMany(cascade = CascadeType.ALL)
    private List<IngredientPreparationEntity> preparations;
}
