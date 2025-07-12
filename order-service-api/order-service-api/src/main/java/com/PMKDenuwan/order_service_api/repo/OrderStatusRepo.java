package com.PMKDenuwan.order_service_api.repo;

import com.PMKDenuwan.order_service_api.entity.OrderDetail;
import com.PMKDenuwan.order_service_api.entity.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderStatusRepo extends JpaRepository<OrderStatus, String> {

    


}
