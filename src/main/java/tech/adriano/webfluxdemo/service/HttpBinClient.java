package tech.adriano.webfluxdemo.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.adriano.webfluxdemo.domain.IP;

/**
 * Created on 14/02/18.
 *
 * @author Adriano Oliveira
 */

@FeignClient(name = "httbin",
        url = "https://httpbin.org",
        fallback = HttpBinClientFallback.class)
interface HttpBinClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ip")
    IP getIP();

}


class HttpBinClientFallback implements HttpBinClient {
    @Override
    public IP getIP() {
        return IP.builder().origin("0.0.0.0").build();
    }
}

