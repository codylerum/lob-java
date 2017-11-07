package com.lob.model;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.joda.JodaModule;

public class Webhook {

    private static ObjectMapper MAPPER = new ObjectMapper().registerModule(new JodaModule());

    public static Event constructEvent(String payload) throws IOException {
        return MAPPER.readValue(payload, Event.class);
    }
}
