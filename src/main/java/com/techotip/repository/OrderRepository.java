package com.techotip.repository;

import com.techotip.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer> {
    List<Order> getOrdersByUserId(Integer userId);
}
