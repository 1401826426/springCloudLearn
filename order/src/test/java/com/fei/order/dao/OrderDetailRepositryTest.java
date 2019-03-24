package com.fei.order.dao;

import com.fei.order.OrderApplicationTests;
import com.fei.order.domain.OrderDetail;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

@Component
public class OrderDetailRepositryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepositry orderDetailRepositry ;

    @Test
    public void insert(){
        OrderDetail orderDetail = new OrderDetail() ;
        orderDetail.setCreateTime(new Date());
        orderDetail.setDetailId("detailId");
        orderDetail.setOrderId("orderId");
        orderDetail.setProductIcon("icon");
        orderDetail.setProductId("productId");
        orderDetail.setProductName("name");
        orderDetail.setProductPrice(new BigDecimal(1.2));
        orderDetail.setProductQuantity(1);
        orderDetail.setUpdateTime(new Date());
        orderDetailRepositry.save(orderDetail) ;
    }

}