package com.example.dinninghall.repository;

import com.example.dinninghall.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

@Repository
public class OrderRepository {

    private static final BlockingQueue<Order> orders = new LinkedBlockingDeque<>();

    public void addOrder(Order order){
        orders.add(order);
    }
}
