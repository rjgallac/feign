package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import org.springframework.context.annotation.Bean;

public class FeignConfig2 {

    @Bean
    public FeignRequestInterceptor2 feignRequestInterceptor2() {
        return new FeignRequestInterceptor2();
    }


    @Bean
    public FeignRequestInterceptor4 feignRequestInterceptor4() {
        return new FeignRequestInterceptor4();
    }
}
