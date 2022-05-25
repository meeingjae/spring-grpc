package com.grpcserver.order.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import order.OrderReply;
import order.OrderRequest;
import order.OrderServiceGrpc;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

@GrpcService
public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    final static Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);

    final static int    INITIAL = 1;
    final static String SUCCESS = "success";
    final static String FAIL    = "failed";

    private final Random random = new Random();

    int index = INITIAL;

    /**
     * Order Service - Server Side <br>
     * test : <br>
     * 1) $brew install grpcurl <br>
     * 2) $grpcurl --plaintext -d '{"name":"xxxx"}' localhost:9090 net.devh.boot.grpc.example.OrderService/Order <br>
     *
     * @param orderRequest     proto-interface 모듈에 정의된 Order.proto 의 Request
     * @param responseObserver Observer
     */
    @Override
    public void order(OrderRequest orderRequest, StreamObserver<OrderReply> responseObserver) {

        logger.info("request name: {}", orderRequest.getName());
        String result = random.nextBoolean() ? SUCCESS : FAIL;
        OrderReply reply = OrderReply.newBuilder()
                .setId(index++)
                .setName(orderRequest.getName())
                .setOrderStatus(result)
                .setDeliveryStatus(result)
                .build();
        logger.info("request success. response: {}", reply);
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
