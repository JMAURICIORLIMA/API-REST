package com.github.jmauriciorlima.repository;

import com.github.jmauriciorlima.domain.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
