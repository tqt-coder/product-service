package com.typler.tracer.productservice.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductInput {

    private Long id;
    @NotNull(message = "The avatar is required")
    private String avatar;
    @NotNull(message = "The create_date is required")
    private Date createDate;
    @NotNull(message = "The import_price is required")
    private Double importPrice;
    @NotNull(message = "The long_description is required")
    private String longDescription;
    @NotNull(message = "The modified_date is required")
    private Date modifiedDate;
    @NotNull(message = "The name is required")
    private String name;
    @NotNull(message = "The price is required")
    private Double price;
    @NotNull(message = "The quantity is required")
    private Integer quantity;
    @NotNull(message = "The short_description is required")
    private String shortDescription;
    @NotNull(message = "The status is required")
    private Boolean status;
    @NotNull(message = "The branch_id is required")
    private Long branchId;
    @NotNull(message = "The category_id is required")
    private Long categoryId;


}
