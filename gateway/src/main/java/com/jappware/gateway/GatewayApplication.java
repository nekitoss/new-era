package com.jappware.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@EnableEurekaClient
@SpringBootApplication
public class GatewayApplication {

//    @Bean
//    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("ms1", p -> p
//                        .path("/ms1**")
//                        .filters(f -> f.rewritePath("/ms1/hello"))
//                        .uri("http://localhost:8081"))
//                .route("ms2", p -> p
//                        .path("/ms2")
//                        .uri("http://localhost:8082/ms2/hello"))
//                .build();
//    }

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }

}
