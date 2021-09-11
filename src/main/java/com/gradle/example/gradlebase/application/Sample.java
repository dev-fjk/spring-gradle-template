package com.gradle.example.gradlebase.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sample {

    public int sum(int a, int b) {
        log.info("sum Start a : {}. b : {}", a, b);
        int result = a + b;
        log.info("result : {}", result);
        return result;
    }
}
