package com.lob.model;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event {

    @JsonProperty
    private final String id;
    @JsonProperty
    private final String reference_id;
    @JsonProperty
    private final EventType event_type;
    @JsonProperty
    private final DateTime dateCreated;
    @JsonProperty
    private final String object;

    @JsonCreator
    public Event(@JsonProperty("id") final String id, @JsonProperty("event_type") EventType event_type, @JsonProperty("reference_id") String reference_id,
            @JsonProperty("date_created") final DateTime dateCreated, @JsonProperty("object") final String object) {
        this.id = id;
        this.reference_id = reference_id;
        this.event_type = event_type;
        this.dateCreated = dateCreated;
        this.object = object;
    }

    public String getId() {
        return id;
    }

    public String getReference_id() {
        return reference_id;
    }

    public EventType getEvent_type() {
        return event_type;
    }

    public DateTime getDateCreated() {
        return dateCreated;
    }

    public String getObject() {
        return object;
    }
}
