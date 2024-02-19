package com.anhnhv.realtimesearchdemo.controller;

import com.anhnhv.realtimesearchdemo.model.Product;
import com.anhnhv.realtimesearchdemo.service.ProductsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {

    private ProductsService productsService;

    @GetMapping("/search")
    public ResponseEntity<List<Product>> searchProducts(@RequestParam("query") String query){

        List<Product> products = productsService.searchProducts(query);

        return ResponseEntity.ok(products);
    }

    @PostMapping("/create")
    public ResponseEntity<Product> createProduct(@RequestBody Product p){

        Product product = productsService.createProduct(p);

        return ResponseEntity.ok(product);
    }
}
