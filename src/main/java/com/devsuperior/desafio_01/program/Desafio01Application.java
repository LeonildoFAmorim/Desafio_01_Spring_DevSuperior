package com.devsuperior.desafio_01.program;

import com.devsuperior.desafio_01.entities.Order;
import com.devsuperior.desafio_01.services.OrderService;
import com.devsuperior.desafio_01.services.ShippingService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 95.90, 0.0);
        System.out.println("Pedido código " + order.getCode());
        OrderService orderService = new OrderService(new ShippingService());
        System.out.println("Valor total: " + orderService.total(order));
    }
}
