package com.ra.md5ss3jpa.model.service.product;

import com.ra.md5ss3jpa.model.entity.Category;
import com.ra.md5ss3jpa.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();

    Product saveOrUpdate(Product product);

    Product findById(Integer id);

    void delete(Integer id);
}
