package com.kalon.cartservice.Models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private Long id;
    private String Title;
    private String Description;
    private double price;

    private String imageUrl;

}
