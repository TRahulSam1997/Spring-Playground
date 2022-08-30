package com.example.springboot.wiring.configuration;

import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;
import java.io.File;

public class ApplicationContextTestResourceNameType {
    @Bean(name = "namedFile")
    public File namedFile() {
        return new File("namedFile.txt");
    }
}
