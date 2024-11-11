package com.nativi.backend.cartapp.backend_cartapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import com.nativi.backend.cartapp.backend_cartapp.entities.Product;
import com.nativi.backend.cartapp.backend_cartapp.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll(){
       return (List<Product>) productRepository.findAll();
    }
}
