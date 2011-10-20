package com.fwix.api.domain;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * @author npeeters
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlacesWrapper {

    @JsonProperty("success")
    private int success;

    @JsonProperty("places")
    private List<Place> places = new ArrayList<Place>();

    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }
}
