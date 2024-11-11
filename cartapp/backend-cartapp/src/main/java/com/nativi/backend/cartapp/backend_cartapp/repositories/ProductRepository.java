package com.nativi.backend.cartapp.backend_cartapp.repositories;

import org.springframework.data.repository.CrudRepository;
import com.nativi.backend.cartapp.backend_cartapp.entities.Product;


public interface ProductRepository extends CrudRepository<Product,Long> {

}
