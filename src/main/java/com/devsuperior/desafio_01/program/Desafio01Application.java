package com.devsuperior.desafio_01.program;

import com.devsuperior.desafio_01.entities.Order;
import com.devsuperior.desafio_01.services.OrderService;
import com.devsuperior.desafio_01.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.devsuperior.desafio_01"})
public class Desafio01Application implements CommandLineRunner {

    @Autowired
    private OrderService orderService;
    public static void main(String[] args) {
        SpringApplication.run(Desafio01Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Order order = new Order(1034, 150.0, 20.0);
        System.out.println("Pedido código " + order.getCode());
        System.out.println("Valor total: " + orderService.total(order));
    }
}
