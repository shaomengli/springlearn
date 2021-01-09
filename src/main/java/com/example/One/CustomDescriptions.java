package com.example.One;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.TYPE;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(TYPE)
@Inherited
public @interface CustomDescriptions {
    CustomDescription[] value();
}
