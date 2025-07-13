package com.PMKDenuwan.order_service_api.service;

import com.PMKDenuwan.order_service_api.dto.request.CustomerOrderRequestDto;

public interface CustomerOrderService {
    public void createOrder(CustomerOrderRequestDto requestDto);
}
