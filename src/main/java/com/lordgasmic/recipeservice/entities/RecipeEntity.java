package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "recipes_vw")
public class RecipeEntity {

    @Id
    private long id;

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeIngredientEntity> ingredients;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeDirectionEntity> directions;
}
