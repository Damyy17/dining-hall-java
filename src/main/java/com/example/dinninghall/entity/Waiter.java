package com.example.dinninghall.entity;

import com.example.dinninghall.service.OrderService;

import java.net.URISyntaxException;

public class Waiter implements Runnable {
    String name;
    Table table = new Table();
    OrderService orderService = new OrderService();

    public Waiter(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Started thread " + name);
            try {
                orderService.postOrder(table.generateOrders());
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Ended thread " + name);
    }
}
