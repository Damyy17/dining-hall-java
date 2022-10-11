package com.example.dinninghall;

import com.example.dinninghall.entity.Waiter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import java.net.URISyntaxException;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DinningHallApplication {

    public static void main(String[] args) throws URISyntaxException {
        SpringApplication.run(DinningHallApplication.class, args);
//        Table table = new Table();
//        OrderService orderService = new OrderService();
//        for (int i = 0; i < 7; i++) {
//            orderService.postOrder(table.generateOrders());
//        }

//        Waiter waiter1 = new Waiter("waiter1");
        final Thread waiter1 = new Thread(new Waiter("waiter1"));
        final Thread waiter2 = new Thread(new Waiter("waiter2"));
        waiter1.start();
        waiter2.start();
    }

}
