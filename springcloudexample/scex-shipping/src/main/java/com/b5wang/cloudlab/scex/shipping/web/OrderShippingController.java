package com.b5wang.cloudlab.scex.shipping.web;

import com.b5wang.cloudlab.scex.shipping.entity.OrderShipping;
import com.b5wang.cloudlab.scex.shipping.service.OrderShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="shipping")
public class OrderShippingController {

    @Autowired
    private OrderShippingService orderShippingService;

    @PostMapping
    public ResponseEntity<String> create(@RequestBody OrderShipping orderShipping){
        String id = orderShippingService.saveOrderShipping(orderShipping);
        return ResponseEntity.ok(id);
    }

    @GetMapping
    public ResponseEntity<OrderShipping> create(@RequestParam(name="id") String id){
        return ResponseEntity.ok(orderShippingService.findOrderShippingById(id));
    }

}
