package com.typler.tracer.productservice.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="image")
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String link;
    private Long productId;
}
