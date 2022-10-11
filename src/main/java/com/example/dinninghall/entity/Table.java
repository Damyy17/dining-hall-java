package com.example.dinninghall.entity;

import java.util.*;
import java.util.stream.Collectors;

public class Table {
    Random random = new Random();
    private final Queue<Order> preparedFoodQueue = new LinkedList<>();

    public Order generateOrders(){
        String id = UUID.randomUUID().toString();
        List<Integer> listOfItems = new Random()
                .ints(random.nextInt(10) + 1, 1, 12)
                .boxed()
                .collect(Collectors.toList());
        int priority = random.nextInt(3) + 1;
        int max_wait = random.nextInt(50) + 1;

        return new Order(id, listOfItems, priority, max_wait);
    }
}
