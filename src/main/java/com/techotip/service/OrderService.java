package com.techotip.service;

import com.techotip.model.Order;
import com.techotip.model.Orders;
import com.techotip.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Orders getOrdersByUserId(Integer userId) {
        List<Order> orderList = orderRepository.getOrdersByUserId(userId);
        Orders orders = new Orders();
        orders.setOrderList(orderList);
        return orders;
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }
}
