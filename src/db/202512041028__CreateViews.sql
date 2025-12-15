create or replace view recipes_vw as
select *
from recipes;
grant SELECT, INSERT , UPDATE, DELETE
    on recipe_db.recipes_vw to 'recipe_user'@'%';

create or replace view recipe_ingredients_vw as
select *
from recipe_ingredients;
grant SELECT, INSERT , UPDATE, DELETE
    on recipe_db.recipe_ingredients_vw to 'recipe_user'@'%';

create or replace view ingredient_preparations_vw as
select *
from ingredient_preparations;
grant SELECT, INSERT , UPDATE, DELETE
    on recipe_db.ingredient_preparations_vw to 'recipe_user'@'%';

create or replace view recipe_directions_vw as
select *
from recipe_directions;
grant SELECT, INSERT , UPDATE, DELETE
    on recipe_db.recipe_directions_vw to 'recipe_user'@'%';

FLUSH PRIVILEGES;
