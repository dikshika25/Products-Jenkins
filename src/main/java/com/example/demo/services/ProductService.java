package com.example.demo.services;

import com.example.demo.entities.Product;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

public interface ProductService {

    public  Iterable<Product> findAll();

    public List<Product> search(int s);

    public Product find(int id);

    public Product save(Product product);

    public void delete(int id);

    public Product updateTopic(Product product);

}
