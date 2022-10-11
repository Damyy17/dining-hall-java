package com.example.dinninghall.controller;

import com.example.dinninghall.entity.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

    @PostMapping(value = "/distribution", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Order> receivePreparedOrder(@RequestBody Order order) {
        System.out.println(order.toString());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
