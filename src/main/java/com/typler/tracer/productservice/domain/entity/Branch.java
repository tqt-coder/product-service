package com.typler.tracer.productservice.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="branch")
@Data
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String name;
}
