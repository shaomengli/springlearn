package com.example.One;

@CustomDescription(description = "学生")
@CustomDescription(description = "人")
public class Student extends Person{
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public static void main(String[] agrs){
        CustomDescriptions customDescriptions=new Student().getClass().getAnnotation(CustomDescriptions.class);
        for(CustomDescription h:customDescriptions.value()){
            System.out.println("description:"+h.description());
        }
    }
}
