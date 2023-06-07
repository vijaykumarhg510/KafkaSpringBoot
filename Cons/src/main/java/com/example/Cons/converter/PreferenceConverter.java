package com.example.Cons.converter;

import com.example.Cons.model.Preference;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class PreferenceConverter implements AttributeConverter<Preference, String> {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public String convertToDatabaseColumn(Preference attribute) {
        try {
            return objectMapper.writeValueAsString(attribute);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Preference convertToEntityAttribute(String dbData) {
        try {
            return objectMapper.readValue(dbData, Preference.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
