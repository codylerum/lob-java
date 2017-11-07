package com.lob.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class EventType {
    @JsonProperty
    private String id;
    @JsonProperty
    private boolean enabled_for_test;
    @JsonProperty
    private String resource;
    @JsonProperty
    private String object;

    @JsonCreator
    public EventType(@JsonProperty("id") final String id, @JsonProperty("enabled_for_test") boolean enabled_for_test, @JsonProperty("resource") String resource, @JsonProperty("object") final String object) {
        this.id = id;
        this.enabled_for_test = enabled_for_test;
        this.resource = resource;
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public boolean isEnabled_for_test() {
        return enabled_for_test;
    }

    public String getResource() {
        return resource;
    }

    public String getObject() {
        return object;
    }
}
