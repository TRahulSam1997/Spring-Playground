package com.example.springboot.wiring.configuration;

import org.springframework.context.annotation.Bean;

import java.io.File;

public class ApplicationContextTestResourceQualifier {

    @Bean(name = "defaultFile")
    public File defaultFile() {
        return new File("defaultFile.txt");
    }

    @Bean(name="namedFile")
    public File namedFile() {
        return new File("namedFile.txt");
    }
}
