package com.b5wang.cloudlab.scex.warehouse.web;

import com.b5wang.cloudlab.scex.warehouse.entity.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/preorder")
public class PreOrderController {

    @PostMapping
    public ResponseEntity<?> placeProductOrder(@RequestBody Order order){
        log.info("placeProductOrder: {}",order);
        return ResponseEntity.ok().build();
    }

}
