package com.lordgasmic.recipeservice.services;

import com.lordgasmic.recipeservice.entities.RecipeEntity;
import com.lordgasmic.recipeservice.mappers.RecipeMapper;
import com.lordgasmic.recipeservice.models.RecipeResponse;
import com.lordgasmic.recipeservice.repositories.RecipesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RecipeService {

    private final RecipesRepository recipesRepository;

    public RecipeService(final RecipesRepository recipesRepository) {
        this.recipesRepository = recipesRepository;
    }

    public List<RecipeResponse> getAllRecipes() {
        final Iterable<RecipeEntity> entities = recipesRepository.findAll();
        final List<RecipeResponse> recipes = new ArrayList<>();
        for (final RecipeEntity entity : entities) {
            recipes.add(RecipeMapper.toRecipeResponse(entity));
        }
        return recipes;
    }

    public RecipeResponse getRecipeById(final long id) {
        final Optional<RecipeEntity> entity = recipesRepository.findById(id);
        return entity.map(RecipeMapper::toRecipeResponse).orElse(null);
    }
}
