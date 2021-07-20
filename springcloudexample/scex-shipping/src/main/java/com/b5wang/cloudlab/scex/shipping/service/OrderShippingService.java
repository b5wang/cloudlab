package com.b5wang.cloudlab.scex.shipping.service;

import com.b5wang.cloudlab.scex.shipping.dao.OrderShippingJpaRepository;
import com.b5wang.cloudlab.scex.shipping.entity.OrderShipping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class OrderShippingService {

    @Autowired
    private OrderShippingJpaRepository orderShippingJpaRepository;

    @Transactional
    public String saveOrderShipping(OrderShipping orderShipping){
        orderShipping.setId(UUID.randomUUID().toString());
        orderShippingJpaRepository.save(orderShipping);
        return orderShipping.getId();
    }

    @Transactional(readOnly = true)
    public OrderShipping findOrderShippingById(String id){
        return orderShippingJpaRepository.getById(id);
    }

}
