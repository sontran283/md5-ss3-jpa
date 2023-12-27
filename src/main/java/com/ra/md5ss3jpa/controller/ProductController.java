package com.ra.md5ss3jpa.controller;

import com.ra.md5ss3jpa.model.entity.Category;
import com.ra.md5ss3jpa.model.entity.Product;
import com.ra.md5ss3jpa.model.service.category.CategoryService;
import com.ra.md5ss3jpa.model.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/product")
    public String product(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "product/index";
    }

    @GetMapping("/add_product")
    public String addProduct(Model model) {
        List<Category> categoryList = categoryService.findAll();
        Product product = new Product();
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("product", product);
        return "product/add";
    }

    @PostMapping("/add_product")
    public String createProduct(@ModelAttribute("product") Product product) {
        productService.saveOrUpdate(product);
        return "redirect:/product";
    }

    @GetMapping("/edit_product/{id}")
    public String editProduct(@PathVariable("id") Integer id, Model model) {
        List<Category> categoryList = categoryService.findAll();
        Product product = productService.findById(id);
        model.addAttribute("categoryList", categoryList);
        model.addAttribute("product", product);
        return "product/edit";
    }

    @PostMapping("/edit_product/{id}")
    public String updateProduct(@PathVariable("id") Integer id, @ModelAttribute("product") Product product) {
        productService.saveOrUpdate(product);
        return "redirect:/product";
    }

    @GetMapping("/delete_product/{id}")
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.delete(id);
        return "redirect:/product";
    }
}
