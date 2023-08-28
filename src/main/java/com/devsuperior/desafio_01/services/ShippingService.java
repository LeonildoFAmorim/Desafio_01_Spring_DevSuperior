package com.devsuperior.desafio_01.services;

import com.devsuperior.desafio_01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double shipmentTax = order.getBasic() < 100 ? 20.0 : order.getBasic() <= 200 ? 12.0 : 0.0;
        return shipmentTax;
    }
}