package uk.co.sheffieldwebprogrammer.feignserver.testserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("server")
public class TestServer {

    @GetMapping
    public String get(@RequestHeader Map<String, String> headers){
        System.out.println();
        headers.forEach((key, value) -> {
            System.out.println("Header "+ key+" = "+ value);
        });
        return "hello";
    }
}
