package com.lordgasmic.recipeservice.controllers;

import com.lordgasmic.recipeservice.models.Direction;
import com.lordgasmic.recipeservice.models.Ingredient;
import com.lordgasmic.recipeservice.models.IngredientPreparation;
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
        return ResponseEntity.ok(buildTestData());

//        return ResponseEntity.ok(recipeService.getAllRecipes());
    }

    @GetMapping("/api/v1/recipes/{id}")
    public ResponseEntity<RecipeResponse> getRecipeById(@PathVariable final long id) {
        final List<RecipeResponse> recipes = buildTestData();
        return ResponseEntity.ok(
            recipes.stream()
                   .filter(r -> r.getId() == id)
                   .findFirst()
                   .orElse(null)
        );

//        return ResponseEntity.ok(recipeService.getRecipeById(id));
    }

    private static List<RecipeResponse> buildTestData() {
        return List.of(
            RecipeResponse.builder()
                          .id(1L)
                          .name("Spaghetti Bolognese")
                          .description("A classic Italian pasta dish with rich meat sauce.")
                          .ingredients(List.of(Ingredient.builder().recipeId(1L).id(1L).ingredient("Noods").quantity("1").uom("pound").build(),
                                               Ingredient.builder().recipeId(1L).id(2L).ingredient("Sauce").quantity("1").uom("jar").build()))
                          .directions(List.of(Direction.builder().recipeId(1L).id(1L).direction("boil, add sauce").build()))
                          .build(),
            RecipeResponse.builder()
                          .id(2L)
                          .name("Chicken Curry")
                          .description("A flavorful curry dish with tender chicken pieces.")
                          .ingredients(
                              List.of(Ingredient.builder().recipeId(2L).id(3L).ingredient("chicken").quantity("1").uom("pound").preparations(List.of(
                                          IngredientPreparation.builder().id(1L).ingredientId(3L).preparation("shredded and cooked").build())).build(),
                                      Ingredient.builder().recipeId(2L).id(4L).ingredient("curry sauce").quantity("1").uom("jar").build()))
                          .directions(List.of(Direction.builder().id(2L).recipeId(2L).direction("mix ingredients").build()))
                          .build(),
            RecipeResponse.builder()
                          .id(3L)
                          .name("Salad of the Dolor Sit Amet")
                          .description(
                              "This vibrant salad is a testament to the principle of Dolor Sit Amet, delivering a complex interplay of textures and sharp, yet fleeting, flavors. It is perfect for a summer consectetur gathering or a light, reflective lunch. The key is in the preparation of the Eiusmod dressing, which must be vigorously shaken until the Adipiscing oil fully emulsifies with the Elit vinegar, providing the necessary 'burn' to the otherwise mild ingredients.")
                          .ingredients(
                              List.of(Ingredient.builder().recipeId(3L).id(5L).ingredient("Sed microgreens").quantity("2").uom("cups").build(),
                                      Ingredient.builder()
                                                .recipeId(3L)
                                                .id(6L)
                                                .ingredient("Do cucumber, ribbon-sliced")
                                                .quantity("1")
                                                .uom("medium")
                                                .build(),
                                      Ingredient.builder().recipeId(3L).id(7L).ingredient("Toasted Tempor nuts").quantity("1/2").uom("cup").build(),
                                      Ingredient.builder()
                                                .recipeId(3L)
                                                .id(8L)
                                                .ingredient("Crumbled Incididunt goat cheese")
                                                .quantity("1/4")
                                                .uom("cup")
                                                .build()))
                          .directions(List.of(Direction.builder().id(3L).recipeId(3L).direction("mix ingredients").build()))
                          .build(),
            RecipeResponse.builder()
                          .id(4L)
                          .name("Quisque Vel Viverra Placerat (Seared Fillets)")
                          .description(
                              "A hearty main course, the Quisque Vel Viverra Placerat is a lesson in patience and high heat. The goal is to achieve a deep, Non Proident crust while keeping the interior a perfect, shimmering Culpa medium-rare. The reduction sauce, built from caramelized Excepteur shallots and a reduction of robust Occaecat red wine, provides a dark counterpoint to the buttery texture of the meat. A sprig of Sunt in rosemary is the traditional garnish, symbolizing the Officia of the chef.")
                          .ingredients(
                              List.of(Ingredient.builder()
                                                .recipeId(4L)
                                                .id(9)
                                                .ingredient("Quis beef tenderloin fillets")
                                                .quantity("4 (6oz)")
                                                .uom("")
                                                .build(),
                                      Ingredient.builder().recipeId(4L).id(10).ingredient("Nostrud butter").quantity("2").uom("tbsp").build(),
                                      Ingredient.builder()
                                                .recipeId(4L)
                                                .id(11)
                                                .ingredient("Exercitation grapeseed oil")
                                                .quantity("1")
                                                .uom("tbsp")
                                                .build(),
                                      Ingredient.builder()
                                                .recipeId(4L)
                                                .id(12)
                                                .ingredient("epteur shallots, finely diced")
                                                .quantity("2")
                                                .uom("large")
                                                .build()))
                          .directions(List.of(Direction.builder().id(4L).recipeId(4L).direction("mix ingredients").build()))
                          .build(),
            RecipeResponse.builder()
                          .id(5L)
                          .name("Fugiat Nulla Pariatur Pudding")
                          .description(
                              "This dessert is characterized by its unsettling yet intriguing name, the Fugiat Nulla Pariatur Pudding. It's a rich, custardy bake that thrives on contradiction: a dense, warm base topped with a cold, smooth Pariatur whipped cream. The infusion of Voluptate citrus zest cuts through the sweetness, ensuring the final product avoids the Velit heaviness often associated with such recipes. The texture should be akin to a Cillum cloud. Serve immediately before the Magna effect fades.")
                          .ingredients(
                              List.of(Ingredient.builder().recipeId(5).id(13).ingredient("heavy Voluptate cream").quantity("1").uom("cup").build(),
                                      Ingredient.builder().recipeId(5).id(14).ingredient("Velit granulated sugar").quantity("1/2").uom("cup").build(),
                                      Ingredient.builder().recipeId(5).id(15).ingredient("Cillum egg yolks").quantity("4").uom("large").build(),
                                      Ingredient.builder()
                                                .recipeId(5)
                                                .id(16)
                                                .ingredient("Laboris vanilla extract")
                                                .quantity("1/4")
                                                .uom("tsp")
                                                .build()))
                          .directions(List.of(Direction.builder().id(5L).recipeId(5L).direction("mix ingredients").build()))
                          .build()
        );
    }
}
