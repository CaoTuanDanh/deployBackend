package com.danhthao.springbootecommerce.service;


import com.danhthao.springbootecommerce.dto.Purchase;
import com.danhthao.springbootecommerce.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
