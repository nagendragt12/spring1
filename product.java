package com.javtechie.springbootcrudexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="PRODUCT_TBL")

public class product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int quantity;
    private double price;

}
