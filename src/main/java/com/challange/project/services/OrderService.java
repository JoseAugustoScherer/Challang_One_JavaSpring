package com.challange.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challange.project.entities.Order;

/*
 * José Augusto Scherer - 2025/09/02
 */

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    double total = 0.0;
    double discount = 0.0;
    double basicWithDiscount = 0.0;

    public double total ( Order order ) {
        discount = order.getDiscount() / 100;
        basicWithDiscount = order.getBasic() * ( 1 - discount );
        total = shippingService.shipment ( order ) + basicWithDiscount;
        return total;
    }
}
