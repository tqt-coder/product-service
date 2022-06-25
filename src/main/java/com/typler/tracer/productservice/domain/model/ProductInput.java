package com.typler.tracer.productservice.domain.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
@Data
public class ProductInput {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String avatar;
    private Date createDate;
    private Double importPrice;
    private String longDescription;
    private Date modifiedDate;
    private String name;
    private Double price;
    private Integer quantity;
    private String shortDescription;
    private Boolean status;
    private Long branchId;
    private Long categoryId;


}
