package com.github.jmauriciorlima.controller;

import com.github.jmauriciorlima.domain.Products;
import com.github.jmauriciorlima.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping
    public List<Products> productsList() {
        return productsService.productsList();
    }

    @GetMapping(value = "/{id}")
    public Optional<Products> productsById(@PathVariable(value = "id") long id){
        return productsService.productsById(id);
    }

    @PostMapping
    public Products productsSave(@RequestBody Products products){
        return productsService.productsSave(products);
    }


}
