package com.greenfoxacademy.programmerfoxclub.models;

public enum Trick {
    html("write HTML"),
    Java("code in Java"),
    cplus("code in C++"),
    csharp("code in C#"),
    css("design HTML with CSS"),
    js("code in JavaScript"),
    sb("code in SpringBoot");

    private String value;

    Trick(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
