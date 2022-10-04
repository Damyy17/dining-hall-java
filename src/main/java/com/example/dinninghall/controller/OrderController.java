package com.example.dinninghall.controller;

import com.example.dinninghall.entity.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderController {

//    @PostMapping(value = "/distribution", consumes = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public ResponseEntity<Order> postOrder(@RequestBody Order order){
////        HttpHeaders httpHeaders = new HttpHeaders();
////        httpHeaders.setLocation(URI.create("http://127.0.0.1:7002/order"));
////        return new ResponseEntity<>(
////                new Order(UUID.randomUUID().toString(),
////                        order.getItems(),
////                        order.getPriority(),
////                        order.getMax_wait()
////                ),
////                HttpStatus.OK);
//
//
//        return
//    }

    @PostMapping(value = "/distribution", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Order> receivePreparedOrder(@RequestBody Order order) {
        System.out.println(order.getId());
        System.out.println(order.getPriority());

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
