package com.grpcclient.order;

import com.grpcclient.order.service.OrderService;
import order.OrderReply;
import order.OrderRequest;
import order.OrderServiceGrpc.OrderServiceBlockingStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {

    private final static String NAME = "test";

    OrderServiceBlockingStub orderServiceBlockingStub;

    @BeforeEach
    void before() {

        orderServiceBlockingStub = Mockito.mock(OrderServiceBlockingStub.class);
    }

    @Test
    void blockingStubTest() {

        Mockito.when(orderServiceBlockingStub.order(OrderRequest.newBuilder().setName(NAME).build()))
                .thenReturn(OrderReply.newBuilder()
                        .setName(NAME).build());
        OrderService orderService = new OrderService(orderServiceBlockingStub);
        OrderReply reply = orderService.order(NAME);

        assertThat(reply.getName())
                .isEqualTo(NAME);
    }
}

