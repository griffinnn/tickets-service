package com.pluralsight.springboot.tickets.events;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class EventController {

    private final OrganiserRepository organiserRepository;
    private final EventRepository eventRepository;
    private final ProductRepository productRepository;

    public EventController(OrganiserRepository organiserRepository, EventRepository eventRepository, ProductRepository productRepository) {
        this.organiserRepository = organiserRepository;
        this.eventRepository = eventRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/organisers")
    public List<Organiser> getOrganisers() {
        return organiserRepository.findAll();
    }

    @GetMapping("/events")
    public List<Event> getEventsByOrganiserId(@RequestParam("organiserId") int organiserId) {
        return eventRepository.findByOrganiserId(organiserId);
    }

    @GetMapping("/events/{id}")
    public Event getEventById(@PathVariable("id") int eventId) {
        return eventRepository.findById(eventId).orElseThrow(() -> new NoSuchElementException("Event with id " + eventId + " not found"));
    }

    @GetMapping("/products")
    public List<Product> getProductsByEventId(@RequestParam("eventId") int eventId) {
        return productRepository.findByEventId(eventId);
    }
}
