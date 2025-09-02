package com.challange.project.services;

import org.springframework.stereotype.Service;

import com.challange.project.entities.Order;

/*
 * José Augusto Scherer - 2025/09/02
 */

@Service
public class ShippingService {

    public double shipment ( Order order ) {
        if ( order.getBasic() <= 100.00 ) {
            return 20.00;
        } else if ( order.getBasic() > 100.00 && order.getBasic() <= 200.00 ) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}
