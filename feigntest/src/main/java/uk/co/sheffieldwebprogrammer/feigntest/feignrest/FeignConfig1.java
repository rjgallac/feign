package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Feign;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class FeignConfig1 {


    @Bean
    public Feign.Builder build(){
        return Feign.builder().requestInterceptor(requestInterceptor());
    }
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
//            requestTemplate.headers().remove("");
            System.out.println("interceptor 1");
            requestTemplate.header("test1", "added by interceptor 1");
        };
    }
}
