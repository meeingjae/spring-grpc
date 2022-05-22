package com.grpcclient.order.configuration;

import net.devh.boot.grpc.client.inject.GrpcClient;
import net.devh.boot.grpc.client.inject.GrpcClientBean;
import order.OrderServiceGrpc;
import org.springframework.context.annotation.Configuration;

@Configuration
@GrpcClientBean(
        clazz = OrderServiceGrpc.OrderServiceBlockingStub.class,
        beanName = "orderBlockingStub",
        client = @GrpcClient("order")
)
public class GrpcConfiguration {

}
