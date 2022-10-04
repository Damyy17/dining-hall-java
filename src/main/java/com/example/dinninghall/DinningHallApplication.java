package com.example.dinninghall;

import com.example.dinninghall.entity.Order;
import com.example.dinninghall.entity.Table;
import com.example.dinninghall.service.OrderService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.net.URISyntaxException;
import java.util.UUID;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DinningHallApplication {

    public static void main(String[] args) throws URISyntaxException {
        SpringApplication.run(DinningHallApplication.class, args);
        Table table = new Table();
        OrderService orderService = new OrderService();
//        Order order = new Order(UUID.randomUUID().toString(), null,2,5);
//        orderService.postOrder(order);
        for (int i = 0; i < 4; i++) {
            orderService.postOrder(table.generateOrders());
        }
    }

}
