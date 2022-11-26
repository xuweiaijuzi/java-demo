package com.asyf.demo.common.serializer;

import cn.hutool.core.date.DateUtil;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class DateDeSerializer extends JsonDeserializer {

    private String pattern = "yyyy/MM/dd";

    public DateDeSerializer() {
    }

    public DateDeSerializer(String pattern) {
        super();
        this.pattern = pattern;
    }

    @Override
    public Object deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String text = jsonParser.getText();
        return DateUtil.parse(text.replaceAll("-", "/"), pattern);
    }
}
