package com.example.l3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerL3 {
    private static final Logger log = LoggerFactory.getLogger(HelloControllerL3.class);

    @GetMapping("hello_l3")
    public void hello() {
        log.info("Hello from controller on L3");
    }
}
