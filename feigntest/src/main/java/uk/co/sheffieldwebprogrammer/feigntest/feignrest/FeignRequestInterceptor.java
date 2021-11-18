package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Request;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

public class FeignRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate requestTemplate) {
        Request request = requestTemplate.request();
        Map<String, Collection<String>> headers = requestTemplate.headers();
//        Map<String, Collection<String>> collect = headers.entrySet().stream()
//                .filter(h -> h.getValue()
//                        .equals("X-Custom-Header"))
//                .collect(Collectors.toMap(Map.Entry::getKey,
//                        Map.Entry::getValue));
        requestTemplate.header("test1", "added by interceptor 1");
//        requestTemplate.headers(collect);
    }
}
