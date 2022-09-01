package com.example.springboot.wiring.configuration;

import com.example.springboot.wiring.dependency.ArbitraryDependency;
import com.example.springboot.wiring.dependency.YetAnotherArbitraryDependency;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextTestInjectName {
    @Bean
    public ArbitraryDependency yetAnotherFieldInjectDependency() {
        return new YetAnotherArbitraryDependency();
    }
}
