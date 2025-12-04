package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class RecipeIngredientPK implements Serializable {

    private long recipeId;
    private long id;
}
