package com.symum.major.service;

import com.symum.major.model.Product;
import com.symum.major.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    // To get all the product list
    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    // To Add Product
    public void addProduct(Product product){
        productRepository.save(product);
    }

    // To remove product
    public void removeProductById(long id){
        productRepository.deleteById(id);
    }

    // To see the product
    public Optional<Product> getProductById(long id){
        return productRepository.findById(id);
    }

    //
    public List<Product> getAllProductsCategory(int id){
        return productRepository.findAllByCategory_Id(id);
    }
}
