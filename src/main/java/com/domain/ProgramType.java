package com.domain;

public enum ProgramType {
    VERYLIGHT("Very Light"),
    LIGHT("Light"),
    MEDIUM("Medium"),
    INTENSIVE("Intensive");

    public final String name;

    ProgramType(String name) {
        this.name = name;
    }
}
