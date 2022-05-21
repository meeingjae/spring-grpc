package com.grpcserver.order.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import order.OrderReply;
import order.OrderRequest;
import order.OrderServiceGrpc;

import java.util.Random;

@GrpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    final static int    INITIAL = 1;
    final static String SUCCESS = "success";
    final static String FAIL    = "failed";

    private final Random random = new Random();

    int index = INITIAL;

    @Override
    public void order(OrderRequest orderRequest, StreamObserver<OrderReply> responseObserver) {

        String result = random.nextBoolean() ? SUCCESS : FAIL;
        OrderReply reply = OrderReply.newBuilder()
                .setId(index++)
                .setName(orderRequest.getName())
                .setOrderStatus(result)
                .setDeliveryStatus(result)
                .build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
