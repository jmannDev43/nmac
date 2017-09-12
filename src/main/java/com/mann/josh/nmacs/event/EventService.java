package com.mann.josh.nmacs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

//    public List<Event> getAllEvents() {
//        List<Event> events = new ArrayList<>();
//        eventRepository.findAll().forEach(events::add);
//        return events;
//    }

    public Event getEvent(String id) {
        return eventRepository.findOne(id);
    }

    public List<Event> getEventsByYearAndState(Integer year, String state) {
        return eventRepository.findByEventYearAndLocalState(year, state);
    }

    public List<Event> getEventsByYearAndStateAndCity(Integer year, String state, String city) {
        return eventRepository.findByEventYearAndLocalStateAndLocalCity(year, state, city);
    }
}
