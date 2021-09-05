package com.eliseubrito.ecommerce.productcatalog.repository;

import com.eliseubrito.ecommerce.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
