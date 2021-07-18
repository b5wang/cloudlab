package com.b5wang.cloudlab.scex.order.web;

import com.b5wang.cloudlab.scex.order.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<?> placeOrder(@RequestBody Order order){
        log.info("placeOrder: {}",order);
        log.info("request product from warehouse......");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Order> httpEntity = new HttpEntity(order,headers);
        ResponseEntity<?> responseEntity = restTemplate.postForEntity("http://scex-warehouse:8005/preorder",httpEntity,String.class);
        log.info("place product order result: {}", responseEntity.getStatusCodeValue());

        return ResponseEntity.ok().build();
    }

}
