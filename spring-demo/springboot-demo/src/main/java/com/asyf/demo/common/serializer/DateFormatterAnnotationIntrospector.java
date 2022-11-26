package com.asyf.demo.common.serializer;

import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DateFormatterAnnotationIntrospector extends JacksonAnnotationIntrospector {

    private static final long serialVersionUID = 7368707128625539909L;

    //自定义序列化
    @Override
    public Object findSerializer(Annotated annotated) {
        String name = annotated.getName();
        DateFormatter formatter = annotated.getAnnotation(DateFormatter.class);
        if (formatter != null) {
            return new DateSerializer(formatter.pattern());//使用注解的日期格式，可以通过注解自定义
        }
        return super.findSerializer(annotated);
    }

    //自定义反序列化
    @Override
    public Object findDeserializer(Annotated annotated) {
        String name = annotated.getName();
        DateFormatter formatter = annotated.getAnnotation(DateFormatter.class);
        if (formatter != null) {
            return new DateDeSerializer(formatter.pattern());
        }
        return super.findDeserializer(annotated);
    }

}
