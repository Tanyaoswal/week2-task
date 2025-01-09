package com.example.traveljournal.data;

public class TripEntry {
    private String id;
    private String tripId;
    private String description;
    private String photoUri;

    public TripEntry(String id, String tripId, String description, String photoUri) {
        this.id = id;
        this.tripId = tripId;
        this.description = description;
        this.photoUri = photoUri;
    }

   
}
