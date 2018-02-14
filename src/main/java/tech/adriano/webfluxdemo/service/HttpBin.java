package tech.adriano.webfluxdemo.service;

import org.springframework.stereotype.Service;
import tech.adriano.webfluxdemo.domain.IP;

/**
 * Created on 14/02/18.
 *
 * @author Adriano Oliveira
 */

@Service
public class HttpBin {
    private final HttpBinClient client;

    public HttpBin(HttpBinClient client) {
        this.client = client;
    }

    public IP getIP() {
        return client.getIP();
    }
}
