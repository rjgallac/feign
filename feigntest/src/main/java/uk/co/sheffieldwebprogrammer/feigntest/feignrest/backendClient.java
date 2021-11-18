package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "testserver", url = "http://127.0.0.1:8081", configuration = FeignConfig1.class)
public interface backendClient {

    @RequestMapping(method = RequestMethod.GET, value = "/server")
    public String getHello();

}
