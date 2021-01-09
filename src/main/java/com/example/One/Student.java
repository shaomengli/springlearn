package com.example.One;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@CustomDescription(description = "学生")
@CustomDescription(description = "人")
public class Student extends Person{
    public String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String StudentPublicMethod(String str){
        return str;
    }

    private String StudentPrivateMethod(String str){
        return str;
    }

    public Student(){

    }

    public Student(String name){
        super(name);
        this.studentId="123456";
    }

    public Student(String name,String studentId){
        super(name);
        this.studentId=studentId;
    }

}
