package com.mann.josh.nmacs.event;

import org.springframework.beans.factory.annotation.Autowired;
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
}
