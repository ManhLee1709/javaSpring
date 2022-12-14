package com.tutorial.controller;

import com.tutorial.models.Product;
import com.tutorial.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/Products")
public class ProductController {
    @Autowired//DI= Dependency Injection
    private ProductRepository repository;

    @GetMapping//this request is: "http://localhost:8080/api/v1/Products"
    List<Product> getAllProducts() {
        return repository.findAll();//where is data?
        //you can also send request using postman
    }
}
