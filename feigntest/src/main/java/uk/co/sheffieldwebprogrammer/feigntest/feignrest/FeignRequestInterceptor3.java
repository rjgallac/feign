package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;


public class FeignRequestInterceptor3 implements RequestInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(FeignRequestInterceptor3.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOG.info("in FeignRequestInterceptor3");

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return;
        }
        HttpServletRequest request = requestAttributes.getRequest();
        if (request == null) {
            return;
        }
        Collections.list(request.getHeaderNames()).forEach(h ->
                requestTemplate.header(h, request.getHeader(h)));
    }
}
