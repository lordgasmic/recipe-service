package com.lordgasmic.recipeservice.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "recipe_directions_vw")
public class RecipeDirectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "recipe_id")
    private long recipeId;
    private String direction;
}
