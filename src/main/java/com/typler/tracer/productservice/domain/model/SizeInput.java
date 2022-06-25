package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="size")
@Data
public class SizeInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long productId;
}
