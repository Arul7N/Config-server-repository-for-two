package com.example.productservice.Service;

import com.example.productservice.Entity.Product;
import com.example.productservice.Respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> allProducts(){
        return repository.findAll();
    }

    public Product newProduct(Product product){
        return repository.save(product);
    }

}
