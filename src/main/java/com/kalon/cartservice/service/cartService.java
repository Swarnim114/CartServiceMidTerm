package com.kalon.cartservice.service;

import com.kalon.cartservice.Models.Cart;

import java.util.List;


public interface cartService {
     List<Cart> getAllCart();
     Cart getCartById(Long id);

     void createCart(Cart cart);

     void addProductToCart(Long cartId, Long productId);

     void removeProductFromCart(Long cartId, Long productId);

     void updateCart(Cart cart);
}
