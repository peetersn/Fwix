package com.fwix.api.domain;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author npeeters
 */
public class Category {

    private String name;

    @JsonProperty("category_id")
    private String categoryId;

    public Category(String categoryId, String name) {
        this.categoryId = categoryId;
        this.name = name;
    }

    public Category() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }
}
