package com.example.springboot.wiring.configuration;

import com.example.springboot.wiring.dependency.ArbitraryDependency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestAutowiredType {
    @Bean
    public ArbitraryDependency autowiredFieldDependency() {
        return new ArbitraryDependency();
    }
}