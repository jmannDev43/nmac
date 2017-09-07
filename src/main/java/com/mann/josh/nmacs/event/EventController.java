package com.mann.josh.nmacs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @RequestMapping("/events")
    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        eventService.getAllEvents().forEach(events::add);
        return events;
    }

    @RequestMapping("/events/{id}")
    public Event getEvent(@PathVariable String id) {
        return eventService.getEvent(id);
    }

    @RequestMapping("/events/year/{year}")
    public List<Event> getEventsByYear(@PathVariable Integer year) {
//        List<Event> events = new ArrayList<>();
//        eventService.getAllEvents().stream().filter(event -> event.getEventYear().equals(schoolYear)).forEach(events::add);
//        return events;
        return eventService.getEventsByYear(year);
    }

    @RequestMapping("/events/state/{state}")
    public List<Event> getEventsByState(@PathVariable String state) {
//        List<Event> events = new ArrayList<>();
//        eventService.getAllEvents().stream().filter(event -> event.getLocalState().equals(state)).forEach(events::add);
//        return events;
        return eventService.getEventsByState(state);
    }
}
