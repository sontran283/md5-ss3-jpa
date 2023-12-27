package com.ra.md5ss3jpa.model.service.product;

import com.ra.md5ss3jpa.model.entity.Category;
import com.ra.md5ss3jpa.model.entity.Product;
import com.ra.md5ss3jpa.repository.CategoryRepository;
import com.ra.md5ss3jpa.repository.ProductRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepositoy productRepositoy;

    @Override
    public List<Product> findAll() {
        return productRepositoy.findAll();
    }

    @Override
    public Product saveOrUpdate(Product product) {
        return productRepositoy.save(product);
    }

    @Override
    public Product findById(Integer id) {
        Optional<Product> productOptional = productRepositoy.findById(id);
        return productOptional.orElse(null);
    }

    @Override
    public void delete(Integer id) {
        productRepositoy.deleteById(id);
    }
}
