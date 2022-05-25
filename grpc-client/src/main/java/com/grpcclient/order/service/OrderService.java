package com.grpcclient.order.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import order.OrderReply;
import order.OrderRequest;
import order.OrderServiceGrpc.OrderServiceBlockingStub;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class OrderService {

    private final OrderServiceBlockingStub orderStub;

    public OrderReply order(String name) {

        log.info("request name: {}", name);
        OrderRequest request = OrderRequest.newBuilder()
                .setName(name)
                .build();
        OrderReply reply = orderStub.order(request);
        log.info("request success. response: {}", reply);
        return reply;
    }
}
