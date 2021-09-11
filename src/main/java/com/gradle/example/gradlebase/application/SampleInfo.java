package com.gradle.example.gradlebase.application;

import lombok.Data;

@Data
public class SampleInfo {

    String name;

    public String getName(){
        return this.name;
    }

}
