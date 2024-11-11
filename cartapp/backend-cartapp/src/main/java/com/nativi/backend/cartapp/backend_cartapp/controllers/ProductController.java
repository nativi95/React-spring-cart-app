package com.nativi.backend.cartapp.backend_cartapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.nativi.backend.cartapp.backend_cartapp.entities.Product;
import com.nativi.backend.cartapp.backend_cartapp.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public List<Product> list(){
        return productService.findAll();
    }
}
