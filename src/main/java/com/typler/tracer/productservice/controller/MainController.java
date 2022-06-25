package com.typler.tracer.productservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController extends BaseController {
//    @Autowired
//    private ProductService productService;
//
//    @PostMapping("/products")
//    public ResponseEntity<?> insertProduct(@RequestBody @Valid ProductFieldIdDTO productDTO, BindingResult bindingResult) throws Exception {
//
//        if (bindingResult.hasErrors()) {
//            Map<String, String> objectError = new HashMap<>();
//            bindingResult.getFieldErrors().forEach(x -> objectError.put(x.getField(), x.getDefaultMessage()));
//            return toExceptionResult(objectError.toString(), 400);
//        } else {
//            ProductDTO product = productService.saveProduct(productDTO);
//            return toSuccessResult(product, "Insert product successfully");
//        }
//
//    }
//
//    @DeleteMapping("/products/{id}")
//    public ResponseEntity<?> deleteProduct(@PathVariable("id") Integer id) throws Exception {
//        Boolean result = productService.deleteProduct(id);
//        if (result) {
//            return toSuccessResult("", "Delete product with product_id: " + id + " successfully");
//        }
//        return toExceptionResult("The product id: " + id + " not find database", 404);
//    }
//
//    @PutMapping("/products")
//    public ResponseEntity<?> updateProduct(@RequestBody @Valid ProductFieldIdDTO productDTO, BindingResult bindingResult) throws Exception {
//        if (bindingResult.hasErrors()) {
//            Map<String, String> objectError = new HashMap<>();
//            bindingResult.getFieldErrors().forEach(x -> objectError.put(x.getField(), x.getDefaultMessage()));
//            return toExceptionResult(objectError.toString(), 400);
//        } else {
//            ProductEntity pe = productService.findProductById(productDTO.getProduct_id());
//            if (pe != null) {
//                ProductDTO product = productService.saveProduct(productDTO);
//                return toSuccessResult(product, "Update product successfully");
//
//            } else {
//                return toExceptionResult("The product id: " + productDTO.getProduct_id() + " not find database", 404);
//            }
//        }
//    }
//
//    @PostMapping("/products/filter")
//    public ResponseEntity<?> findProductByFilter(@RequestBody ObjectRequest request) throws Exception {
//
//        return toSuccessResult(productService.findProductByFilter(request), "Find product by filters successfully");
//
//    }


}
