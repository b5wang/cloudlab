package com.b5wang.cloudlab.scex.warehouse.entity;

import lombok.Data;

@Data
public class Order {

    private String id;
    private String userId;
    private String productId;
    private int quantity;

}
