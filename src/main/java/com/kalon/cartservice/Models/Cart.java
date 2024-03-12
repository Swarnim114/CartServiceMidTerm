package com.kalon.cartservice.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Cart {
    private Long id;
    private Long userId;
    private  String date;
    private List<Products> cartItems;


}
