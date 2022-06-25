package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="branch")
@Data
public class BranchInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private String name;
}
