package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class ProductRepository {

    private final List<Product> products = List.of(
            new Product(801, 501, "Standard", "Standard Confernence Ticket", new BigDecimal("499.00")),
            new Product(802, 501, "Premium", "Premium Conference Ticket", new BigDecimal("899.00")),
            new Product(803, 502, "Standard", "Developer Day Ticket", new BigDecimal("299.00")),
            new Product(804, 502, "Regular", "Regular Entrance", new BigDecimal("199.00")),
            new Product(805, 503, "VIP", "VIP Bonus Entrance", new BigDecimal("399.00")));

    public List<Product> findByEventId(int eventId){
        return products.stream().filter(product -> product.eventId() == eventId).toList();
    }

}

