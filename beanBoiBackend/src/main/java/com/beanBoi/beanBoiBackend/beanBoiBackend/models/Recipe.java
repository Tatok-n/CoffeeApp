package com.beanBoi.beanBoiBackend.beanBoiBackend.models;

import lombok.Data;

@Data
public class Recipe {
    private String id;
    private String name;
    private String description;
    private long duration;
    private float ratio;
}
