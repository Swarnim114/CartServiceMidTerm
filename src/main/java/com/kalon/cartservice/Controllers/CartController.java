package com.kalon.cartservice.Controllers;

import com.kalon.cartservice.Models.Cart;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;
@RestController


// ahhahahhahahahahah
public class CartController {
    public void createCart() {

    }
    @PostMapping("/carts")
    public Cart addProductToCart(@RequestBody Long cartId) {
        return null;
    }

    @PostMapping("/carts")

    public Cart  removeProductFromCart(@RequestBody Long cartId) {
          return null;
    }
    @GetMapping("/carts")
    public List<Cart> getAllCart() {
       return null;
    }
    @GetMapping("/carts/{id}")
    public Cart getCartById() {
        return null;
    }
    public void updateCart() {

    }
}
