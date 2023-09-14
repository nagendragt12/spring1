package com.javtechie.springbootcrudexample.controller;

import com.javtechie.springbootcrudexample.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class productController {
    @Autowired
    private ProductRepository service;
    @PostMapping("/addProduct")
    public ProductRepository addProduct(@RequestBody ProductRepository){
        return service.serviceProductRepository(ProductRepository);

    }@PostMapping("/addProducts")
    public List< ProductRepository> addProduct(@RequestBody List<ProductRepository> Products){
        return service.serviceProduct(Products);

    }
    @GetMapping("/Products")
    public List<ProductRepository> findAllProducts(){
        return service.getservice();
    }@GetMapping("/Product/{id}")
    public productController findProductByid( @PathVariable int id){
        return service.getProductByid(id);
    }@GetMapping("/Product/{name}")
    public productController findProductName(@PathVariable String name){
        return service.getProductName(name);
    }
    @PutMapping("/addProduct")
    public ProductRepository UpdateProduct(@RequestBody ProductRepository) {
        return service.updateProductRepository(ProductRepository);
    }
    @DeleteMapping("/Delete{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteProduct(id);
    }

    }
