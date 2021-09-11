package com.gradle.example.gradlebase.application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Sample {

    public int sum(int a, int b) {
        SampleInfo info = new SampleInfo();
        System.out.println(info.getName());
        return a + b;
    }
}
