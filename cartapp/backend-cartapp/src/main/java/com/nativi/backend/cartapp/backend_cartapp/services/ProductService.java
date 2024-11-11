package com.nativi.backend.cartapp.backend_cartapp.services;
import java.util.List;

import com.nativi.backend.cartapp.backend_cartapp.entities.Product;

public interface ProductService {
    List<Product> findAll();
}
