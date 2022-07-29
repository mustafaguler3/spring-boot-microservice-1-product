package com.example.microservice.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name",nullable = false,length = 100)
    private String name;
    @Column(name = "price",nullable = false,length = 100)
    private Double price;
    @Column(name = "create_time",nullable = false,length = 100)
    private LocalDateTime createTime;
}



























