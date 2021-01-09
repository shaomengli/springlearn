package com.example.One;

import java.lang.annotation.*;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Retention(RUNTIME)
@Target(ElementType.TYPE)
@Inherited
@Repeatable(CustomDescriptions.class)
public @interface CustomDescription {
    String description() default "";
}