package com.example.One;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public void testMethods() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz=Class.forName("com.example.One.Student");
        Method method=null;
        Method[] methods=null;

        methods=clazz.getMethods();
        for(Method mth:methods){
            System.out.print(mth.getName()+" ");
        }
        System.out.println();

        method=clazz.getMethod("StudentPublicMethod",String.class);
        System.out.print(method.getName()+" ");
        System.out.println();

        methods=clazz.getDeclaredMethods();
        for(Method mth:methods){
            System.out.print(mth.getName()+" ");
        }
        System.out.println();

        method=clazz.getDeclaredMethod("StudentPrivateMethod",String.class);
        System.out.print(method.getName()+" ");
        System.out.println();

        Object obje=clazz.newInstance();
        method.setAccessible(true);
        String result= (String) method.invoke(obje,"inputParams");
        System.out.println(result);
    }
    public void testFields() throws NoSuchFieldException, ClassNotFoundException {
        Class clazz=Class.forName("com.example.One.Student");
        Method method=null;
        Method[] methods=null;

        System.out.println("-----------------------getDeclaredFileds----------------------------");
        Field[] fields=clazz.getDeclaredFields();
        for(Field field:fields){
            System.out.print(field.getName()+" ");
        }
        System.out.println();

        System.out.println("-----------------------------getFields------------------------------");
        fields=clazz.getFields();
        for(Field field:fields){
            System.out.print(field.getName()+" ");
        }
        System.out.println();

        System.out.println("-------------------------getDeclaredField------------------------------------");
        Field field=clazz.getDeclaredField("studentId");
        field.setAccessible(true);
        System.out.print(field.getName());
        System.out.println();

        System.out.println("---------------------------------getField------------------------------------------");
        field=clazz.getField("Name");
        System.out.println(field.getName());
    }
//    public static void main(String[] agrs) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchFieldException {
//        //testConstructor();
//        testAnnotatioin();
//    }
    public static void testAnnotatioin() throws ClassNotFoundException {
        String className="com.example.One.Student";
        Class<Student> clazz=(Class<Student>) Class.forName(className);
        CustomDescriptions customDescriptions= clazz.getAnnotation(CustomDescriptions.class);
        for(CustomDescription h:customDescriptions.value()){
            System.out.println("description:"+h.description());
        }

    }
    public static void testConstructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        String className="com.example.One.Student";
        Class<Student> clazz=(Class<Student>) Class.forName(className);
        Constructor<Person> [] constructors=(Constructor<Person>[]) Class.forName(className).getConstructors();
        for(Constructor<Person> constructor:constructors){
            System.out.println("getConstructors:"+constructor);
        }
        Constructor<Student> [] constructorsa=(Constructor<Student>[])Class.forName(className).getDeclaredConstructors();

        for(Constructor<Student> constructor:constructorsa){
            System.out.println("getDeclaredConstructors:"+constructor);
        }

        Constructor<Student> constructor=clazz.getConstructor(String.class,String.class);
        System.out.println("getConstructor："+constructor);
        Student obj=constructor.newInstance("cyw","123456");
        System.out.println(obj.getName());

        constructor=clazz.getDeclaredConstructor(String.class);
        System.out.println("getDeclaredConstructor:"+constructor);
        constructor.setAccessible(true);
        obj=constructor.newInstance("cyw");
        System.out.println(obj.getName());
    }
}
