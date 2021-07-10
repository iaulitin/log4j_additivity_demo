package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerL2 {
    private static final Logger log = LoggerFactory.getLogger(HelloControllerL2.class);

    @GetMapping("hello_l2")
    public void hello() {
        log.info("Hello from controller on L2");
    }
}
