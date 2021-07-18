package com.workllama.springbootvuejsdemo.Validation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
//@Repeatable(ConfigurableSize.List.class)
@Constraint(validatedBy = {ConfigurableSizeCharSequenceValidator.class})
public @interface ConfigurableSize {

    String message() default "size is not valid";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    String minProperty() default "";

    String maxProperty() default "";
/*
    @Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE })
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        ConfigurableSize[] value();
    }
*/
}

