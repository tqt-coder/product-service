package com.typler.tracer.productservice.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="size")
@Data
public class Size {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long productId;
}
