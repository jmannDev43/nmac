package com.mann.josh.nmacs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

//    private List<String> events = Arrays.asList(
//            "One", "Two", "Three"
//            );

    public List<Event> getAllEvents() {
        List<Event> events = new ArrayList<>();
        eventRepository.findAll().forEach(events::add);
        return events;
    }

    public Event getEvent(String id) {
        return eventRepository.findOne(id);
    }
}
