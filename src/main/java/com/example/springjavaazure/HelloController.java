package com.example.springjavaazure;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello() {
        log.info("HelloController: hello");
        return "Hello World";
    }

}
