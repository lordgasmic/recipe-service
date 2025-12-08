INSERT INTO recipes (name, description)
VALUES ('Hamburger Potato Casserole', NULL);

set
@last_recipe_id = LAST_INSERT_ID();

INSERT INTO recipe_ingredients (recipe_id, quantity, uom, ingredient)
VALUES (@last_recipe_id, '1', 'pound', 'lean ground beef'),
       (@last_recipe_id, '1', '(10.5 ounce) can', 'condensed cream of mushroom soup'),
       (@last_recipe_id, '¾', 'cup', 'milk'),
       (@last_recipe_id, '½', 'cup', 'chopped onion'),
       (@last_recipe_id, 'to taste', NULL, 'salt'),
       (@last_recipe_id, 'to taste', NULL, 'ground black pepper'),
       (@last_recipe_id, '3', 'cups', 'potatoes'),
       (@last_recipe_id, '1', 'cup', 'shredded Cheddar cheese');

-- NOTE: This requires knowing the specific auto-generated 'id' for 'peeled and thinly sliced potatoes'
-- in the recipe_ingredients table. Assuming it is 7 for demonstration purposes.

INSERT INTO ingredient_preparations (ingredientId, preparation)
VALUES (7, 'peeled and thinly sliced');
