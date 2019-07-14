package com.techotip.controller;

import com.techotip.model.Order;
import com.techotip.model.Orders;
import com.techotip.repository.OrderRepository;
import com.techotip.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders/user/{userId}")
    public Orders getOrderByUserId(@PathVariable Integer userId) {
        return orderService.getOrdersByUserId(userId);
    }

    @PostMapping("/orders")
    public void createOrder(@RequestBody Order order) {
        orderService.createOrder(order);
    }
}
