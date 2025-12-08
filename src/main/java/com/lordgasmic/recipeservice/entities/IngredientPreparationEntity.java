package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ingredient_preparations_vw")
public class IngredientPreparationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long ingredientId;
    private String preparation;
}
