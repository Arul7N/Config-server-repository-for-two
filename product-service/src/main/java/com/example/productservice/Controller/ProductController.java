package com.example.productservice.Controller;

import com.example.productservice.Entity.Product;
import com.example.productservice.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Product> findAll(){
        return service.allProducts();
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody Product product){
        service.newProduct(product);
        return "Product Created...";
    }


}
