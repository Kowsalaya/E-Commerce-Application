package com.example.MyCloudyStoreApplication.service.impl;

import com.example.MyCloudyStoreApplication.entity.Product;
import com.example.MyCloudyStoreApplication.repository.ProductRepository;
import com.example.MyCloudyStoreApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }//findAll

    public void updateProduct(Product product) {
        productRepository.save(product);
    }//add or update (although pri-key)

    public void removeProductById(long id) {
        productRepository.deleteById(id);
    }//delete access to pri-key

    public Optional<Product> getProductById(long id) {
        return productRepository.findById(id);
    }//search by id

    public List<Product> getAllProductByCategoryId(int id) {
        return productRepository.findAllByCategory_Id(id);
    }
    //findList by ProductDTO.categoryId

}
