package com.example.springboot.wiring.configuration;

import com.example.springboot.wiring.dependency.ArbitraryDependency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectType {
    @Bean
    public ArbitraryDependency injectDependency() {
        return new ArbitraryDependency();
    }
}
