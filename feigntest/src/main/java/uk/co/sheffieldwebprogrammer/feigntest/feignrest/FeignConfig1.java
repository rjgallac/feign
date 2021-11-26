package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import org.springframework.context.annotation.Bean;

public class FeignConfig1 {

    @Bean
    public FeignRequestInterceptor1 feignRequestInterceptor1() {
        return new FeignRequestInterceptor1();
    }

    @Bean
    public FeignRequestInterceptor3 feignRequestInterceptor3() {
        return new FeignRequestInterceptor3();
    }
}
