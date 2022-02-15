package com.example.MyCloudyStoreApplication.service;

import com.example.MyCloudyStoreApplication.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProductService {
    List<Product> getAllProduct();

    void updateProduct(Product product);

    void removeProductById(long id);

    Optional<Product> getProductById(long id);

    List<Product> getAllProductByCategoryId(int id);
}
