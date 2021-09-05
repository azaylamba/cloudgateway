package com.opsec.cloudgateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Gateway class to route the requests from 8085 port to 8080 port which is different microservice.
 */
@Configuration
public class SpringCloudConfig {
    
    /**
     *
     * Routes requests having url pattern "/user/**" on port 8085 to port 8080.
     *
     * @param builder
     * @return route locator
     */
    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/user/**")
                        .uri("http://localhost:8080/"))
                .build();
    }
}
