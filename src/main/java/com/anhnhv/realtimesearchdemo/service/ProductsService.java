package com.anhnhv.realtimesearchdemo.service;

import com.anhnhv.realtimesearchdemo.model.Product;

import java.util.List;

public interface ProductsService {

    List<Product> searchProducts(String query);

    Product createProduct(Product p);
}
