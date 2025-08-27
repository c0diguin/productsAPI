package io.github.c0diguin.productsapi.productsapi.repository;

import io.github.c0diguin.productsapi.productsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    
    List<Product>findByName(String name);
}
