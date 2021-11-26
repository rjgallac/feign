package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Feign;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class FeignConfig2 {

    @Autowired
    private RequestInterceptor requestInterceptor;

    public Feign.Builder build(){

        return Feign.builder()
                .requestInterceptor(requestInterceptor2());
    }

    @Bean
    public RequestInterceptor requestInterceptor2() {
        return requestTemplate -> {
//            requestTemplate.headers().remove("");
            System.out.println("interceptor 2");
            requestTemplate.header("test2", "added by interceptor 2");
        };
    }


}
