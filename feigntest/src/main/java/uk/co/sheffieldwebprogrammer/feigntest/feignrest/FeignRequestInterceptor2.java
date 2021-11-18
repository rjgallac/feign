package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

public class FeignRequestInterceptor2 implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {

        requestTemplate.header("test2", "added by interceptor 2");
    }
}
