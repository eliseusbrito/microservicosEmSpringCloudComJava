package com.eliseubrito.ecommerce.shoppingcart.repository;

import com.eliseubrito.ecommerce.shoppingcart.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
