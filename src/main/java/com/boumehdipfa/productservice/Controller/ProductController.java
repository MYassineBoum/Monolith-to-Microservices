package com.boumehdipfa.productservice.Controller;

import com.boumehdipfa.productservice.DTO.ProductRequest;
import com.boumehdipfa.productservice.DTO.ProductResponse;
import com.boumehdipfa.productservice.Service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping("/create")
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @PutMapping("/update/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        productService.updateProduct(id, productRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }

    @GetMapping("/get/{id}")
    public ProductResponse getProduct(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/getAll")
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

}
