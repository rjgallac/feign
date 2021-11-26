package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;


public class FeignRequestInterceptor1 implements RequestInterceptor {
    private static final Logger LOG= LoggerFactory.getLogger(FeignRequestInterceptor1.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Request request = requestTemplate.request();
        Map<String, Collection<String>> headers = requestTemplate.headers();
//        Map<String, Collection<String>> collect = headers.entrySet().stream()
//                .filter(h -> h.getValue()
//                        .equals("X-Custom-Header"))
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        Map.Entry::getValue));
        LOG.info("in FeignRequestInterceptor1");
        requestTemplate.header("test1", "added by interceptor 1");
//        requestTemplate.headers(collect);
    }
}
