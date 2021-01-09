package com.example.One;

@CustomDescription(description = "基类")
@CustomDescription(description = "人")
public class Person extends Object{
    public String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String PersonPublicMethod(String str){
        return str;
    }

    public Person(String name){
        Name=name;
    }

    public String PersonPrivateMethod(String str){
        return str;
    }

    public Person(){
        super();
    }
}
