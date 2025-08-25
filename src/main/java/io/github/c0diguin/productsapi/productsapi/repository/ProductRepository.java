package io.github.c0diguin.productsapi.productsapi.repository;

import io.github.c0diguin.productsapi.productsapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
