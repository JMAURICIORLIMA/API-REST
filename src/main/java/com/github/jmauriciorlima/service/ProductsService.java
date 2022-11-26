package com.github.jmauriciorlima.service;

import com.github.jmauriciorlima.domain.Products;
import com.github.jmauriciorlima.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    public List<Products> productsList() {
        return productsRepository.findAll();
    }

    @Transient
    public Optional<Products> productsById(long id) {
        return productsRepository.findById(id);
    }

    public Products productsSave(Products products) {
        return productsRepository.save(products);
    }
}
