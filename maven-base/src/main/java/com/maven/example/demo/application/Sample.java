package com.maven.example.demo.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Sample {
    
    public int sum(int a, int b) {
        log.info("sum START");

        int result = a + b;

        log.info("result : {}", result);
        log.info("sum END");
        return result;
    }
}
