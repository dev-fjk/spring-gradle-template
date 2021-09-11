package com.maven.example.demo.application;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Sample {

	public int sum(int a, int b) {
		log.info("sum START");
		log.info("intellij test");

		int result = a + b;

		log.info("result : {}", result);
		log.info("sum END");
		return result;
	}
}
