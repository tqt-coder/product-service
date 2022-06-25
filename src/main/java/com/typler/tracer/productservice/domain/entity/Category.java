package com.typler.tracer.productservice.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="category")
@Data
public class Category
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
