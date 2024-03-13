package com.pluralsight.springboot.tickets.events;

import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class EventRepository {

    private final List<Event> events = List.of(
            new Event(1, "Java Conference",
                    new Organiser(1, "Java User Group", "Java Conference"),
                    new Venue(1, "Java Conference Venue", "Java Street", "Java City", "Java Country"),
                    LocalDate.of(2021, 10, 1), LocalDate.of(2021, 10, 3)),
            new Event(2, "Spring Conference",
                    new Organiser(2, "Spring User Group", "Spring Conference"),
                    new Venue(2, "Spring Conference Venue", "Spring Street", "Spring City", "Spring Country"),
                    LocalDate.of(2021, 11, 1), LocalDate.of(2021, 11, 3)),
            new Event(3, "Kotlin Conference",
                    new Organiser(3, "Kotlin User Group", "Kotlin Conference"),
                    new Venue(3, "Kotlin Conference Venue", "Kotlin Street", "Kotlin City", "Kotlin Country"),
                    LocalDate.of(2021, 12, 1), LocalDate.of(2021, 12, 3))
    );

    public List <Event> findByOrganiserId(int organiserId){
        return events.stream().filter(event -> event.organiser().id() == organiserId).toList();
    }

    public Optional<Event> findById(int id){
        return events.stream().filter(event -> event.id() == id).findAny();
    }
}
