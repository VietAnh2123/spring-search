package com.anhnhv.realtimesearchdemo.service;

import com.anhnhv.realtimesearchdemo.model.Product;
import com.anhnhv.realtimesearchdemo.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductsServiceImpl implements ProductsService{

    private ProductRepository productRepository;

    @Override
    public List<Product> searchProducts(String query) {

        List<Product> list = productRepository.searchProducts(query);

        return list;
    }

    @Override
    public Product createProduct(Product p) {
        Product product = productRepository.save(p);
        return product;
    }
}
