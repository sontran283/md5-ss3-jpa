package com.ra.md5ss3jpa.model.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String categoryName;

    @Column(columnDefinition = "boolean default true")
    private boolean status;

    @OneToMany(mappedBy = "category")
    private Set<Product> product;

    public Category() {
    }

    public Category(Long id, String categoryName, boolean status) {
        this.id = id;
        this.categoryName = categoryName;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
