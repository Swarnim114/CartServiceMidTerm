package com.kalon.cartservice.service;

import com.kalon.cartservice.Models.Cart;

import java.util.List;

public class FakeStoreCartService implements  cartService{
    @Override
    public List<Cart> getAllCart() {
        return null;
    }

    @Override
    public Cart getCartById(Long id) {
        return null;
    }

    @Override
    public void createCart(Cart cart) {

    }

    @Override
    public void addProductToCart(Long cartId, Long productId) {

    }

    @Override
    public void removeProductFromCart(Long cartId, Long productId) {

    }

    @Override
    public void updateCart(Cart cart) {

    }
}
