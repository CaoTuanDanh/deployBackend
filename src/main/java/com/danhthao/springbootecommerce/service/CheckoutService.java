package com.danhthao.springbootecommerce.service;


import com.danhthao.springbootecommerce.dto.Purchase;
import com.danhthao.springbootecommerce.dto.PurchaseResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("https://guileless-pithivier-f8e66a.netlify.app")
@RestController
@RequestMapping("/api/checkout")
public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
