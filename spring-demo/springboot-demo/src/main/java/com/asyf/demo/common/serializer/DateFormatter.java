package com.asyf.demo.common.serializer;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DateFormatter {

    String pattern() default "yyyy/MM/dd";

}
