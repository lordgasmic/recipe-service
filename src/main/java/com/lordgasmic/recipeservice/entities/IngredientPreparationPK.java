package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class IngredientPreparationPK implements Serializable {
    private long ingredientId;
    private long id;
}
