package com.example.springboot.wiring.configuration;

import org.springframework.context.annotation.Bean;

import java.io.File;

public class ApplicationContextTestResourceNameType {
    @Bean(name = "namedFile")
    public File namedFile() {
        File namedFile = new File("namedFile.txt");
        return namedFile;
    }
}
