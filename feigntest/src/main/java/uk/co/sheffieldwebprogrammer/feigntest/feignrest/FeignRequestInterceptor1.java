package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.stream.Collectors;


public class FeignRequestInterceptor1 implements RequestInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(FeignRequestInterceptor1.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOG.info("in FeignRequestInterceptor1");
        requestTemplate.header("test1", "added by interceptor 1");
    }
}
