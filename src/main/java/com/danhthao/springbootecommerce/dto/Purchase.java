package com.danhthao.springbootecommerce.dto;

import com.danhthao.springbootecommerce.entity.Address;
import com.danhthao.springbootecommerce.entity.Customer;
import com.danhthao.springbootecommerce.entity.Order;
import com.danhthao.springbootecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
