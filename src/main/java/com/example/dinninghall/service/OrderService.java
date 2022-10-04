package com.example.dinninghall.service;

import com.example.dinninghall.entity.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class OrderService {

    public void postOrder(Order order) throws URISyntaxException {
        RestTemplate restTemplate = new RestTemplate();
        final String baseURL = "http://127.0.0.1:7002/order";
        URI uri = new URI(baseURL);

        restTemplate.postForEntity(uri, order, Order.class);
    }

}
