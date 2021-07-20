package com.b5wang.cloudlab.scex.shipping.dao;

import com.b5wang.cloudlab.scex.shipping.entity.OrderShipping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository实现了PagingAndSortingRepository接口，
 *                   PagingAndSortingRepository接口实现了CrudRepository接口，
 *                   CrudRepository接口实现了Repository接口
 * */
public interface OrderShippingJpaRepository extends JpaRepository<OrderShipping,String> {

}
