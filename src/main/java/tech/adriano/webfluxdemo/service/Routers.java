package tech.adriano.webfluxdemo.service;

import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;

/**
 * Created on 12/02/18.
 *
 * @author Adriano Oliveira
 */

public class Routers {

    @Bean
    RouterFunction<?> routes(HttpBinHandler handler) {
        return RouterFunctions.route(POST("/ip"),handler::getIP);
    }
}
