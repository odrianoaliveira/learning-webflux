package tech.adriano.webfluxdemo.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;
import tech.adriano.webfluxdemo.service.HttpBin;

import java.time.Duration;
import java.util.Random;

import static org.springframework.web.reactive.function.BodyInserters.fromObject;

/**
 * Created on 14/02/18.
 *
 * @author Adriano Oliveira
 */

@Service
public class HttpBinHandler {
    private static final Random random = new Random();
    private final HttpBin httpBin;

    public HttpBinHandler(HttpBin httpBin) {
        this.httpBin = httpBin;
    }

    private static Duration randomThinkTime() {
        return Duration.ofSeconds(random.nextInt(5 - 2) + 2);
    }

    public Mono<ServerResponse> getIP(ServerRequest request) {
//        return Mono.delay(randomThinkTime())
//                .then(ServerResponse
//                        .ok()
//                        .contentType(MediaType.APPLICATION_JSON_UTF8)
//                        .body(fromObject(httpBin.getIP())));

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8).body(fromObject(httpBin.getIP()));
    }
}
