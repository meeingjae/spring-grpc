package com.grpcclient.order.service;

import io.grpc.ManagedChannelBuilder;
import lombok.AllArgsConstructor;
import order.OrderReply;
import order.OrderRequest;
import order.OrderServiceGrpc;
import order.OrderServiceGrpc.OrderServiceBlockingStub;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class OrderService {

    private final static String HOST = "localhost";
    private final static int    PORT = 9091;

    private final OrderServiceBlockingStub orderStub = OrderServiceGrpc.newBlockingStub(
            ManagedChannelBuilder.forAddress(HOST, PORT)
                    .usePlaintext()
                    .build());

    public OrderReply order(String name) {

        OrderRequest request = OrderRequest.newBuilder()
                .setName(name)
                .build();
        return orderStub.order(request);
    }
}
