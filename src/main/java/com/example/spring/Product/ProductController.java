package com.example.spring.Product;

import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public Iterable<Product> getAllProducts() {
        Product p1 = new Product("Apple", 213);
        Product p2 = new Product("ASF", 653);
        Product p3 = new Product("NBSAA", 23);
        productService.saveProduct(p1);
        productService.saveProduct(p2);
        productService.saveProduct(p3);
        return productService.getAllProducts();
    }

    @DeleteMapping("product/d/{Id}")
    public void deleteProduct(@PathVariable("Id") Integer id) {
        productService.deleteProduct(id);
    }

    @PostMapping("/product")
    public void saveBook(@RequestBody Product product) {
        productService.saveProduct(product);
    }
}
