package io.github.c0diguin.productsapi.productsapi.controller;

import io.github.c0diguin.productsapi.productsapi.model.Product;
import io.github.c0diguin.productsapi.productsapi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        var id = UUID.randomUUID().toString();
        product.setId(id);

        productRepository.save(product);
        return product;
    }

    @GetMapping("/{id}")
    public Product getProductByID (@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProductByID (@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }
}
