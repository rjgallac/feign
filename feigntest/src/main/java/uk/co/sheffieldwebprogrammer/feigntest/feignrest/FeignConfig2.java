package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import feign.Feign;
import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;

public class FeignConfig2 {

//    @Bean
//    public Feign.Builder build(){
//
//        return Feign.builder()
//                .requestInterceptor(new FeignRequestInterceptor())
//                .requestInterceptor(new FeignRequestInterceptor2());
//    }

    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            System.out.println("interceptor 2");

            requestTemplate.header("test1", "added by interceptor 2");
        };
    }

}
