package com.example.dinninghall.entity;

import com.example.dinninghall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URISyntaxException;

public class Waiter implements Runnable {
    String name;
    Table table = new Table();

    @Autowired
    OrderService orderService;

    public Waiter(String name){
        this.name = name;
    }

    @Override
    public synchronized void run() {
        System.out.println("Started thread " + name);
            while(true){
                try {
                    OrderService.postOrder(table.generateOrders());
                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(15000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
