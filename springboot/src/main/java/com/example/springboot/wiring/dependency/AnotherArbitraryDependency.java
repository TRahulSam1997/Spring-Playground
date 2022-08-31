package com.example.springboot.wiring.dependency;

public class AnotherArbitraryDependency extends ArbitraryDependency {
    private final String label = "Another Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}
