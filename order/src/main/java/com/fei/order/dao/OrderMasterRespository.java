package com.fei.order.dao;

import com.fei.order.domain.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderMasterRespository extends JpaRepository<OrderMaster,String> {
}
