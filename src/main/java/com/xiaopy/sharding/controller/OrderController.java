package com.xiaopy.sharding.controller;

import com.xiaopy.sharding.domain.Order;
import com.xiaopy.sharding.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xiaopeiyu
 * @since 2020/12/17
 */
@RestController
public class OrderController {

    @Autowired
    private OrderRepository repository;

    @GetMapping("/testSave")
    public void testSave(){
        for (int i=0;i<100;i++){
            Order order = new Order();
            order.setId(i);
            order.setUserId(i);
            order.setName("test>"+i);
            order.setType("type");
            repository.save(order);
        }
        for (int i=100;i<200;i++){
            Order order = new Order();
            order.setId(i+1);
            order.setUserId(i);
            order.setName("test>"+i);
            order.setType("type");
            repository.save(order);
        }
    }

    @GetMapping("/list")
    public void list(){
        List<Order> allByType = repository.findAllByType("type");
        System.out.println(allByType.size());
    }
}
