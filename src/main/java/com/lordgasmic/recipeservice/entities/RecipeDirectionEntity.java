package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name = "recipe_directions_vw")
public class RecipeDirectionEntity {

    @EmbeddedId
    private RecipeDirectionPK recipeDirectionPK;
    private String direction;
}
