package com.PMKDenuwan.order_service_api.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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

    @Column(name="Order_Date",nullable = false, columnDefinition = "DATETIME")
    private Date OrderDate;


    @Column(name="Total_Amount",nullable = false, precision = 10, scale = 2)
    private double totalAmount;


    @Column(name="User_Id",nullable = false, length = 80)
    private String userId;


    @Column(name="Remark",length = 750)
    private String remark;

    @OneToMany(mappedBy = "customerOrder")
    private Set<OrderDetail> products = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "order_status_id")
    private OrderStatus orderStatus;

}
