package com.devsuperior.desafio_01.services;

import com.devsuperior.desafio_01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double shipmentTax = 0.0;
        if (order.getBasic() < 100) {
            shipmentTax = 20.0;
        } else if (order.getBasic() <= 200) {
            shipmentTax = 12;
        }
        return shipmentTax;
    }
}