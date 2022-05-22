package com.grpcclient.order.controller;

import com.grpcclient.order.service.OrderService;
import order.OrderReply;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {

        this.orderService = orderService;
    }

    @PostMapping("/{name}")
    public OrderReply order(@PathVariable(value = "name") String name) {

        return orderService.order(name);
    }

}
