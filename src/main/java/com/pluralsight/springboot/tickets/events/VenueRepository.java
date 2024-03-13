package com.pluralsight.springboot.tickets.events;

import java.util.List;
import java.util.Optional;

public class VenueRepository {

    private final List<Venue> venues = List.of(
            new Venue(201, "Globomatics Main Office", "Test Street 325", "New York", "USA"),
            new Venue(202, "The O2", "Peninsula Square", "London", "UK"));

    public Optional<Venue> findById(int id) {
        return venues.stream().filter(venue -> venue.id() == id).findAny();
    }

}
