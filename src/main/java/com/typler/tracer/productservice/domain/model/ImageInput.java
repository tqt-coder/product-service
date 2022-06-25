package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="image")
@Data
public class ImageInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String link;
    private Long productId;
}
