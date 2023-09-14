package com.javtechie.springbootcrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductRepository,Integer> {
}
