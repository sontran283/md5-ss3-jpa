package com.ra.md5ss3jpa.model.service.category;

import com.ra.md5ss3jpa.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();

    Category saveOrUpdate(Category category);

    Category findById(Long id);

    void delete(Long id);
}
