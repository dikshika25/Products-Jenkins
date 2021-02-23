package com.example.demo.controller;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    @ApiOperation(value="Find product by ID",
            notes="Provide an ID to look up specific product from the product table",
            response= Product.class)
    public  Product findByID(@PathVariable int id){
        return productService.find(id);
    }

    @GetMapping(value="/" )
    public Iterable<Product> getAllProducts()
    {
        return productService.findAll();
    }

    @PostMapping(value = "/")
    public  void addProduct(@Valid @RequestBody Product product){
        productService.save(product);
    }

    @PutMapping(value = "/{id}")
    public  Product updateProduct(@RequestBody Product product){
        return productService.updateTopic(product);
    }

    @DeleteMapping(value = "/{id}")
    public  void deleteProduct(@PathVariable int id){
        productService.delete(id);
    }

}
