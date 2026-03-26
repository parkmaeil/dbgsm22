package com.example.webapp.view;
import java.math.BigDecimal;

record ProductCatalogItem( 
    long productId,
    String name,
    String description,
    String category,
    String brand,
    BigDecimal price
) {
}