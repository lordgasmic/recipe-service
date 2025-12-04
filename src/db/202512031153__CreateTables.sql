create table recipes
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name varchar(255) not null,
    description text,
    primary key (id)
);

create table recipe_ingredients
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    recipe_id BIGINT NOT NULL,
    quantity nvarchar(100) NOT NULL,
    uom nvarchar(50),
    ingredient nvarchar(255) NOT NULL,
    primary key (id, recipe_id)
);

create table ingredient_preparations
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    ingredientId BIGINT NOT NULL,
    preparation nvarchar(100) NOT NULL,
    primary key (id, ingredientId)
);

create table recipe_directions
(
    id BIGINT NOT NULL AUTO_INCREMENT,
    recipeId BIGINT NOT NULL,
    direction nvarchar(100) NOT NULL,
    primary key (id, recipeId)
);
