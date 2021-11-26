package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;


public class FeignRequestInterceptor4 implements RequestInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(FeignRequestInterceptor4.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        LOG.info("in FeignRequestInterceptor4");

        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return;
        }
        HttpServletRequest request = requestAttributes.getRequest();
        if (request == null) {
            return;
        }
        Collections.list(request.getHeaderNames()).stream().filter(h->!h.equals("test")).forEach(h ->
                requestTemplate.header(h, request.getHeader(h)));
    }
}
