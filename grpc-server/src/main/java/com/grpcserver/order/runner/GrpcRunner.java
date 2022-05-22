package com.grpcserver.order.runner;

import com.grpcserver.order.service.OrderServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class GrpcRunner implements ApplicationRunner {

    private static final Logger logger = LoggerFactory.getLogger(GrpcRunner.class);

    private static final int PORT = 9091;
    private Server server;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        server = ServerBuilder.forPort(PORT)
                .addService(new OrderServiceImpl())
                .build();
        this.server.start();
        logger.info("gRPC Server Listening on port : {}", server.getPort());
        this.server.awaitTermination();
    }
}
