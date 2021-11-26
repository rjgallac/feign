package uk.co.sheffieldwebprogrammer.feigntest.feignrest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TestController {

    @Autowired
    private backendClient1 backendClient1;
    @Autowired
    private backendClient2 backendClient2;

    @GetMapping("test1")
    public String get1(@RequestHeader Map<String, String> headers){
        System.out.println(headers);
        System.out.println(backendClient1.getHello());
        return "hi1";
    }
    @GetMapping("test2")
    public String get2(@RequestHeader Map<String, String> headers){
        System.out.println(headers);
        System.out.println(backendClient2.getHello());
        return "hi2";
    }
}
