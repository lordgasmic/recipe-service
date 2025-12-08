package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "recipes_vw")
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String description;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeIngredientEntity> ingredients;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RecipeDirectionEntity> directions;
}
