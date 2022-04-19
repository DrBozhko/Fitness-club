package com.domain;

public enum Gym {
    Male("Male"),
    Female("Female"),
    Both("Both");

    public final String name;

    Gym(String name) {
        this.name = name;
    }
}
