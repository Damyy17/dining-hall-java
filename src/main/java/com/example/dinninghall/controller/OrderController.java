package com.example.dinninghall.controller;

import com.example.dinninghall.entity.Order;
import com.example.dinninghall.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping(value = "/distribution", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Order> receivePreparedOrder(@RequestBody Order order) {
        System.out.println(order.toString());
        orderService.addOrderInDH(order);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
