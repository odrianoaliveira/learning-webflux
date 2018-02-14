package tech.adriano.webfluxdemo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tech.adriano.webfluxdemo.domain.IP;

/**
 * Created on 14/02/18.
 *
 * @author Adriano Oliveira
 */

@FeignClient("httbin")
public interface HttpBinClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ip")
    IP getIP();

}
