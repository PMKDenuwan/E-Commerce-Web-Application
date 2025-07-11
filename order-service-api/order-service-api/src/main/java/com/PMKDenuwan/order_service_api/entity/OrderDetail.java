package com.PMKDenuwan.order_service_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "order_detail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

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
}
