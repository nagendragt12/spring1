package com.javtechie.springbootcrudexample.service;

import com.javtechie.springbootcrudexample.repository.ProductRepository;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.PublicKey;
import java.util.List;

@Service
public class productservice {
    @Autowired
    private ProductRepository repository;
    public ProductRepository saveProductRepository(ProductRepository productRepository){
         return repository.save(productRepository);

    }
    public List<ProductRepository> saveProductRepositorys(List<ProductRepository> productRepositorys){
        return repository.saveAll(productRepositorys);
    }
    public List<ProductRepository> getProduct(){
        return repository.findAll();
    }
    public ProductRepository geProductByid(int id){
        return repository.findById(id).orElse(null);
    }
    public ProductRepository geProductByName(String name){
        return repository.findByName(name);
    }
    public String deteleProduct(int id){
        repository.deleteById(id);
        return"product remove !!"+id;
    }
    public updateProduct(ProductRepository Product){
        Product existingProduct=repository.findById(Product.getId()).orElse(null);
        existingProduct.setName(Product.getName());
        existingProduct.setQuantity(Product.getQunatity());
        existingProduct.SetPrice(Product.getPrice());
        return repository.save(existingProduct);

    }

}
