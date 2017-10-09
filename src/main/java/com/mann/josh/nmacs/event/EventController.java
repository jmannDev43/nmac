package com.mann.josh.nmacs.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventService eventService;

    @CrossOrigin(origins = "http://localhost:5001")
    @RequestMapping("/events/{id}")
    public Event getEvent(@PathVariable String id) {
        return eventService.getEvent(id);
    }

    @CrossOrigin(origins = "http://localhost:5001")
    @RequestMapping("/events/year/{year}/state/{state}")
    public List<Event> getEventsByState(@PathVariable Integer year, @PathVariable String state) {
        return eventService.getEventsByYearAndState(year, state);
    }

    @CrossOrigin(origins = "http://localhost:5001")
    @RequestMapping("/events/year/{year}/state/{state}/city/{city}")
    public List<Event> getEventsByStateAndCity(@PathVariable Integer year, @PathVariable String state, @PathVariable String city) {
        return eventService.getEventsByYearAndStateAndCity(year, state, city);
    }
}
