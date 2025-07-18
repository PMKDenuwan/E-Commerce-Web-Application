package com.PMKDenuwan.order_service_api.dto.request;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class OrderDetailRequestDto {
    private String productId;
    private int qty;
    private double unitPrice;
    private double discount;

}
