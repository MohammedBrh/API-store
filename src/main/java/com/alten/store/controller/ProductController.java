package com.alten.store.controller;

import com.alten.store.dto.ProcductDto;
import com.alten.store.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private  ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    // Get all products as DTOs
    @GetMapping
    public List<ProcductDto> getAllProducts() {
        return productService.getAllProducts();
    }

    // Get a product by ID as DTO
    @GetMapping("/{id}")
    public ResponseEntity<ProcductDto> getProductById(@PathVariable Long id) {
        Optional<ProcductDto> productDTO = productService.getProductById(id);
        return productDTO.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Create a new product
    @PostMapping
    public ResponseEntity<ProcductDto> createProduct(@RequestBody ProcductDto productDTO) {
        ProcductDto savedProduct = productService.saveOrUpdateProduct(productDTO);
        return ResponseEntity.ok(savedProduct);
    }

    // Update an existing product by ID
    @PutMapping
    public ResponseEntity<ProcductDto> updateProductById( @RequestBody ProcductDto productDTO) {
        Optional<ProcductDto> existingProduct = productService.getProductById(productDTO.getId());
        if (existingProduct.isPresent()) {
            ProcductDto updatedProduct = productService.saveOrUpdateProduct(productDTO);
            return ResponseEntity.ok(updatedProduct);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Delete a product by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProductById(@PathVariable Long id) {
        Optional<ProcductDto> productDTO = productService.getProductById(id);
        if (productDTO.isPresent()) {
            productService.deleteProductById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
