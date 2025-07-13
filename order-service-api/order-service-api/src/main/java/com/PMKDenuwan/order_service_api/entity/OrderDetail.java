package com.PMKDenuwan.order_service_api.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class OrderDetail {
    @Id
    @Column(name="Detail_Id",nullable = false, unique = true, length = 80)
    private String detailId;

    @Column(name="Product_Id",nullable = false, length = 80)
    private String productId;

    @Column(name="Quantity",nullable = false)
    private int qty;

    @Column(name="Unit Price",nullable = false, precision = 10, scale = 2)
    private double unitPrice;

    @Column(name="Discount",nullable = false, precision = 10, scale = 2)
    private double discount;


    @ManyToOne
    @JoinColumn(name =  "customer_order_id")
    private CustomerOrder customerOrder;

}
