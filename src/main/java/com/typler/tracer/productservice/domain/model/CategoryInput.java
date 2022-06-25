package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="category")
@Data
public class CategoryInput
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
}
