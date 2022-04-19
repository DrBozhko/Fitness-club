package com.domain;

public enum Exercise {
    CROSSFIT("Cross Fit"),
    CYCLING("Cycling"),
    RUNNING("Running"),
    SWIMMING("Swimming"),
    YOGA("Yoga");

    public final String name;

    Exercise(String name) {
        this.name = name;
    }
}
