package com.example.springboot.wiring.dependency;

import org.springframework.stereotype.Component;

@Component
public class YetAnotherArbitraryDependency extends ArbitraryDependency {

    @Override
    public String toString() {
        return "Yet Another Arbitrary Dependency";
    }
}
