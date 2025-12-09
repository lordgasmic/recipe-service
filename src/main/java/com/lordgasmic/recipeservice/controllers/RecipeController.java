package com.lordgasmic.recipeservice.controllers;

import com.lordgasmic.recipeservice.models.RecipeResponse;
import com.lordgasmic.recipeservice.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {

    private final RecipeService recipeService;

    public RecipeController(final RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/api/v1/recipes")
    public ResponseEntity<List<RecipeResponse>> getRecipes() {
        return ResponseEntity.ok(recipeService.getAllRecipes());
    }

    @GetMapping("/api/v1/recipes/{id}")
    public ResponseEntity<RecipeResponse> getRecipeById(@PathVariable final long id) {
        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }
}
