package com.lordgasmic.recipeservice.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Direction {
    private long id;
    private String direction;
}
