package com.devsuperior.desafio_01.services;

import com.devsuperior.desafio_01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        return (order.getBasic() - (order.getBasic() * order.getDescount()) / 100) + shippingService.shipment(order);
    }
}
