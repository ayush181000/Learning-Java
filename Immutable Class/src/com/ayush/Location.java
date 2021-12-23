package com.ayush;

import java.util.HashMap;
import java.util.Map;

// this is an immutable class
public record Location(int locationId, String description,
                       Map<String, Integer> exits) {
    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        this.exits = new HashMap<String, Integer>(exits);

        this.exits.put("Q", 0);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
