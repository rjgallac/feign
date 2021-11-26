package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FeignRequestInterceptor2 implements RequestInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(FeignRequestInterceptor1.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOG.info("in FeignRequestInterceptor1");
        requestTemplate.header("test2", "added by interceptor 2");
    }
}
