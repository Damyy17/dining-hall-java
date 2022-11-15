package com.example.dinninghall.service;

import com.example.dinninghall.entity.Order;
import com.example.dinninghall.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public static void postOrder(Order order) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseURL = "http://127.0.0.1:7003/aggregator1";
        URI uri = new URI(baseURL);

        restTemplate.postForEntity(uri, order, Order.class);
    }

    public void addOrderInDH(Order order){
        orderRepository.addOrder(order);
    }

}