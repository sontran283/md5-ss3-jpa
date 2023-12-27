package com.ra.md5ss3jpa.repository;

import com.ra.md5ss3jpa.model.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
