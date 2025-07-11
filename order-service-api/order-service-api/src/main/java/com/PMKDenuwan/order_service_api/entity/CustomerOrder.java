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
@Table(name = "customer_order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CustomerOrder {
    @Id
    @Column(name="Order_Id",nullable = false, unique = true, length = 80)
    private String orderId;

    @Column(name="Date",nullable = false, columnDefinition = "DATETIME")
    private Date date;


    @Column(name="Total_Amount",nullable = false, precision = 10, scale = 2)
    private double totalAmount;


    @Column(name="User_Id",nullable = false, length = 80)
    private String userId;


    @Column(name="Remark",length = 750)
    private String remark;
}
