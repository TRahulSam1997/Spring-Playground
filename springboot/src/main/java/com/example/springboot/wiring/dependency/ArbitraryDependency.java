package com.example.springboot.wiring.dependency;

public class ArbitraryDependency {
    private final String label = "Arbitrary Dependency";

    @Override
    public String toString() {
        return label;
    }
}
