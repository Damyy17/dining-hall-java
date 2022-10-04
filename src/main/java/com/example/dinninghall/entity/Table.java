package com.example.dinninghall.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.stream.Collectors;

public class Table {
    Random random = new Random();

    public Order generateOrders(){
        String id = UUID.randomUUID().toString();
        List<Integer> listOfItems = new Random().ints(random.nextInt(10), 1, 12)
                .boxed()
                .collect(Collectors.toList());
        int priority = random.nextInt(2) + 1;
        int max_wait = random.nextInt(50) + 1;

        return new Order(id, listOfItems, priority, max_wait);
    }
}
