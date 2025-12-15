drop table ingredient_preparations;
create table ingredient_preparations
(
    id            BIGINT         NOT NULL AUTO_INCREMENT,
    ingredient_id BIGINT         NOT NULL,
    preparation   nvarchar(1000) NOT NULL,
    primary key (id, ingredient_id)
);

drop table recipe_directions;
create table recipe_directions
(
    id        BIGINT         NOT NULL AUTO_INCREMENT,
    recipe_id BIGINT         NOT NULL,
    direction nvarchar(1000) NOT NULL,
    primary key (id, recipe_id)
);

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
