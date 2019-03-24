package com.fei.order.dao;

import com.fei.order.OrderApplicationTests;
import com.fei.order.domain.OrderMaster;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Date;

import static org.junit.Assert.*;

@Component
public class OrderMasterRespositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRespository orderMasterRespository ;

    @Test
    public void insert(){
        OrderMaster orderMaster = new OrderMaster() ;
        orderMaster.setOrderId("orderId");
        orderMaster.setBuyerAddress("buyerAddress");
        orderMaster.setBuyerName("buyName");
        orderMaster.setBuyerPhone("buyPhone");
        orderMaster.setBuyerOpenid("buyOpenId");
        orderMaster.setCreateTime(new Date());
        orderMaster.setOrderAmount(new BigDecimal(1.2));
        orderMaster.setOrderStatus((byte)1);
        orderMaster.setUpdateTime(new Date());
        orderMaster.setPayStatus((byte)1);
        orderMasterRespository.save(orderMaster) ;
    }

}







