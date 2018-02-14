package tech.adriano.webfluxdemo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

/**
 * Created on 12/02/18.
 *
 * @author Adriano Oliveira
 */


@Component
public class Routers {

    @Bean
    RouterFunction<?> routes(HttpBinHandler handler) {
        return RouterFunctions.route(GET("/ip"),handler::getIP);
    }
}
