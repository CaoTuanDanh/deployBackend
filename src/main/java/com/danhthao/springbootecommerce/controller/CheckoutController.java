package com.danhthao.springbootecommerce.controller;


import com.danhthao.springbootecommerce.dto.Purchase;
import com.danhthao.springbootecommerce.dto.PurchaseResponse;
import com.danhthao.springbootecommerce.service.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("https://guileless-pithivier-f8e66a.netlify.app")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {

        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;
    }

}
