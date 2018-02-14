package tech.adriano.webfluxdemo;

import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * Created on 12/02/18.
 *
 * @author Adriano Oliveira
 */

public class Router {
    RouterFunction<ServerResponse> helloWorldRoute =
            RouterFunctions.route(RequestPredicates.path("/hello-world"),
                    request -> ServerResponse.ok().body(fromObject("Hello World")));
}
