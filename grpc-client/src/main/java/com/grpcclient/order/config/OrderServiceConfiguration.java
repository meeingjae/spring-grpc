package com.grpcclient.order.config;

import com.grpcclient.order.service.OrderService;
import io.grpc.ManagedChannelBuilder;
import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import order.OrderServiceGrpc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = OrderServiceGrpc.OrderServiceBlockingStub.class,
        beanName = "order",
        client = @GrpcClient("order")
)
public class OrderServiceConfiguration {

    private final static String HOST = "localhost";
    private final static int    PORT = 9091;

    @Bean
    OrderService orderServiceBean() {

        return new OrderService(OrderServiceGrpc.newBlockingStub(
                ManagedChannelBuilder.forAddress(HOST, PORT)
                        .usePlaintext()
                        .build()));
    }
}
