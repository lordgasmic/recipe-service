package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "recipe_ingredients_vw")
public class RecipeIngredientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "recipe_id")
    private long recipeId;

    private String quantity;

    private String uom;

    private String ingredient;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ingredient_id")
    private List<IngredientPreparationEntity> preparations;
}
