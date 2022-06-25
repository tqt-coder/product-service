package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="color")
@Data
public class ColorInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String name;
    private Long productId;
}
