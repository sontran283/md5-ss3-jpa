package com.ra.md5ss3jpa.repository;

import com.ra.md5ss3jpa.model.entity.Category;
import com.ra.md5ss3jpa.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepositoy extends JpaRepository<Product, Integer> {
}
