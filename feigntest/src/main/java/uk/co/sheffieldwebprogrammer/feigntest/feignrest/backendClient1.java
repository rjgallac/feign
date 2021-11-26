package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.HeaderMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@FeignClient(value = "testserver", url = "http://127.0.0.1:8081", configuration = FeignConfig1.class)
public interface backendClient1 {

    @RequestMapping(method = RequestMethod.GET, value = "/server")
    String getHello();

}
