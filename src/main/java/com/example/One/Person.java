package com.example.One;

@CustomDescription(description = "基类")
@CustomDescription(description = "人")
public class Person {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
